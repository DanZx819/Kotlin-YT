package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println(NomeCompleto("Daniel", "Zanchetta"))
}


fun soma(a:Int, b:Int): Int{
    return a + b
}
fun NomeCompleto(nome:String, Sobrenome: String): String{
    return "$nome $Sobrenome"
}

//Sintaxe Função
// fun nome-da-função(ARGUMENTOS): tipo-de-dado {corpo da funçao}