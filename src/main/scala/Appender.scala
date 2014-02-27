package org.decaf.humanfp

/**
 Appender[A] is a type that allows you to combine multiple instances of A together.
 */
@implicitNotFound("No Appender[${A}] instance found, try importing or making a custom instance.")
trait Appender[A] {
  def append(x: A, y: A): A
}

// Semigroup
