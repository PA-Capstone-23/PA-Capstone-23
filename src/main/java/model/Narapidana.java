/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import Databases.database;

public class Narapidana extends database {
    public int idNapi;
    public String namaNapi;
    public int umur;
    public String jenisKelamin;
    public String tglMasuk;
    public String tglKeluar;
    public String masaTahanan;
    public String program;
    public String programRehab;

    public int getIdNapi() {
        return idNapi;
    }

    public void setIdNapi(int idNapi) {
        this.idNapi = idNapi;
    }

    public String getNamaNapi() {
        return namaNapi;
    }

    public void setNamaNapi(String namaNapi) {
        this.namaNapi = namaNapi;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getTglMasuk() {
        return tglMasuk;
    }

    public void setTglMasuk(String tglMasuk) {
        this.tglMasuk = tglMasuk;
    }

    public String getTglKeluar() {
        return tglKeluar;
    }

    public void setTglKeluar(String tglKeluar) {
        this.tglKeluar = tglKeluar;
    }

    public String getMasaTahanan() {
        return masaTahanan;
    }

    public void setMasaTahanan(String masaTahanan) {
        this.masaTahanan = masaTahanan;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getProgramRehab() {
        return programRehab;
    }

    public void setProgramRehab(String programRehab) {
        this.programRehab = programRehab;
    }
    
}

