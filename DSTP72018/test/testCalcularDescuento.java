/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dstp7.model.DiaSemana;
import dstp7.model.Negocio;
import dstp7.model.Producto;
import dstp7.model.Venta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mauricio
 */
public class testCalcularDescuento {
    private Venta v;
    
    public testCalcularDescuento() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        Negocio.Iniciar();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        v = new Venta();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void comprobarRealizarDescuentoRegla1_1() {
        //Definición
        double esperado = (28*2 + 50*2) * 0.5d;
        double resultado;     
        v.AgregarDetalle(Negocio.Productos()[0], 6);
        v.AgregarDetalle(Negocio.Productos()[6], 6);  
        //Ejecución
        v.CalcularDescuentos(DiaSemana.Lunes);
        resultado = v.Descuento();
        //Comprobación
        assertEquals(esperado, resultado, 0.00);
    }   
    
    @Test
    public void comprobarRealizarDescuentoRegla1_2() {
        //Definición
        double esperado = (28 + 50) * 0.5d;
        double resultado;     
        v.AgregarDetalle(Negocio.Productos()[0], 2);
        v.AgregarDetalle(Negocio.Productos()[6], 2);  
        //Ejecución
        v.CalcularDescuentos(DiaSemana.Lunes);
        resultado = v.Descuento();
        //Comprobación
        assertEquals(esperado, resultado, 0.00);
    }
    
    @Test
    public void comprobarRealizarDescuentoRegla2_1() {
        //Definición
        double esperado = (30*2 + 50*10) * 0.03d;
        double resultado;     
        v.AgregarDetalle(Negocio.Productos()[0], 10);
        v.AgregarDetalle(Negocio.Productos()[1], 2);  
        //Ejecución
        v.CalcularDescuentos(DiaSemana.Martes);
        resultado = v.Descuento();
        //Comprobación
        assertEquals(esperado, resultado, 0.00);
    }
    
    @Test
    public void comprobarRealizarDescuentoRegla2_2() {
        //Definición
        double esperado = (50*50) * 0.05d;
        double resultado;     
        v.AgregarDetalle(Negocio.Productos()[0], 50);
        //Ejecución
        v.CalcularDescuentos(DiaSemana.Miercoles);
        resultado = v.Descuento();
        //Comprobación
        assertEquals(esperado, resultado, 0.00);
    }
    
    @Test
    public void comprobarRealizarDescuentoRegla3_1() {
        //Definición
        double esperado = (80*4) * 0.3d;
        double resultado;     
        v.AgregarDetalle(Negocio.Productos()[4], 5);
         //Ejecución
        v.CalcularDescuentos(DiaSemana.Jueves);
        resultado = v.Descuento();
        //Comprobación
        assertEquals(esperado, resultado, 0.00);
    }
    
    @Test
    public void comprobarRealizarDescuentoRegla3_2() {
        //Definición
        double esperado = (80*4+30*2) * 0.3d;
        double resultado;     
        v.AgregarDetalle(Negocio.Productos()[4], 10);
        v.AgregarDetalle(Negocio.Productos()[1], 3);
        //Ejecución
        v.CalcularDescuentos(DiaSemana.Jueves);
        resultado = v.Descuento();
        //Comprobación
        assertEquals(esperado, resultado, 0.00);
    }
    
    @Test
    public void comprobarRealizarDescuentoRegla4_1() {
        //Definición
        double esperado = (80*10+30*10) * 0.1d;
        double resultado;     
        v.AgregarDetalle(Negocio.Productos()[4], 10);
        v.AgregarDetalle(Negocio.Productos()[1], 10);
        v.AgregarDetalle(Negocio.Productos()[0], 3);
        v.AgregarDetalle(Negocio.Productos()[3], 1);
        //Ejecución
        v.CalcularDescuentos(DiaSemana.Viernes);
        resultado = v.Descuento();
        //Comprobación
        assertEquals(esperado, resultado, 0.00);
    }
    
    @Test
    public void comprobarRealizarDescuentoRegla4_2() {
        //Definición
        double esperado = (80*10+30*10+15*4) * 0.1d;
        double resultado;     
        v.AgregarDetalle(Negocio.Productos()[4], 10);
        v.AgregarDetalle(Negocio.Productos()[1], 10);
        v.AgregarDetalle(Negocio.Productos()[0], 3);
        v.AgregarDetalle(Negocio.Productos()[3], 1);
        v.AgregarDetalle(Negocio.Productos()[5], 4);
        //Ejecución
        v.CalcularDescuentos(DiaSemana.Sabado);
        resultado = v.Descuento();
        //Comprobación
        assertEquals(esperado, resultado, 0.00);
    }
    
    
    
    
}
