/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.controller.controller;
import com.koneksi.koneksi;
import com.view.view;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class model implements controller{

    @Override
    public void Simpan(view view) throws SQLException {
         if (view.rbLaki.isSelected()) {
            Jenis Kelamin = "Laki-laki";
        }else{
            Jenis Kelamin = "Perempuan";
    }
     try {
            Connection con = koneksi.getcon();
            String sql = "Insert Into datadiri Values (?,?,?,?)";
            PreparedStatement prepare = con.prepareStatement (sql);
            prepare.setString(1, view.txtNim.getText());
            prepare.setString(2, view.txtNama.getText());
            prepare.setString(3, Jenis Kelamin);
            prepare.setString(4, (String) view.cbJurusan.getSelectedItem());
            prepare.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil diSimpan");
            prepare.close();
        } catch (Exception e){
            System.out.println(e);
        } finally {
            Tampil(view);
            view.setLebarKolom();
        }
    }
    @Override
    public void Ubah(view view) throws SQLException {
          if (mobil.rbLaki.isSelected()) {
            jk = "Laki-Laki";
        } else {
            jk = "Perempuan";
        }
        try {
            Connection con = koneksi.getcon();
            String sql = "UPDATE rental SET lama_sewa=?, kelamin_peminjam=?, "
                    +"jenis_mobil=? WHERE nama_peminjam=?";
            PreparedStatement prepare = con.prepareStatement(sql);
            prepare.setString(4, view.txtNama.getText());
            prepare.setString(1, view.txtSewa.getText());
            prepare.setString(2, jk);
            prepare.setString(3, (String)mobil.cbJenis.getSelectedItem());
            prepare.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Ubah");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            Tampil(mobil);
            mobil.setLebarKolom();
            baru(mobil);
        }  
    }

    @Override
    public void Hapus(view view) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Tampil(view view) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Baru(view view) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void KlikTabel(view view) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
   
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              