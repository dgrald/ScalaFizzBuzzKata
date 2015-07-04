/**
 * Created by dylangrald on 7/3/15.
 */
abstract class FizzBuzzCalculator {
  def fizzBuzzValue(i: Int): String
}

object FizzBuzzCalculator {
  def apply(): FizzBuzzCalculator = {
    new FizzBuzzCalculatorImplementation()
  }
}

private class FizzBuzzCalculatorImplementation extends FizzBuzzCalculator{
  override def fizzBuzzValue(i: Int): String = {
    val isMultipleOf3 = i % 3 == 0
    val isMultipleOf5 = i % 5 == 0

    if(isMultipleOf3 && isMultipleOf5) {
      "FizzBuzz"
    } else if (isMultipleOf3) {
      "Fizz"
    } else if (isMultipleOf5) {
      "Buzz"
    } else {
      i.toString
    }
  }
}
