import java.util.*

fun main() {
    // строчные
    /*
    Многострочные
     */
    println("Hello World!")
    // val или var
    val a = 100 // value - immutable
   // a = 200
    var b = 200 // variable - mutable
    b = 300
    println(a)

    val a1: Byte = -10
    val b1: Short = 45
    var c1: Int = -250
    val d1: Long = 3000L

    val h: Double = 4.5
    val f: Float = 4.5F

    val flag: Boolean = true
    val ch: Char = 'A'
    val name: String = "Ivan"
    val secondname: String  = "Ivanov"

    println("$name $secondname")
    c1 = d1.toInt()
    c1 = h.toInt()
    println(c1::class)

    val x1 = 11
    val y1 = 5
    val z1 = x1/y1 // 2

    val x2 = 11
    val y2 = 5.0
    val z2 = x2/y2 // 2.2

    // % - остаток от деления

    var w1 = 5     // 6
    var w2 = ++w1   //  6

    var w3 = 5       // 6
    var w4 = w3++    // 5

    val scanner = Scanner(System.`in`)
    val x = scanner.nextInt()

    val v = readLine()?.toInt()
    val v1 = readln().toInt()
    val (o,p) = readln().split(" ").map { it.toInt() }

    var str: String = "abc"
    str = null

    var str2: String? = "abc"
    str2 = null
    //val l = if(str2 != null) str2.length else -1
    println(str2?.length) // ?. - оператор безопасного вызова

    val l = str2?.length ?: -1 // elvis expression

    val g = 10
    if(g == 10) {
        println()
    } else if( g> 10) {

    } else {

    }
    val s1 = 10
    val p1 = 20
    val result = if(s1>p1) {
        println("s1 = $s1")
        s1
    } else {
        println("p1 = $p1")
        p1
    }

    // > < != == and or
    // тип логической операции in

    var q = 5
    var r1 = q in 1..6 // [1,6] true
    var r2 = q in 10 downTo 1    // true or false

    when(flag) {
        false -> println()
        true -> println()
        else -> {
            println()
            q++
        }
    }
    val mm = 10
    when(mm) {
        10,20,30 -> println("Or")
        else -> println()
    }
    when(mm) {
        in 10..19 -> println()
        in 20..29 -> println()
        !in 10..20 -> println()
    }
    val j = 10
    val i = 5
    val r = 3
    when(j+r) {
        i-r -> println("i-r")
        i+5 -> println()
    }
    val sum = 1000
    val rate = when(sum) {
        in 100..999 -> 10
        in 1000..10000 -> 20
        else -> 30
    }

    var k1 = 15
    var k2 = 6
    when (val kk = k1+k2){
        60 -> { //
        //
        }
        50 -> {

        }
    }

}