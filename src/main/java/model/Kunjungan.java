/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
import Databases.database;
public class Kunjungan extends database {
    public int idKunjungan;
    public String tanggal;
    public String waktu;
    public int fkIdNapi;
    public String fkNIP;
    public int fkIdPengunjung;
    public String usernameKunjungan;
    public void setIdKunjungan(int idKunjungan) {
        this.idKunjungan = idKunjungan;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public void setFkIdNapi(int fkIdNapi) {
        this.fkIdNapi = fkIdNapi;
    }

    public void setFkNIP(String fkNIP) {
        this.fkNIP = fkNIP;
    }

    public void setFkIdPengunjung(int fkIdPengunjung) {
        this.fkIdPengunjung = fkIdPengunjung;
    }
    
    public int getIdKunjungan() {
        return idKunjungan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getWaktu() {
        return waktu;
    }

    public int getFkIdNapi() {
        return fkIdNapi;
    }

    public String getFkNIP() {
        return fkNIP;
    }

    public int getFkIdPengunjung() {
        return fkIdPengunjung;
    }
    
}
