package lsp.bad;

import java.util.Date;

public class Vegetable extends Product {
 
    @Override
    String setName() {
        return "Broccoli";
    }
 
    @Override
    Date setExpiredDate() {
        return new Date();
    }
}
