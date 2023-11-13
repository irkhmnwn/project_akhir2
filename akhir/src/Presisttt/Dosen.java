/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presisttt;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Irkhamnawan
 */
@Entity
@Table(name = "dosen")
@NamedQueries({
    @NamedQuery(name = "Dosen.findAll", query = "SELECT d FROM Dosen d"),
    @NamedQuery(name = "Dosen.findByIdDosen", query = "SELECT d FROM Dosen d WHERE d.idDosen = :idDosen"),
    @NamedQuery(name = "Dosen.findByNama", query = "SELECT d FROM Dosen d WHERE d.nama = :nama"),
    @NamedQuery(name = "Dosen.findByNidn", query = "SELECT d FROM Dosen d WHERE d.nidn = :nidn"),
    @NamedQuery(name = "Dosen.findByProdi", query = "SELECT d FROM Dosen d WHERE d.prodi = :prodi"),
    @NamedQuery(name = "Dosen.findByFakultas", query = "SELECT d FROM Dosen d WHERE d.fakultas = :fakultas"),
    @NamedQuery(name = "Dosen.findByAlamat", query = "SELECT d FROM Dosen d WHERE d.alamat = :alamat"),
    @NamedQuery(name = "Dosen.findByPassword", query = "SELECT d FROM Dosen d WHERE d.password = :password"),
    @NamedQuery(name = "Dosen.findByEmail", query = "SELECT d FROM Dosen d WHERE d.email = :email")})
public class Dosen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_dosen")
    private String idDosen;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "nidn")
    private String nidn;
    @Basic(optional = false)
    @Column(name = "prodi")
    private String prodi;
    @Basic(optional = false)
    @Column(name = "fakultas")
    private String fakultas;
    @Basic(optional = false)
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Lob
    @Column(name = "foto")
    private byte[] foto;

    public Dosen() {
    }

    public Dosen(String idDosen) {
        this.idDosen = idDosen;
    }

    public Dosen(String idDosen, String nama, String nidn, String prodi, String fakultas, String alamat, String password, String email) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.nidn = nidn;
        this.prodi = prodi;
        this.fakultas = fakultas;
        this.alamat = alamat;
        this.password = password;
        this.email = email;
    }

    public String getIdDosen() {
        return idDosen;
    }

    public void setIdDosen(String idDosen) {
        this.idDosen = idDosen;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDosen != null ? idDosen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dosen)) {
            return false;
        }
        Dosen other = (Dosen) object;
        if ((this.idDosen == null && other.idDosen != null) || (this.idDosen != null && !this.idDosen.equals(other.idDosen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "kntl.Dosen[ idDosen=" + idDosen + " ]";
    }
    
}
