package lsp.bad;

import java.util.Date;

public class Smartphone extends Product {
 
    @Override
    String setName() {
        return "Samsung S10+ Limited Edition";
    }
 
    @Override
    Date setExpiredDate() {
        
        // sebuah smartphone tidaklah mempunyai masa kedaluwarsa
        return new Date();
    }
}
