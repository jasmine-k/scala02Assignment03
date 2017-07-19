package com.knoldus.kip.assignment.ds

class LowerBound[+T](
                   private val leading: List[T],
                   private val trailing: List[T]
                   ) {
  override def toString = (leading:::trailing.reverse).toString

  def enqueue[U >: T](x : U): LowerBound[U] =
    new LowerBound(leading, x :: trailing)

}

object LowerBoundApplication extends App{

  val bird1 = new Bird
  val bird2 = new Bird
  val bird3 = new Bird
  val birdLower: LowerBound[Bird] = new LowerBound[Bird](List(bird1,bird2,bird3), Nil)

  val enqueueAnimal = birdLower.enqueue(new Animals)
  val enqueueCrow: LowerBound[Bird] = birdLower.enqueue(new Crow)

}