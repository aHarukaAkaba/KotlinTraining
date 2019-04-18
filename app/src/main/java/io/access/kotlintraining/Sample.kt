package io.access.kotlintraining

import java.util.Random

fun welcome() {
    println("welcome to ACCESS!")
}

fun hello() {
    println("hello world")
}

fun fizzbuzz(i: Int) : String{
    return when {
        i % 15 == 0 -> "FizzBuzz"
        i % 3 == 0 -> "Fizz"
        i % 5 == 0 -> "Buzz"
        else -> i.toString()
    }
}

fun isLeapYear(year: Int): Boolean {
    if (year % 100 == 0 && year % 400 != 0) {
        return false
    }
    return year % 4 == 0

}

fun power(a: Int, n: Int): Long {
    if (a < 0 || n < 0) {
        println("inputs must be positive. return 0")
        return 0
    }
    var ans: Long = 1
    for (i in 0 until n) {
        ans *= a
    }
    return ans

}


fun Int.isOdd() = this % 2 != 0

fun Int.isEven() = this % 2 == 0

class Dice(private val n: Int) {

    private var limit = 100
    private val random = Random()

    fun roll() : Int {
        if (this.limit <= 0) {
            throw Exception("I was broken")
        }

        --this.limit
        return random.nextInt(n)

    }
}

class MyCustomClass {
    var counter: Int = 0
    var propertyWithCounter: Int = 0
        set(i) {
        ++counter
        field = i
    }
}

class NabeAtsu {
    private var counter = 0

    fun next(): String {
        this.counter += 1
        return if (this.counter % 3 == 0 || "3" in this.counter.toString()) {
            "Aho"
        }else {
            this.counter.toString()
        }


    }
}


fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    //clientとmassageがnullならリターン
    if (client == null || message == null) return
    val personalInfo = client.personalInfo
    val email = personalInfo?.email
    email?.let{mailer.sendMessage(it, message)}
}

// コンパイル通すための諸々
class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}

fun main(args: Array<String>) {
}
