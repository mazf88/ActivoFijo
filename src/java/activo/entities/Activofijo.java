/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activo.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mazf
 */
@Entity
@Table(name = "activofijo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Activofijo.findAll", query = "SELECT a FROM Activofijo a"),
    @NamedQuery(name = "Activofijo.findByIdActivo", query = "SELECT a FROM Activofijo a WHERE a.idActivo = :idActivo"),
    @NamedQuery(name = "Activofijo.findByEstadoActivo", query = "SELECT a FROM Activofijo a WHERE a.estadoActivo = :estadoActivo"),
    @NamedQuery(name = "Activofijo.findByNombre", query = "SELECT a FROM Activofijo a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Activofijo.findByDescripcion", query = "SELECT a FROM Activofijo a WHERE a.descripcion = :descripcion"),
    @NamedQuery(name = "Activofijo.findByTipo", query = "SELECT a FROM Activofijo a WHERE a.tipo = :tipo"),
    @NamedQuery(name = "Activofijo.findBySerial", query = "SELECT a FROM Activofijo a WHERE a.serial = :serial"),
    @NamedQuery(name = "Activofijo.findByNii", query = "SELECT a FROM Activofijo a WHERE a.nii = :nii"),
    @NamedQuery(name = "Activofijo.findByPeso", query = "SELECT a FROM Activofijo a WHERE a.peso = :peso"),
    @NamedQuery(name = "Activofijo.findByAlto", query = "SELECT a FROM Activofijo a WHERE a.alto = :alto"),
    @NamedQuery(name = "Activofijo.findByAncho", query = "SELECT a FROM Activofijo a WHERE a.ancho = :ancho"),
    @NamedQuery(name = "Activofijo.findByLargo", query = "SELECT a FROM Activofijo a WHERE a.largo = :largo"),
    @NamedQuery(name = "Activofijo.findByValorCompra", query = "SELECT a FROM Activofijo a WHERE a.valorCompra = :valorCompra"),
    @NamedQuery(name = "Activofijo.findByFechaDeCompra", query = "SELECT a FROM Activofijo a WHERE a.fechaDeCompra = :fechaDeCompra"),
    @NamedQuery(name = "Activofijo.findByFechaDeBaja", query = "SELECT a FROM Activofijo a WHERE a.fechaDeBaja = :fechaDeBaja"),
    @NamedQuery(name = "Activofijo.findByColor", query = "SELECT a FROM Activofijo a WHERE a.color = :color")})
public class Activofijo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_activo")
    private Integer idActivo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado_activo")
    private int estadoActivo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "serial")
    private BigInteger serial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nii")
    private BigInteger nii;
    @Basic(optional = false)
    @NotNull
    @Column(name = "peso")
    private double peso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "alto")
    private double alto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ancho")
    private double ancho;
    @Basic(optional = false)
    @NotNull
    @Column(name = "largo")
    private double largo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_compra")
    private double valorCompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_de_compra")
    @Temporal(TemporalType.DATE)
    private Date fechaDeCompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_de_baja")
    @Temporal(TemporalType.DATE)
    private Date fechaDeBaja;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "color")
    private String color;
    @JoinColumn(name = "id_area", referencedColumnName = "id_area")
    @ManyToOne(optional = false)
    private Area idArea;
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    @ManyToOne(optional = false)
    private Persona idPersona;

    public Activofijo() {
    }

    public Activofijo(Integer idActivo) {
        this.idActivo = idActivo;
    }

    public Activofijo(Integer idActivo, int estadoActivo, String nombre, String descripcion, String tipo, BigInteger serial, BigInteger nii, double peso, double alto, double ancho, double largo, double valorCompra, Date fechaDeCompra, Date fechaDeBaja, String color) {
        this.idActivo = idActivo;
        this.estadoActivo = estadoActivo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.serial = serial;
        this.nii = nii;
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.valorCompra = valorCompra;
        this.fechaDeCompra = fechaDeCompra;
        this.fechaDeBaja = fechaDeBaja;
        this.color = color;
    }

    public Integer getIdActivo() {
        return idActivo;
    }

    public void setIdActivo(Integer idActivo) {
        this.idActivo = idActivo;
    }

    public int getEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(int estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigInteger getSerial() {
        return serial;
    }

    public void setSerial(BigInteger serial) {
        this.serial = serial;
    }

    public BigInteger getNii() {
        return nii;
    }

    public void setNii(BigInteger nii) {
        this.nii = nii;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Date getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(Date fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }

    public Date getFechaDeBaja() {
        return fechaDeBaja;
    }

    public void setFechaDeBaja(Date fechaDeBaja) {
        this.fechaDeBaja = fechaDeBaja;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Area getIdArea() {
        return idArea;
    }

    public void setIdArea(Area idArea) {
        this.idArea = idArea;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActivo != null ? idActivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Activofijo)) {
            return false;
        }
        Activofijo other = (Activofijo) object;
        if ((this.idActivo == null && other.idActivo != null) || (this.idActivo != null && !this.idActivo.equals(other.idActivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "activo.entities.Activofijo[ idActivo=" + idActivo + " ]";
    }
    
}
