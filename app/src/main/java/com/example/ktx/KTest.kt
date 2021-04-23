package com.example.ktx

/**
 * @author : Administrator
 * e-mail : kiwilss@163.com
 * time   : 2021/04/22
 *  desc   :
 */
class KTest {


}

fun personTest() {
    val person = Person("alice", 20, "alice is 20")
    person.let {
        it.age
    }
    println(person.age.div(2))

    person.run {
        name
    }

    person.also {

    }

    person.apply {

    }

    with(person) {

    }
}

fun numberTest() {
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    numbers.map {
        it.length
    }.filter {
        it > 3
    }.let {
        println(it)
    }
}

fun main() {


}