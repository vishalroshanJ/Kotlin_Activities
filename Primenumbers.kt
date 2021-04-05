fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("First N prime numbers : ")
    var a = reader.nextInt()
    var flag:Int
    var i : Int
    for (i in 1..a) {
        // condition for nonprime number
        if (i == 1 || i == 0)
        {
            continue
        }
        flag = 1
        for (j in 2..i / 2)
        {
            if (i % j == 0)
            {
                flag = 0
                break
            }
        }
        if (flag == 1) {
            println(i)
        }
    }
}
