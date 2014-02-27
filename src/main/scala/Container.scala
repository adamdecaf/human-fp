package org.decaf.humanfp

/**
  Container[C[_]] is a type that allows for wrapping of an inner type. This is
  often used to create multiple instances of subtypes that share a common supertype.
 */
@implicitNotFound("No Container[${C}] instance found, try importing or making a custom instance.")
trait Container[C[_]] {
  def pure[A](a: A): C[A]
  def map[A, B](f: A => B): C[B]
  def flatMap[A, B](f: A => C[B]): C[B]
}

// Monad
