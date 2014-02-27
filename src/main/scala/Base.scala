package org.decaf.humanfp

/**
  Base[T] over a type is a value that when applied with operations over
  the type but doesn't change the answer. Thus for some operation `op`,
  and all values `v` of type T, op(v) == v
 */
@implicitNotFound("No Base[${T}] instance found, try importing or making your own instance.")
trait Base[T] {
  def base: T
}

object Base {
  def apply[T: Base]: T = implicitly[Base[T]].base
}

// Zero aka Identity
