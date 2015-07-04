import java.io.Writer

import org.scalatest.mock.MockitoSugar
import org.scalatest.{Matchers, FlatSpec}
import org.mockito.Mockito._
import org.mockito.Matchers.anyInt

/**
 * Created by dylangrald on 7/3/15.
 */
class FizzBuzzGameSpec extends FlatSpec with Matchers with MockitoSugar {

  "The game" should "write the FizzBuzz values to the writer" in {
    val fizzBuzzCalculatorMock = mock[FizzBuzzCalculator]
    when(fizzBuzzCalculatorMock.fizzBuzzValue(anyInt())).thenReturn("Fizz")

    val writerMock = mock[Writer]

    val fizzBuzzGame = FizzBuzzGame(fizzBuzzCalculatorMock, writerMock)
    fizzBuzzGame.playFizzBuzz(1, 100)

    verify(writerMock, times(100)).write("Fizz\n")
    verify(writerMock, times(1)).flush()
  }
}
