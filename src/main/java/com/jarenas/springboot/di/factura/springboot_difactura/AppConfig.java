package com.jarenas.springboot.di.factura.springboot_difactura;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.jarenas.springboot.di.factura.springboot_difactura.models.Item;
import com.jarenas.springboot.di.factura.springboot_difactura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {

    @Bean
    @Primary
    List<Item> itemsInvoice(){
        Product p1 = new Product("Camara Sony", 800);
        Product p2 = new Product("Bicicleta GW", 1800);
        Product p3 = new Product("Samsung Galaxy A25", 750);
        Product p4 = new Product("Monitor Hp 24", 960);

        return Arrays.asList(new Item(p1,2),new Item(p2,1),new Item(p3,3),new Item(p4,1));
    }

    @Bean
    List<Item> itemsInvoiceOficina(){
        Product p1 = new Product("Monitor", 800);
        Product p2 = new Product("Teclado y mouse", 1800);
        Product p3 = new Product("Silla empresarial", 750);
        Product p4 = new Product("Impresora", 960);

        return Arrays.asList(new Item(p1,2),new Item(p2,1),new Item(p3,3),new Item(p4,1));
    }


}
