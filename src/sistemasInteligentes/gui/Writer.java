/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasInteligentes.gui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 *
 * @author microraptor
 */
public class Writer {
    String filePath = new File("").getAbsolutePath();
    File archivo = new File(filePath+"/files/genes.genetris");
    FileWriter fw = null;
    PrintWriter pw = null;
    BufferedReader br = null;
    FileReader fr = null;
    public Writer() {
    }
    
    public void escribir(String gen){
        try
        {
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            String concat ="";
            while ((linea = br.readLine()) != null) {
                concat += linea+"\n";
            }
            br.close();
            fr.close();
            fw =new FileWriter(archivo);
            pw = new PrintWriter(fw);
            pw.write(concat);
            pw.append(gen);
            fw.close();
            pw.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String leer(){
        String concat ="";
        try
        {
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                concat += linea+"#";
            }
            br.close();
            fr.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return concat;
    }
}
