package com.knoldus.kip.assignment.ds

class InVariant[T](
                    private val leading: List[T],
                    private val trailing: List[T]
                  ) {
  override def toString = (leading ::: trailing.reverse).toString

}
trait InVariantApplication {

  val dc1: InVariant[Bird] = new InVariant[Bird](List(new Bird {}), Nil)
  val dc2: InVariant[Parrot] = new InVariant[Parrot](List(new Parrot {}), Nil)
  val dcSame: InVariant[Bird] = dc1 // Works
  /*
  val dcSuper : InVariant[Parrot] = dc1 //Doesn't Work
  val dcSub : ContraVariant[Bird] = dc2 // Doesn't Work
*/
}