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
    
//    var tentativas = 0
//    var senha = "123"

//    while (tentativas < 3){
//        println("Digite a sua senha: ")
//        var senhadig = readln() ?: ""
//        if(senhadig.equals(senha)){
//            println("Acesso liberado!")
//            break
//        }else{
//            println("Senha ou usuario inválido.")
//            tentativas++
//        }
//        if(tentativas == 3){
//            println("Usuario bloqueado, procure a sua agência.")
//        }
//
//    }
//    do{
//
//        println("Digite a sua senha: ")
//        var senhadig = readln() ?: ""
//        if(senhadig.equals(senha)){
//            println("Acesso liberado!")
//            break
//        }else{
//            println("Senha ou usuario inválido.")
//            tentativas++
//        }
//        if(tentativas == 3){
//            println("Usuario bloqueado, procure a sua agência.")
//        }
//
//    }while(tentativas < 3)

    //Simulação de Caixa eletrônico

    /*
        do-while
        if-else
        when
        saque - 1
        deposito 2
        sair - 0
    */




    var dinheiro = 1200
    var dinheiro_banco = 200

    do {
        println("Saque - 1")
        println("Deposito - 2")
        println("Consultar saldo - 3")
        println("Sair - 0")
        var opcao = readln().toIntOrNull() ?: 0

        if (opcao == 1){
            println("Você pode sacar até R$$dinheiro_banco")
            println("Você quer sacar ? 1[S] 2[N]")
            var escolha = readln().toIntOrNull() ?: 0
            if(escolha == 1){
                println("Quanto você quer sacar ?")
                var saque = readln().toIntOrNull() ?: 0
                if(saque > dinheiro_banco){
                    println("Você não pode sacar mais do que tem.")
                }else{
                    dinheiro_banco = dinheiro_banco - saque
                    dinheiro = dinheiro + saque
                    println("Você sacou R$$saque e agora tem $dinheiro")

                }
            }
        }

        if(opcao == 2) {
            println("Você pode depositar até $dinheiro")
            println("Você quer depositar ? 1[S] 2[N]")
            var escolha = readln().toIntOrNull() ?: 0
            if (escolha == 1) {
                println("Você pode depositar até R$$dinheiro")
                var deposito = readln().toIntOrNull() ?: 0
                if (deposito > dinheiro) {
                    println("Você não pode depositar mais do que tem.")

                } else {
                    dinheiro_banco = dinheiro_banco + deposito
                    dinheiro = dinheiro - deposito
                    println("Você depositou R$$deposito e agora tem $dinheiro_banco no banco !")

                }
            }
        }
        if(opcao == 0){
            println("Você saiu !!!")
        }
        if (opcao == 3){
            println("Você possui um saldo de R$$dinheiro_banco no banco e R$$dinheiro em mãos")
        }
    }while (opcao != 0)
}