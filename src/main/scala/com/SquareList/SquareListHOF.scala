package com.SquareList

object SquareListHOF extends App {

  def squareList(xs: List[Int]): List[Int] = xs match {
      case List() => Nil
      case y :: ys => y*y :: squareList(ys)
    }
  def mapSquareList(xs: List[Int]): List[Int] = xs.map(x => x*x)

  println(squareList(List(7,8,6)))
  println(mapSquareList(List(2,3,4)))
}
