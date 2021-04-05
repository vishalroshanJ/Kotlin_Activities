class University {
    var reader = Scanner(System.`in`)
    fun course() {
        print("Enter Course Name : ")
        var cname = reader.nextLine()
    }
    fun subject() {
        println("Enter Subject Details ")
        println("Subject Name : ")
        var sname: String = reader.next()
        println("Maximum Marks")
        var smax: Int = reader.nextInt()
        println("Minimum Passing Marks")
        var smin: Int = reader.nextInt()
    }
    var name : String = ""
    fun student( )  {
        println("Enter Student Details ")
        println("Student Name : ")
        name = reader.next()
        println("Student Mobile Number : ")
        var mobile: String = reader.next()
        println("Student Date Of Birth : ")
        var dob: String = reader.next()
        /*val sdf = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
        val currentDate = sdf.format(dob)
        */println("Student Address : ")
        val add: String = reader.nextLine()
    }
    fun s_marks() {
        val subjectName = arrayOf<String>("SDLC", "BASIC JAVA", "ADVANCED JAVA", "MYSQL", "KOTLIN")
        val scanner = Scanner(System.`in`)
        val marksArray = DoubleArray(5)
        println("Input Marks->")
        for (i in marksArray.indices) {
            print("${subjectName[i]} : ")
            marksArray[i] = scanner.nextDouble()
        }
        val total = marksArray.sum()
        val percentage = marksArray.average()
        println("Total of All subjects Marks : $total")
        println("Percentage : $percentage")
        when {
            percentage > 80 -> println("Grade : A")
            percentage > 60 -> println("Grade : B")
            percentage > 40 -> println("Grade : C")
            else -> println("Grade : D. $name failed")
        }
    }
}
    fun main(args:Array<String>)
    {
        var U = University()
        U.course()
        U.subject()
        U.student()
        U.s_marks()
    }
