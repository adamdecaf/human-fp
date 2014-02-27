package org.decaf.humanfp

/**
  Extract[E] is a type very similar to Container[C[_]] except that it works the other way.
  Returning a Container instance.
 */
@implicitNotFound("No Extract[${E}] instance found, try importing or making a custom instance.")
trait Extract[E] {
  def extract[B, C[B]](item: E): Container[C]
}

// Comonad
