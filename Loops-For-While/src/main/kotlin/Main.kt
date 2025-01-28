package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//  for (i in 1 ..  10){
//      if(i == 4){
//          break
//      }
//      println(i)
//  }
//    var x: Int = 0
//    while(true){
//        if(x < 10){
//            x++
//            println(x)
//        }else{
//            break
//        }
//
//    }
    
    var tentativas = 0
    var senha = "123"

    while (tentativas < 3){
        println("Digite a sua senha: ")
        var senhadig = readln() ?: ""
        if(senhadig.equals(senha)){
            println("Acesso liberado!")
            break
        }else{
            println("Senha ou usuario inválido.")
            tentativas++
        }
        if(tentativas == 3){
            println("Usuario bloqueado, procure a sua agência.")
        }

    }

}