/*
 * Copyright (c) 2019 Simer Plaha (@simerplaha)
 *
 * This file is a part of SwayDB.
 *
 * SwayDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * SwayDB is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with SwayDB. If not, see <https://www.gnu.org/licenses/>.
 */

package swaydb

import swaydb.data.Reserve

trait ErrorHandler[-E] {
  def toException(e: E): Throwable
  def fromException[F <: E](e: Throwable): F
  def reserve(e: E): Option[Reserve[Unit]]
}

object ErrorHandler {
  def toException[E](error: E)(implicit errorHandler: ErrorHandler[E]): Throwable =
    errorHandler.toException(error)

  def fromException[E](exception: Throwable)(implicit errorHandler: ErrorHandler[E]): E =
    errorHandler.fromException(exception)

  def shouldRecover[E](e: E)(implicit errorHandler: ErrorHandler[E]): Option[Reserve[Unit]] =
    try
      errorHandler.reserve(e)
    catch {
      case exception: Throwable =>
        //todo - log this instead.
        exception.printStackTrace()
        None
    }

  object Nothing extends ErrorHandler[Nothing] {
    override def toException(e: Nothing): Throwable = new Exception("Nothing value.")
    override def fromException[F <: Nothing](e: Throwable): F = throw new Exception("Exception cannot be created from Nothing.")
    override def reserve(e: Nothing): Option[Reserve[Unit]] = None
  }

  implicit object Throwable extends ErrorHandler[Throwable] {
    override def toException(e: Throwable): Throwable = e
    override def fromException[F <: Throwable](e: Throwable): F = e.asInstanceOf[F]
    override def reserve(e: Throwable): Option[Reserve[Unit]] = None
  }

}
