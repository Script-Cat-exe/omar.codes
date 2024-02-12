
package no_meet_bot;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Kullanıcı implements Serializable {
    public String isim;
    private String şifre;
    private HashMap<String ,String> dökümanlar = new HashMap<String,String>();
    public Kullanıcı(String isim,String şifre){
        this.isim = isim;
        this.şifre = şifre;
    }
    @Override
    public String toString() {
	String bilgilerString = "User Name : "+isim +      
				"\nUser  Pasword : " +şifre;
	return bilgilerString;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getŞifre() {
        return şifre;
    }

    public void setŞifre(String şifre) {
        this.şifre = şifre;
    }

    public HashMap<String, String> getDökümanlar() {
        return dökümanlar;
    }

    public void setDökümanlar(String ad,String dokuman) {
        this.dökümanlar.put(ad, dokuman);
    }
    public void döküman_sil(String string,String string2){
        for (Map.Entry<String, String> entry : dökümanlar.entrySet()) {
            
            if (entry.getKey().equals(string)) {
                dökümanlar.remove(string,string2);
            }
            
            
            
			
	}

    } 
    
    
    
    
    
    
}
