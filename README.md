# ScalaAssign-11


Consider a function that squares all elements of a list and returns a list with the results. Complete the following two equivalent definitions of
squareList



def squareList(xs: List[Int]): List[Int] =
 xs match {
   case List() => ??
   case y :: ys => ??
}


def squareList(xs: List[Int]): List[Int] =
xs map ??
