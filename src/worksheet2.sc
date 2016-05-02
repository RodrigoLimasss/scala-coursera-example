def sumInts(a: Int, b: Int): Int = {
  if(a > b) 0
  else {
    val fun = sumInts(a + 1, b)
    val sum =  a + fun
//    println(s"fun: ${fun} - ")
    println(s"sum: ${sum} - ")
    sum
  }
}

sumInts(10, 15)

def sum(f: Int => Int)(a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop(a + 1, f(a) + acc)
  }
  loop(a, 0)
}

def fun: (Int) => Int = x => x * x
sum(fun)(3, 5)


val name = List("Rodrigo", " Lima", " Cunha").mkString(",")

println(name)