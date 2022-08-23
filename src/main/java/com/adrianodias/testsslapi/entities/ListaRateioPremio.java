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
    "descricaoFaixa",
    "faixa",
    "numeroDeGanhadores",
    "valorPremio"
})
@Generated("jsonschema2pojo")
public class ListaRateioPremio {

    @JsonProperty("descricaoFaixa")
    private String descricaoFaixa;
    @JsonProperty("faixa")
    private Integer faixa;
    @JsonProperty("numeroDeGanhadores")
    private Integer numeroDeGanhadores;
    @JsonProperty("valorPremio")
    private Double valorPremio;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("descricaoFaixa")
    public String getDescricaoFaixa() {
        return descricaoFaixa;
    }

    @JsonProperty("descricaoFaixa")
    public void setDescricaoFaixa(String descricaoFaixa) {
        this.descricaoFaixa = descricaoFaixa;
    }

    @JsonProperty("faixa")
    public Integer getFaixa() {
        return faixa;
    }

    @JsonProperty("faixa")
    public void setFaixa(Integer faixa) {
        this.faixa = faixa;
    }

    @JsonProperty("numeroDeGanhadores")
    public Integer getNumeroDeGanhadores() {
        return numeroDeGanhadores;
    }

    @JsonProperty("numeroDeGanhadores")
    public void setNumeroDeGanhadores(Integer numeroDeGanhadores) {
        this.numeroDeGanhadores = numeroDeGanhadores;
    }

    @JsonProperty("valorPremio")
    public Double getValorPremio() {
        return valorPremio;
    }

    @JsonProperty("valorPremio")
    public void setValorPremio(Double valorPremio) {
        this.valorPremio = valorPremio;
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
