/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.MIlhamA.LatihanMVC.controller;

import edu.MIlhamA.LatihanMVC.model.PelangganModel;
import edu.MIlhamA.LatihanMVC.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author Ilham
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
    
    public void resetFrom(PelangganView view){
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String notelp = view.getTxtTelp().getText();
        
        if(nama.equals("") && email.equals("") && notelp.equals("")){
            
        }else{
            model.resetFrom();
        }
        
    }
    
    public void simpanFrom(PelangganView view){
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String notelp = view.getTxtTelp().getText();
        
        if(nama.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        }else if(email.trim().equals("")){
            JOptionPane.showMessageDialog(view, "email Masih Kosong");
        }else if(notelp.trim().equals("")){
            JOptionPane.showMessageDialog(view, "NoTelp Masih Kosong");
        }else {
            model.simpanFrom();
        }
    }
}
