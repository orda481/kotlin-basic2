package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println ("Введите строку: ")
    val text = readln()
    if (text.isEmpty()){
        println("Ошмбка! Введите строку!")
        return
    }
    for (code in 0 until 255){
        val element = code.toChar()
        var count = 0
        for (char in text){
            if (char == element){
                count++
            }
        }
        if (count > 0){
            println("$element - $count")
        }
    }
}