package com.example.myapplication

import com.example.myapplication.model.Pedido
import com.example.myapplication.model.Produto
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class PedidoUnitTest {
    @Test
    fun calcularValorTotalComSucesso() {
        var pedido = Pedido()
        pedido.add(Produto(1,"celular",700.0))
        pedido.add(Produto(2,"tablet",930.0))
        pedido.add(Produto(3,"mouse",70.0))
        pedido.frete = 10.0
        val valorEsperado = 1710.0

        assertEquals(valorEsperado, pedido.getValorTotal(),0.0)
    }

    @Test(expected = Exception::class)
    fun calcularValorTotalComErroQuantProdutoZero() {
        var pedido = Pedido()
        //try{
            var valor = pedido.getValorTotal()
        //    fail("Deveria gerar exceção com quantidade de produtos")
        //} catch(ex: Exceptiosn){
        //    Assert.assertNotNull(ex)
        //}
    }

    @Test
    fun calcularQuantidadeComSucesso(){
        var pedido = Pedido()
        pedido.add(Produto(1,"celular",700.0))
        pedido.add(Produto(2,"tablet",930.0))
        pedido.add(Produto(3,"mouse",70.0))

        val quantidadeEsperada = 3

        assertEquals(quantidadeEsperada, pedido.getQuantidade())
    }
}
