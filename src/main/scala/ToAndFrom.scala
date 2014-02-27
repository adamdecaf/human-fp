package org.decaf.humanfp

/**
 To[T] is a type which allows for a conversion between T and another type F.
 */
@implicitNotFound("No To[${T}] instance found, try importing or making a custom instance.")
trait To[T] {
  def convertTo[F](from: F): T
}

/**

 */
@implicitNotFound("No From[${F}] instance found, try importing or making a custom instance.")
trait From[F] {
  def convertFrom[T](to: T): F
}

/**

 */
@implicitNotFound("No ToAndFrom[${F}, ${T}] instance found, try importing or making a custom instance.")
trait ToAndFrom[F, T] extends To[T] with From[F]

// Bijection
