package com.example.demo.payroll;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Constantes {

    private @Id @GeneratedValue Integer  idConstantes;
    private Integer seladoraLitroM2;
    private Integer massaLitroM2;
    private Integer tintaLitroM2;
    private Integer lixaQtyM2;
    private Integer lixaaguaQtyM2;
    private Integer estopaM2;
    private Integer fitacrepeM2;
    private Integer trinchaM2;
    private Integer lonaPlasticaM2;
    private Integer roloLaM2;
    private Float valorHoraPinturaM2;
    private Float valorHoraLixaM2;
    private Float valorHoraMassaM2;


    public Integer getIdConstantes() {
        return idConstantes;
    }

    public void setIdConstantes(Integer idConstantes) {
        this.idConstantes = idConstantes;
    }

    public Integer getSeladoraLitroM2() {
        return seladoraLitroM2;
    }

    public void setSeladoraLitroM2(Integer seladoraLitroM2) {
        this.seladoraLitroM2 = seladoraLitroM2;
    }

    public Integer getMassaLitroM2() {
        return massaLitroM2;
    }

    public void setMassaLitroM2(Integer massaLitroM2) {
        this.massaLitroM2 = massaLitroM2;
    }

    public Integer getTintaLitroM2() {
        return tintaLitroM2;
    }

    public void setTintaLitroM2(Integer tintaLitroM2) {
        this.tintaLitroM2 = tintaLitroM2;
    }

    public Integer getLixaQtyM2() {
        return lixaQtyM2;
    }

    public void setLixaQtyM2(Integer lixaQtyM2) {
        this.lixaQtyM2 = lixaQtyM2;
    }

    public Integer getLixaaguaQtyM2() {
        return lixaaguaQtyM2;
    }

    public void setLixaaguaQtyM2(Integer lixaaguaQtyM2) {
        this.lixaaguaQtyM2 = lixaaguaQtyM2;
    }

    public Integer getEstopaM2() {
        return estopaM2;
    }

    public void setEstopaM2(Integer estopaM2) {
        this.estopaM2 = estopaM2;
    }

    public Integer getFitacrepeM2() {
        return fitacrepeM2;
    }

    public void setFitacrepeM2(Integer fitacrepeM2) {
        this.fitacrepeM2 = fitacrepeM2;
    }

    public Integer getTrinchaM2() {
        return trinchaM2;
    }

    public void setTrinchaM2(Integer trinchaM2) {
        this.trinchaM2 = trinchaM2;
    }

    public Integer getLonaPlasticaM2() {
        return lonaPlasticaM2;
    }

    public void setLonaPlasticaM2(Integer lonaPlasticaM2) {
        this.lonaPlasticaM2 = lonaPlasticaM2;
    }

    public Integer getRoloLaM2() {
        return roloLaM2;
    }

    public void setRoloLaM2(Integer roloLaM2) {
        this.roloLaM2 = roloLaM2;
    }

    public Float getValorHoraPinturaM2() {
        return valorHoraPinturaM2;
    }

    public void setValorHoraPinturaM2(Float valorHoraPinturaM2) {
        this.valorHoraPinturaM2 = valorHoraPinturaM2;
    }

    public Float getValorHoraLixaM2() {
        return valorHoraLixaM2;
    }

    public void setValorHoraLixaM2(Float valorHoraLixaM2) {
        this.valorHoraLixaM2 = valorHoraLixaM2;
    }

    public Float getValorHoraMassaM2() {
        return valorHoraMassaM2;
    }

    public void setValorHoraMassaM2(Float valorHoraMassaM2) {
        this.valorHoraMassaM2 = valorHoraMassaM2;
    }


    
}