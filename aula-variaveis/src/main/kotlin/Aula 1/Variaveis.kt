package org.example.`Aula 1`

fun main() {
    /*
    var idade = 18
    var sexo = 'F'
    var emancipado = false
    //println(idade > 17 && sexo=='F' || emancipado == true && sexo == 'F')

    var beber = true
    var dirigir = true

    println(beber xor dirigir)

     */


    /*
   println("Qual o seu salario: ")
   var salario = readln().toFloatOrNull() ?: 0F

   if(salario >= 1200.0F ){
        salario *= 1.2F
        println("Salario teve um aumento de 20% $salario")
    }else{
        salario *= 1.3F
        println("Salario teve um aumento de 30% $salario")
    }
    */

    println("Digite a sua média: ")

    val media = readln().toFloatOrNull() ?: 0F
//
//    if (media == 10F){
//        println("Parabens você foi aprovado com nota maxima!!!")
//    }else if(media >= 7F){
//        println("Parabens você foi aprovado!!!")
//    };else if(media >= 5 && media < 7){
//        println("Você ficou de recuperação !")
//    }else if(media > 0 && media < 5){
//        println("Você reprovou ;-;")
//    }else{
//        println("Você é muito burro cara :0")
//    }

    var resultado = when(media){
         10F -> "Parabens você foi aprovado com nota maxima!!!"
         in 7F ..9.99F -> "Parabens você foi aprovado!!!"
         in 5F .. 6.99F -> "Você ficou de recuperação !"
         in 0.01F ..  4.99F -> "Você reprovou ;-;"
         0F -> "Você é muito burro cara :0"
        else ->{
            "Você digitou uma média invalida"
        }

    }
    println(resultado)
}