import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by dylangrald on 7/3/15.
 */
class FizzBuzzCalculatorSpec extends FlatSpec with Matchers {

  val fizzBuzzCalculator = FizzBuzzCalculator()

  "The fizz buzz calculator" should "return 'Fizz' for all numbers that are divisible by 3 and not 5" in {
    val numbersDivisibleBy3ButNot5 = (1 to 100).filter(num => num % 3 == 0 && num % 5 != 0)
    numbersDivisibleBy3ButNot5.foreach(num => assert(fizzBuzzCalculator.fizzBuzzValue(num) == "Fizz"))
  }

  it should "return 'Buzz' for all numbers that are divisible by 5 and not 3" in {
    val numbersDivisibleBy5ButNot3 = (1 to 100).filter(num => num % 5 == 0 && num % 3 != 0)
    numbersDivisibleBy5ButNot3.foreach(num => assert(fizzBuzzCalculator.fizzBuzzValue(num) == "Buzz"))
  }

  it should "return 'FizzBuzz' for all numbers that are divisible by 5 and 3" in {
    val numbersDivisibleBy3And5 = (1 to 100).filter(num => num % 5 == 0 && num % 3 == 0)
    numbersDivisibleBy3And5.foreach(num => assert(fizzBuzzCalculator.fizzBuzzValue(num) == "FizzBuzz"))
  }
}
