package com.knoldus.kip.assignment.ds


class CoVariant[+T](
                     private val leading: List[T],
                     private val trailing: List[T]
                   ) {
  override def toString = (leading ::: trailing.reverse).toString

}
  trait CoVariantApplication {

  val dc1 : CoVariant[Bird] = new CoVariant[Bird](List(new Bird{}),Nil)
  val dc2 : CoVariant[Parrot] = new CoVariant[Parrot](List(new Parrot{}),Nil)
  val dcSame : CoVariant[Bird] = dc1 // Works
  val dcSub : CoVariant[Bird] = dc2 // Works

  /*
  val dcSuper : CoVariant[Parrot] = dc1 //Does't Work
   */
}