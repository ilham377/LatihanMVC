/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.MIlhamA.LatihanMVC.model;

import edu.MIlhamA.LatihanMVC.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * Nama : Muahammad Ilham Apriyadi
 * NIM  : 10118045
 * Kelas: IF-2
 */
public class PelangganModel {
    
    private String nama;
    private String email;
    private String telp;
    
    
    private PelangganListener pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }
    
            
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        if(pelangganListener!=null){
           pelangganListener.onChange(this);
        }
    }
    
    public void resetFrom(){
        setNama("");
        setEmail("");
        setTelp("");
       
    }
    
    public void simpanFrom(){
        JOptionPane.showMessageDialog(null, "Berhasil di Simpan");
        resetFrom();
    }
    
    
    
}
