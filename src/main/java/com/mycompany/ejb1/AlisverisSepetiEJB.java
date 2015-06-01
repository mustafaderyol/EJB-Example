/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejb1;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author MstfDryl
 */
@Stateful
//@StatefulTimeout(unit= TimeUnit.SECONDS,value=20)
//@Singleton
//@Stateless
public class AlisverisSepetiEJB {
    
    List<Urun> urunler = new ArrayList();

    public List<Urun> getUrunler() {
        return urunler;
    }

    public void setUrunler(List<Urun> urunler) {
        this.urunler = urunler;
    }
    
    public void urunEkle(Urun urun){
        urunler.add(urun);
    }
}
