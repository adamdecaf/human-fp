package org.decaf.humanfp
package syntax

package container {
  class ContainerSyntax[C[_], CC <: Container[C]](val cont: CC) extends AnyVal {
    def mapTo[A, B](implicit f: ToAndFrom[A, B]) = cont.map(f.convertTo)
  }
}
