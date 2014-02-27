package org.decaf.humanfp

/**
  Accumulator[A] is a type that allows you to accumulate items of a similar type A into some result type B.
  It does so by requiring a Base[A] and a function which takes elements of A one at a time and accumulates
  them together.
 */
@implicitNotFound("No Accumulator[${A}] instance found, try importing or making your own instance.")
trait Accumulator[A] {
  final def fold[B](obj: A)(f: (B, A) => B)(implicit b: Base[B]): B =
    fold(obj, b.base)(f)

  def fold[B](obj: A, base: => B)(f: (B, A) => B): B
}

// Foldable
