import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private <Item> List<Item> items(Item... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

    @Test
    void EveryBranchStatementTest() {
        RuntimeException ex;
        //1
        //allItems list exception!
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 300));
        assertTrue(ex.getMessage().contains("allItems list can't be null!"));

        //2
        //set(check) Name, disc > 0 node enter, disc <= 0 node enter!
        Item item = new Item("", "11", 200, 0.75f);
        Item item1 = new Item("AMG", "11", 200, 0f);
        SILab2.checkCart(items(item,item1), 300);
        assertEquals("unknown", item.getName());
        assertFalse(SILab2.checkCart(items(item,item1), 300));

        //3
        //exception BarCode, Invalid character in BarCode!
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items(new Item("Table", "6446AB", 200, 0.75f)), 300));
        assertEquals(ex.getMessage(), "Invalid character in item barcode!");

        //4
        //exception BarCode (NO BarCode)!
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items(new Item("Table", null, 200, 0.75f)), 300));
        assertEquals(ex.getMessage(), "No barcode!");

        //5
        //(Node 21 enter + payment > allItems.sum())
        item = new Item("Table", "01122", 500, 0.80f);
        SILab2.checkCart(items(item), 1000);
        assertTrue(item.discount > 0);
        assertTrue(item.getBarcode().startsWith("0"));
        assertTrue(item.price > 300);
        assertTrue(SILab2.checkCart(items(item), 1000));
    }

    @Test
    void MultipleConditionTest() {
        //1
        //item.getName() == null || item.getName().length() == 0
        //T || X
        Item item = new Item(null, "1111", 200, 0.75f);
        SILab2.checkCart(items(item), 300);
        assertEquals("unknown", item.getName());
        //F || T
        item = new Item("", "1111", 200, 0.75f);
        SILab2.checkCart(items(item), 300);
        assertEquals("unknown", item.getName());
        //F || F
        item = new Item("C63", "1111", 200, 0.75f);
        SILab2.checkCart(items(item), 300);
        assertEquals("C63", item.getName());

        //2
        //item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0'
        //T && T && T
        //allItems [new Item("C63", "0111", 400, 0.75f)]
        item = new Item("C63", "0011", 400, 0.75f);
        assertTrue(SILab2.checkCart(items(item), 400));
        //T && T && F
        //allItems [new Item("C63", "1111", 400, 0.75f)]
        item = new Item("C63", "1111", 400, 0.75f);
        assertFalse(SILab2.checkCart(items(item), 200));
        //T && F && X
        //allItems [new Item("C63", "1111", 400, 0f)]
        item = new Item("C63", "1111", 400, 0f);
        assertFalse(SILab2.checkCart(items(item), 300));
        //F && X && X
        //allItems [new Item("C63, "1111", 200, 0.75f)]
        item = new Item("C63", "1111", 200, 0.75f);
        assertTrue(SILab2.checkCart(items(item), 300));
    }
}