
package no_meet_bot;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Class_IO {
    
    public ArrayList<Kullanıcı> arraylist = new ArrayList<Kullanıcı>();
    
    public Class_IO(){
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("kullanıcılar.bin"))) {
            
            ArrayList<Kullanıcı> kullanıcı_array = (ArrayList<Kullanıcı>)in.readObject();
            for (Kullanıcı kullanıcı : kullanıcı_array) {
                arraylist.add(kullanıcı);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("file not found except");
        } catch (IOException ex) {
            System.out.println("ıoexcept");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Class_IO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    public void kaydet(ArrayList<Kullanıcı> arraylistesi){
        
        arraylist.clear();
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("kullanıcılar.bin"))){
            
            for (Kullanıcı kullanıcı : arraylistesi) {
                arraylist.add(kullanıcı);
            }
            
            out.writeObject(arraylist);
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("file not found exception");
        } catch (IOException ex) {
            System.out.println("ıo exception");
        }
        
    }
    
    
    
    
    public ArrayList<Kullanıcı> okuma(){
        
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("kullanıcılar.bin"))) {
            
            ArrayList<Kullanıcı> kullanıcı_array = (ArrayList<Kullanıcı>)in.readObject();
            for (Kullanıcı kullanıcı : kullanıcı_array) {
                arraylist.add(kullanıcı);
            }
            return arraylist;
        } catch (FileNotFoundException ex) {
            System.out.println("file not found except");
        } catch (IOException ex) {
            System.out.println("ıoexcept");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Class_IO.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<Kullanıcı> a = new ArrayList<Kullanıcı>();
        return a;
        
    }
    
    
    public ArrayList<Kullanıcı> Direkt_Oku(){
        
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("kullanıcılar.bin"))) {
            
            ArrayList<Kullanıcı> kullanıcı_array = (ArrayList<Kullanıcı>)in.readObject();
            return kullanıcı_array;
            
        } catch (FileNotFoundException ex) {
            System.out.println("file not found except");
        } catch (IOException ex) {
            System.out.println("ıoexcept");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Class_IO.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<Kullanıcı> a = new ArrayList<Kullanıcı>();
        return a;
        
    }
    public void Direkt_yaz(Kullanıcı kullanıcı){
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("kullanıcılar.bin"))){
            
            
            arraylist.add(kullanıcı);
            
            
            out.writeObject(arraylist);
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("file not found exception");
        } catch (IOException ex) {
            System.out.println("ıo exception");
        }
        
        
    }
    public void Direkt_yaz(ArrayList<Kullanıcı> kullanıcı){
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("kullanıcılar.bin"))){
            
            for (Kullanıcı kullanıcı1 : kullanıcı) {
                arraylist.add(kullanıcı1);
            }
            
            
            
            out.writeObject(arraylist);
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("file not found exception");
        } catch (IOException ex) {
            System.out.println("ıo exception");
        }
        
        
    }
    public void Kullanıcı_sil(Kullanıcı kullanıcı){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("kullanıcılar.bin"))){
            
            
            for (Kullanıcı kullanıcı1 : arraylist) {
                if (kullanıcı1.getIsim().equals(kullanıcı.getIsim())) {
                    arraylist.remove(kullanıcı1);
                    out.writeObject(arraylist);
                }
            }
            
            
            
            
            
            out.writeObject(arraylist);
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("file not found exception");
        } catch (IOException ex) {
            System.out.println("ıo exception");
        }
    }
}
