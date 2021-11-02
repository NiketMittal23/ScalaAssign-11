import com.SquareList.SquareListHOF
import org.scalatest.funsuite.AnyFunSuite

class TestSquareList extends AnyFunSuite{

  test("check if the list is perfect square"){
    assert(SquareListHOF.squareList(List(1,2,3)) == List(1,4,9) )
  }

  test("check the list with the help of HOF map square list method"){
    assert(SquareListHOF.mapSquareList(List(1,2)) == List(1,4))
  }

}
