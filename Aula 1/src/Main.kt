package app

import app.Vitrine.XPTO
import Vitrine.Produto as vit
import Carrinho.Produto as car

fun main(){
    val cadProdutoVitrine = vit(codigo = 1, descricao = "Monitor", preco = 850.0)
    val cadProdutoCarrinho = car(id = 1, valor = 850.0, qtd = 5 )
    val xpto = XPTO()


}