package org.decaf.humanfp

/**
 Equal[E] is a type which will allow type-safe equality across two instances of the same type.
 */
@implicitNotFound("No Equal[${E}] instance found, try importing or making your own instance.")
trait Equal[E] {
  def isEqual(x: E, y: E): Boolean
}
