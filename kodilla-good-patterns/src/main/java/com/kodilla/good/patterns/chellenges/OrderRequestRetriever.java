package com.kodilla.good.patterns.chellenges;

import java.time.LocalDate;

public class OrderRequestRetriever {
   public OrderRequest retrieve() {
       return new OrderRequest(new User("Ania" , "Nowak"), LocalDate.now(), "address");
   }
}
