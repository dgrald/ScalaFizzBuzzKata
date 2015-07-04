import java.io.{BufferedWriter, OutputStreamWriter, Writer}

/**
 * Created by dylangrald on 7/3/15.
 */
abstract class FizzBuzzGame {
  def playFizzBuzz(lower: Int, upper: Int): Unit
}

object FizzBuzzGame {
  def apply(): FizzBuzzGame = {
    apply(FizzBuzzCalculator(), new BufferedWriter(new OutputStreamWriter(System.out)))
  }

  def apply(fizzBuzzCalculator: FizzBuzzCalculator, writer: Writer): FizzBuzzGame = {
    new FizzBuzzGameImplementation(fizzBuzzCalculator, writer)
  }
}

private class FizzBuzzGameImplementation(fizzBuzzCalculator: FizzBuzzCalculator, writer: Writer) extends FizzBuzzGame {

  override def playFizzBuzz(lower: Int, upper: Int): Unit = {
    (lower to upper).foreach(num => writer.write(s"${fizzBuzzCalculator.fizzBuzzValue(num)}\n"))
    writer.flush()
  }

}