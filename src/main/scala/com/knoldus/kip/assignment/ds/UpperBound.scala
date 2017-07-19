package com.knoldus.kip.assignment.ds

class UperBound[T](
                     private val leading: List[T],
                     private val trailing: List[T]
                   ) {
  override def toString = (leading:::trailing.reverse).toString

  def enqueue[U >: T](x : T): UperBound[T] =
    new UperBound(leading, x :: trailing)

}

object UperBoundApplication extends App{

  val bird1 = new Bird
  val bird2 = new Bird
  val bird3 = new Bird
  val birdLower: UperBound[Bird] = new UperBound[Bird](List(bird1,bird2,bird3), Nil)

  val enqueueCrow = birdLower.enqueue(new Crow) // works

 // val enqueueAnimal = birdLower.enqueue(new Animals)//does not work
}