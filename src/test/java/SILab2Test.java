import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    void testEveryBranch(){
        RuntimeException ex;
        ex=assertThrows(RuntimeException.class,()->SILab2.checkCart(null,100));
        assertTrue(ex.getMessage().contains("allItems list can't be null!"));

        List<Item>lista= Arrays.asList(new Item(null,"0234",350, 0.2F));
        assertTrue(SILab2.checkCart(lista,300));

        lista= Arrays.asList(new Item("cola","1234",100, 0));
        assertTrue(!SILab2.checkCart(lista,50));

        List<Item>lista2= Arrays.asList(new Item("cola",null,100, 0.1F));
        ex=assertThrows(RuntimeException.class,()->SILab2.checkCart(lista2,50));
        assertTrue(ex.getMessage().contains("No barcode!"));

        List<Item>lista3= Arrays.asList(new Item("cola","12$45",100, 0));
        ex=assertThrows(RuntimeException.class,()->SILab2.checkCart(lista3,50));
        assertTrue(ex.getMessage().contains("Invalid character in item barcode!"));
    }

    @Test
    void multipleConditions(){
        List<Item>lista= Arrays.asList(new Item("cola","123",250, 0.1F));
        assertFalse(SILab2.checkCart(lista,10));

        lista= Arrays.asList(new Item("cola","123",350, 0));
        assertFalse(SILab2.checkCart(lista,200));

        lista= Arrays.asList(new Item("cola","123",350, 0.5F));
        assertFalse(SILab2.checkCart(lista,100));

        lista= Arrays.asList(new Item("cola","0123",350, 0.1F));
        assertTrue(SILab2.checkCart(lista,250));
    }
}
