/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasMandiri;

import java.util.Date;

/**
 *
 * @author user
 */
public class Nasabah {
    
    private String rekening;
    private String nama;
    private String umur;
    private String jenisKelamin;
    private String pekerjaan;
    private String telp;
    private String status;
    private String alamat;
    private String provinsi;
    private String kota;
    private String gapok;
    private String tambahan;
    private String bonus;
    private String tgl;

    public Nasabah() {
    }

    public Nasabah(String rekening, String nama,String umur, String jenisKelamin,String telp, String kota, String status,String alamat,String pekerjaan, String provinsi,  String gapok, String tambahan, String bonus, String tgl) {
        this.rekening = rekening;
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.pekerjaan = pekerjaan;
        this.telp = telp;
        this.status = status;
        this.alamat = alamat;
        this.provinsi = provinsi;
        this.kota = kota;
        this.gapok = gapok;
        this.tambahan = tambahan;
        this.bonus = bonus;
        this.tgl = tgl;
    }

    
    
    /**
     * @return the rekening
     */
    public String getRekening() {
        return rekening;
    }

    /**
     * @param rekening the rekening to set
     */
    public void setRekening(String rekening) {
        this.rekening = rekening;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the jenisKelamin
     */
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    /**
     * @param jenisKelamin the jenisKelamin to set
     */
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    /**
     * @return the pekerjaan
     */
    public String getPekerjaan() {
        return pekerjaan;
    }

    /**
     * @param pekerjaan the pekerjaan to set
     */
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    /**
     * @return the telp
     */
    public String getTelp() {
        return telp;
    }

    /**
     * @param telp the telp to set
     */
    public void setTelp(String telp) {
        this.telp = telp;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the provinsi
     */
    public String getProvinsi() {
        return provinsi;
    }

    /**
     * @param provinsi the provinsi to set
     */
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    /**
     * @return the kota
     */
    public String getKota() {
        return kota;
    }

    /**
     * @param kota the kota to set
     */
    public void setKota(String kota) {
        this.kota = kota;
    }

    /**
     * @return the gapok
     */
    public String getGapok() {
        return gapok;
    }

    /**
     * @param gapok the gapok to set
     */
    public void setGapok(String gapok) {
        this.gapok = gapok;
    }

    /**
     * @return the tambahan
     */
    public String getTambahan() {
        return tambahan;
    }

    /**
     * @param tambahan the tambahan to set
     */
    public void setTambahan(String tambahan) {
        this.tambahan = tambahan;
    }

    /**
     * @return the bonus
     */
    public String getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    /**
     * @return the tgl
     */
    public String getTgl() {
        return tgl;
    }

    /**
     * @param tgl the tgl to set
     */
    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    /**
     * @return the umur
     */
    public String getUmur() {
        return umur;
    }

    /**
     * @param umur the umur to set
     */
    public void setUmur(String umur) {
        this.umur = umur;
    }
    
    
    
}



