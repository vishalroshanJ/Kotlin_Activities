fun main(args:Array<String>)
{
    var prv=0
    var pre=1
    var trm :Int
    var i:Int
    val reader = Scanner(System.`in`)
    println("Input number of terms to  display : ")
    var n = reader.nextInt()
    println("Here is the Fibonacci series upto  to $n terms : ")
    println(prv)
    println(pre)
    for(i in 3..n)
    {
        trm=prv+pre
        println(trm)
        prv=pre
        pre=trm
    }
}
