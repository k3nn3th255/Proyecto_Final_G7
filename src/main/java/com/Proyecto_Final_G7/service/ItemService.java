/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Proyecto_Final_G7.service;

import com.Proyecto_Final_G7.domain.Item;
import java.util.ArrayList;
import java.util.List;

public interface ItemService {
    
    //Se usa para tener en memoria de acceso aleatorio. del carrito de compras 
    List<Item> listaItems = new ArrayList<>();
    
    public List<Item> gets();
    
    public Item get(Item item);
    
    public void delete(Item item);
    
    public void save(Item item);
    
    public void update(Item item);
    
    public void facturar();
    
}
