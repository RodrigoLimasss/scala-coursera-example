object Sheet {
    println("Hi, I am test this functionality ")
     val i: Int = 1
     def multiple(x: Int): Int = {
       x + 1
     }

    def sum(xs: List[Int]): Int = {
      if (xs.isEmpty) 0
      else xs.head + sum(xs.tail)
    }

    def max(xs: List[Int]): Int = {
      def maxAccum(xs2: List[Int], max: Int): Int = {
        if (xs2.isEmpty) 0
        else {
          val newMax = if (xs2.head > max) xs2.head else max
          if (xs2.length > 1) maxAccum(xs2.tail, newMax) else newMax
        }
      }
      maxAccum(xs, 0)
    }

    val list = List(10, 5, 33, 6, 20)
    sum(list)
    max(list)
    //multiple(i)

    //def loop: Boolean = loop
    def fun(x: Int, y: Int) = println(x)
    fun(1 + 3, 2)
    def and(x: Boolean, y: Boolean): Boolean = if (x) y else false
    println(and(true, false))
    println(and(true, true))
    println(and(false, true))
    println(and(false, false))

    def abs(x: Double) = if(x < 0) -x else x
    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)
    def isGoodEnough(guess: Double, x: Double) =
      abs(guess * guess - x) < 0.001
    def improve(guess: Double, x: Double) =
      (guess + x / guess) / 2
    def sqrt(x: Double) = sqrtIter(1.0, x)

  val res = sqrt(10)
  println(res)

  /*MDC - Maior divisor comum entre dois numeros*/
  def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

  println(gcd(132, 187))

}

