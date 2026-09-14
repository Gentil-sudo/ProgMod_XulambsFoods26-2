import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PizzaTest {

    Pizza pizza;

    @BeforeEach 
    public void init(){
        pizza = new Pizza();
        pizza.adicionarIngredientes(4);
    }

    @Test
    public void adicionaIngredientesCorretamente(){

        int quantos = pizza.adicionarIngredientes(4);

        //Assert
        assertEquals(8, quantos);
    }

    @Test
    public void calculaValorDaPizzaCorretamente(){
        //Act
        double valor = pizza.valorFinal();

        assertEquals(49d, valor, 0.01);
    }

    @Test
    public void cupomContemOsDadosCorretos(){

        //Act
        String cupom = pizza.gerarCupom();
        //Assert
        assertTrue(
            cupom.contains("4 ingredientes") &&
            cupom.contains("29,00") &&
            cupom.contains("20,00") &&
            cupom.contains("49,00")
        );
    }
    
}
