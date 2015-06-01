/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejb1;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author MstfDryl
 */
@ManagedBean(name="bean")
@SessionScoped
public class JSFYonetimliNesne {
    
    @EJB
    AlisverisSepetiEJB alisverisSepeti;
    
    Urun urun = new Urun();
    
    List<Urun> urunler;

    public Urun getUrun() {
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }

    public List<Urun> getUrunler() {
        return alisverisSepeti.getUrunler();
    }

    public void setUrunler(List<Urun> urunler) {
        this.urunler = urunler;
    }
    
    public void sepeteKoy(){
        alisverisSepeti.urunEkle(urun);
    }
    
}
