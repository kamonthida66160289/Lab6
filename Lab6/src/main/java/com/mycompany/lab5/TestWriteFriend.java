/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author informatics
 */
public class TestWriteFriend {
    public static void main(String[]args){
        ObjectOutputStream oos = null;
        FileOutputStream fos = null;
        File file = null;
        try {
            Friend f1 = new Friend("Tom", 20, "088888888");
            Friend f2 = new Friend("Mark", 20, "088888888");
            file = new File("friends.dat");
            fos = new FileOutputStream(file);
            oos= new ObjectOutputStream(fos);
            oos.writeObject(f1);
            oos.writeObject(f2);
            oos.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestWriteFriend.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestWriteFriend.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(TestWriteFriend.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
