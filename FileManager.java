/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifcvideira.trampo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author eduardo
 */
public class FileManager {
    public static void saveInformations(String content) throws Exception{
        String filePath = System.getProperty("user.home") + "/ultrasoft.txt";
        File file = new File(filePath);
        
        if(!file.exists()){
            file.createNewFile();
        }
        
        FileWriter fw = new FileWriter(file);
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            ArrayList<String> linhas = FileManager.getInformations();
            
            bw.newLine();
            for (String linha : linhas) {
                bw.write(linha);
            }
            bw.write(content);
        }
    }
    
    public static ArrayList getInformations() throws Exception{
        ArrayList<String> data = new ArrayList<>();
        
        String filePath = System.getProperty("user.home") + "/ultrasoft.txt";
        File file = new File(filePath);
        
        if(!file.exists()){
            throw new Exception("Deu ruim, não tem nada para ver aqui!");
        }
        
        FileReader fr = new FileReader(file);
        try (BufferedReader br = new BufferedReader(fr)){
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
        }
        
        return data;
    }
}
