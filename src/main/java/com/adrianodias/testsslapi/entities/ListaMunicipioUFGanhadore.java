package com.adrianodias.testsslapi.entities;


import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ganhadores",
    "municipio",
    "nomeFatansiaUL",
    "posicao",
    "serie",
    "uf"
})
@Generated("jsonschema2pojo")
public class ListaMunicipioUFGanhadore {

    @JsonProperty("ganhadores")
    private Integer ganhadores;
    @JsonProperty("municipio")
    private String municipio;
    @JsonProperty("nomeFatansiaUL")
    private String nomeFatansiaUL;
    @JsonProperty("posicao")
    private Integer posicao;
    @JsonProperty("serie")
    private String serie;
    @JsonProperty("uf")
    private String uf;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ganhadores")
    public Integer getGanhadores() {
        return ganhadores;
    }

    @JsonProperty("ganhadores")
    public void setGanhadores(Integer ganhadores) {
        this.ganhadores = ganhadores;
    }

    @JsonProperty("municipio")
    public String getMunicipio() {
        return municipio;
    }

    @JsonProperty("municipio")
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @JsonProperty("nomeFatansiaUL")
    public String getNomeFatansiaUL() {
        return nomeFatansiaUL;
    }

    @JsonProperty("nomeFatansiaUL")
    public void setNomeFatansiaUL(String nomeFatansiaUL) {
        this.nomeFatansiaUL = nomeFatansiaUL;
    }

    @JsonProperty("posicao")
    public Integer getPosicao() {
        return posicao;
    }

    @JsonProperty("posicao")
    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    @JsonProperty("serie")
    public String getSerie() {
        return serie;
    }

    @JsonProperty("serie")
    public void setSerie(String serie) {
        this.serie = serie;
    }

    @JsonProperty("uf")
    public String getUf() {
        return uf;
    }

    @JsonProperty("uf")
    public void setUf(String uf) {
        this.uf = uf;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
