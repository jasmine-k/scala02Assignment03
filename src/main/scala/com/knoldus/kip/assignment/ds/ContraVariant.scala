package com.knoldus.kip.assignment.ds

class ContraVariant[-T]

trait ContraVariantApplication {

  val dc1: ContraVariant[Bird] = new ContraVariant[Bird]()
  val dc2: ContraVariant[Parrot] = new ContraVariant[Parrot]()
  val dcSame: ContraVariant[Bird] = dc1 // Works
  val dcSuper: ContraVariant[Parrot] = dc1 //Works

  /*
  val dcSub : ContraVariant[Bird] = dc2 // Doesn't Work
  */
}
