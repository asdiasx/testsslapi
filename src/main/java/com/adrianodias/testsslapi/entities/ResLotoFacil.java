package com.adrianodias.testsslapi.entities;

import java.util.HashMap;
import java.util.List;
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
    "acumulado",
    "dataApuracao",
    "dataProximoConcurso",
    "dezenasSorteadasOrdemSorteio",
    "exibirDetalhamentoPorCidade",
    "id",
    "indicadorConcursoEspecial",
    "listaDezenas",
    "listaDezenasSegundoSorteio",
    "listaMunicipioUFGanhadores",
    "listaRateioPremio",
    "listaResultadoEquipeEsportiva",
    "localSorteio",
    "nomeMunicipioUFSorteio",
    "nomeTimeCoracaoMesSorte",
    "numero",
    "numeroConcursoAnterior",
    "numeroConcursoFinal_0_5",
    "numeroConcursoProximo",
    "numeroJogo",
    "observacao",
    "premiacaoContingencia",
    "tipoJogo",
    "tipoPublicacao",
    "ultimoConcurso",
    "valorArrecadado",
    "valorAcumuladoConcurso_0_5",
    "valorAcumuladoConcursoEspecial",
    "valorAcumuladoProximoConcurso",
    "valorEstimadoProximoConcurso",
    "valorSaldoReservaGarantidora",
    "valorTotalPremioFaixaUm"
})
@Generated("jsonschema2pojo")
public class ResLotoFacil {

    @JsonProperty("acumulado")
    private Boolean acumulado;
    @JsonProperty("dataApuracao")
    private String dataApuracao;
    @JsonProperty("dataProximoConcurso")
    private String dataProximoConcurso;
    @JsonProperty("dezenasSorteadasOrdemSorteio")
    private List<String> dezenasSorteadasOrdemSorteio = null;
    @JsonProperty("exibirDetalhamentoPorCidade")
    private Boolean exibirDetalhamentoPorCidade;
    @JsonProperty("id")
    private Object id;
    @JsonProperty("indicadorConcursoEspecial")
    private Integer indicadorConcursoEspecial;
    @JsonProperty("listaDezenas")
    private List<String> listaDezenas = null;
    @JsonProperty("listaDezenasSegundoSorteio")
    private Object listaDezenasSegundoSorteio;
    @JsonProperty("listaMunicipioUFGanhadores")
    private List<ListaMunicipioUFGanhadore> listaMunicipioUFGanhadores = null;
    @JsonProperty("listaRateioPremio")
    private List<ListaRateioPremio> listaRateioPremio = null;
    @JsonProperty("listaResultadoEquipeEsportiva")
    private Object listaResultadoEquipeEsportiva;
    @JsonProperty("localSorteio")
    private String localSorteio;
    @JsonProperty("nomeMunicipioUFSorteio")
    private String nomeMunicipioUFSorteio;
    @JsonProperty("nomeTimeCoracaoMesSorte")
    private String nomeTimeCoracaoMesSorte;
    @JsonProperty("numero")
    private Integer numero;
    @JsonProperty("numeroConcursoAnterior")
    private Integer numeroConcursoAnterior;
    @JsonProperty("numeroConcursoFinal_0_5")
    private Integer numeroConcursoFinal05;
    @JsonProperty("numeroConcursoProximo")
    private Integer numeroConcursoProximo;
    @JsonProperty("numeroJogo")
    private Integer numeroJogo;
    @JsonProperty("observacao")
    private String observacao;
    @JsonProperty("premiacaoContingencia")
    private Object premiacaoContingencia;
    @JsonProperty("tipoJogo")
    private String tipoJogo;
    @JsonProperty("tipoPublicacao")
    private Integer tipoPublicacao;
    @JsonProperty("ultimoConcurso")
    private Boolean ultimoConcurso;
    @JsonProperty("valorArrecadado")
    private Double valorArrecadado;
    @JsonProperty("valorAcumuladoConcurso_0_5")
    private Double valorAcumuladoConcurso05;
    @JsonProperty("valorAcumuladoConcursoEspecial")
    private Double valorAcumuladoConcursoEspecial;
    @JsonProperty("valorAcumuladoProximoConcurso")
    private Double valorAcumuladoProximoConcurso;
    @JsonProperty("valorEstimadoProximoConcurso")
    private Double valorEstimadoProximoConcurso;
    @JsonProperty("valorSaldoReservaGarantidora")
    private Double valorSaldoReservaGarantidora;
    @JsonProperty("valorTotalPremioFaixaUm")
    private Double valorTotalPremioFaixaUm;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("acumulado")
    public Boolean getAcumulado() {
        return acumulado;
    }

    @JsonProperty("acumulado")
    public void setAcumulado(Boolean acumulado) {
        this.acumulado = acumulado;
    }

    @JsonProperty("dataApuracao")
    public String getDataApuracao() {
        return dataApuracao;
    }

    @JsonProperty("dataApuracao")
    public void setDataApuracao(String dataApuracao) {
        this.dataApuracao = dataApuracao;
    }

    @JsonProperty("dataProximoConcurso")
    public String getDataProximoConcurso() {
        return dataProximoConcurso;
    }

    @JsonProperty("dataProximoConcurso")
    public void setDataProximoConcurso(String dataProximoConcurso) {
        this.dataProximoConcurso = dataProximoConcurso;
    }

    @JsonProperty("dezenasSorteadasOrdemSorteio")
    public List<String> getDezenasSorteadasOrdemSorteio() {
        return dezenasSorteadasOrdemSorteio;
    }

    @JsonProperty("dezenasSorteadasOrdemSorteio")
    public void setDezenasSorteadasOrdemSorteio(List<String> dezenasSorteadasOrdemSorteio) {
        this.dezenasSorteadasOrdemSorteio = dezenasSorteadasOrdemSorteio;
    }

    @JsonProperty("exibirDetalhamentoPorCidade")
    public Boolean getExibirDetalhamentoPorCidade() {
        return exibirDetalhamentoPorCidade;
    }

    @JsonProperty("exibirDetalhamentoPorCidade")
    public void setExibirDetalhamentoPorCidade(Boolean exibirDetalhamentoPorCidade) {
        this.exibirDetalhamentoPorCidade = exibirDetalhamentoPorCidade;
    }

    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    @JsonProperty("indicadorConcursoEspecial")
    public Integer getIndicadorConcursoEspecial() {
        return indicadorConcursoEspecial;
    }

    @JsonProperty("indicadorConcursoEspecial")
    public void setIndicadorConcursoEspecial(Integer indicadorConcursoEspecial) {
        this.indicadorConcursoEspecial = indicadorConcursoEspecial;
    }

    @JsonProperty("listaDezenas")
    public List<String> getListaDezenas() {
        return listaDezenas;
    }

    @JsonProperty("listaDezenas")
    public void setListaDezenas(List<String> listaDezenas) {
        this.listaDezenas = listaDezenas;
    }

    @JsonProperty("listaDezenasSegundoSorteio")
    public Object getListaDezenasSegundoSorteio() {
        return listaDezenasSegundoSorteio;
    }

    @JsonProperty("listaDezenasSegundoSorteio")
    public void setListaDezenasSegundoSorteio(Object listaDezenasSegundoSorteio) {
        this.listaDezenasSegundoSorteio = listaDezenasSegundoSorteio;
    }

    @JsonProperty("listaMunicipioUFGanhadores")
    public List<ListaMunicipioUFGanhadore> getListaMunicipioUFGanhadores() {
        return listaMunicipioUFGanhadores;
    }

    @JsonProperty("listaMunicipioUFGanhadores")
    public void setListaMunicipioUFGanhadores(List<ListaMunicipioUFGanhadore> listaMunicipioUFGanhadores) {
        this.listaMunicipioUFGanhadores = listaMunicipioUFGanhadores;
    }

    @JsonProperty("listaRateioPremio")
    public List<ListaRateioPremio> getListaRateioPremio() {
        return listaRateioPremio;
    }

    @JsonProperty("listaRateioPremio")
    public void setListaRateioPremio(List<ListaRateioPremio> listaRateioPremio) {
        this.listaRateioPremio = listaRateioPremio;
    }

    @JsonProperty("listaResultadoEquipeEsportiva")
    public Object getListaResultadoEquipeEsportiva() {
        return listaResultadoEquipeEsportiva;
    }

    @JsonProperty("listaResultadoEquipeEsportiva")
    public void setListaResultadoEquipeEsportiva(Object listaResultadoEquipeEsportiva) {
        this.listaResultadoEquipeEsportiva = listaResultadoEquipeEsportiva;
    }

    @JsonProperty("localSorteio")
    public String getLocalSorteio() {
        return localSorteio;
    }

    @JsonProperty("localSorteio")
    public void setLocalSorteio(String localSorteio) {
        this.localSorteio = localSorteio;
    }

    @JsonProperty("nomeMunicipioUFSorteio")
    public String getNomeMunicipioUFSorteio() {
        return nomeMunicipioUFSorteio;
    }

    @JsonProperty("nomeMunicipioUFSorteio")
    public void setNomeMunicipioUFSorteio(String nomeMunicipioUFSorteio) {
        this.nomeMunicipioUFSorteio = nomeMunicipioUFSorteio;
    }

    @JsonProperty("nomeTimeCoracaoMesSorte")
    public String getNomeTimeCoracaoMesSorte() {
        return nomeTimeCoracaoMesSorte;
    }

    @JsonProperty("nomeTimeCoracaoMesSorte")
    public void setNomeTimeCoracaoMesSorte(String nomeTimeCoracaoMesSorte) {
        this.nomeTimeCoracaoMesSorte = nomeTimeCoracaoMesSorte;
    }

    @JsonProperty("numero")
    public Integer getNumero() {
        return numero;
    }

    @JsonProperty("numero")
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @JsonProperty("numeroConcursoAnterior")
    public Integer getNumeroConcursoAnterior() {
        return numeroConcursoAnterior;
    }

    @JsonProperty("numeroConcursoAnterior")
    public void setNumeroConcursoAnterior(Integer numeroConcursoAnterior) {
        this.numeroConcursoAnterior = numeroConcursoAnterior;
    }

    @JsonProperty("numeroConcursoFinal_0_5")
    public Integer getNumeroConcursoFinal05() {
        return numeroConcursoFinal05;
    }

    @JsonProperty("numeroConcursoFinal_0_5")
    public void setNumeroConcursoFinal05(Integer numeroConcursoFinal05) {
        this.numeroConcursoFinal05 = numeroConcursoFinal05;
    }

    @JsonProperty("numeroConcursoProximo")
    public Integer getNumeroConcursoProximo() {
        return numeroConcursoProximo;
    }

    @JsonProperty("numeroConcursoProximo")
    public void setNumeroConcursoProximo(Integer numeroConcursoProximo) {
        this.numeroConcursoProximo = numeroConcursoProximo;
    }

    @JsonProperty("numeroJogo")
    public Integer getNumeroJogo() {
        return numeroJogo;
    }

    @JsonProperty("numeroJogo")
    public void setNumeroJogo(Integer numeroJogo) {
        this.numeroJogo = numeroJogo;
    }

    @JsonProperty("observacao")
    public String getObservacao() {
        return observacao;
    }

    @JsonProperty("observacao")
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @JsonProperty("premiacaoContingencia")
    public Object getPremiacaoContingencia() {
        return premiacaoContingencia;
    }

    @JsonProperty("premiacaoContingencia")
    public void setPremiacaoContingencia(Object premiacaoContingencia) {
        this.premiacaoContingencia = premiacaoContingencia;
    }

    @JsonProperty("tipoJogo")
    public String getTipoJogo() {
        return tipoJogo;
    }

    @JsonProperty("tipoJogo")
    public void setTipoJogo(String tipoJogo) {
        this.tipoJogo = tipoJogo;
    }

    @JsonProperty("tipoPublicacao")
    public Integer getTipoPublicacao() {
        return tipoPublicacao;
    }

    @JsonProperty("tipoPublicacao")
    public void setTipoPublicacao(Integer tipoPublicacao) {
        this.tipoPublicacao = tipoPublicacao;
    }

    @JsonProperty("ultimoConcurso")
    public Boolean getUltimoConcurso() {
        return ultimoConcurso;
    }

    @JsonProperty("ultimoConcurso")
    public void setUltimoConcurso(Boolean ultimoConcurso) {
        this.ultimoConcurso = ultimoConcurso;
    }

    @JsonProperty("valorArrecadado")
    public Double getValorArrecadado() {
        return valorArrecadado;
    }

    @JsonProperty("valorArrecadado")
    public void setValorArrecadado(Double valorArrecadado) {
        this.valorArrecadado = valorArrecadado;
    }

    @JsonProperty("valorAcumuladoConcurso_0_5")
    public Double getValorAcumuladoConcurso05() {
        return valorAcumuladoConcurso05;
    }

    @JsonProperty("valorAcumuladoConcurso_0_5")
    public void setValorAcumuladoConcurso05(Double valorAcumuladoConcurso05) {
        this.valorAcumuladoConcurso05 = valorAcumuladoConcurso05;
    }

    @JsonProperty("valorAcumuladoConcursoEspecial")
    public Double getValorAcumuladoConcursoEspecial() {
        return valorAcumuladoConcursoEspecial;
    }

    @JsonProperty("valorAcumuladoConcursoEspecial")
    public void setValorAcumuladoConcursoEspecial(Double valorAcumuladoConcursoEspecial) {
        this.valorAcumuladoConcursoEspecial = valorAcumuladoConcursoEspecial;
    }

    @JsonProperty("valorAcumuladoProximoConcurso")
    public Double getValorAcumuladoProximoConcurso() {
        return valorAcumuladoProximoConcurso;
    }

    @JsonProperty("valorAcumuladoProximoConcurso")
    public void setValorAcumuladoProximoConcurso(Double valorAcumuladoProximoConcurso) {
        this.valorAcumuladoProximoConcurso = valorAcumuladoProximoConcurso;
    }

    @JsonProperty("valorEstimadoProximoConcurso")
    public Double getValorEstimadoProximoConcurso() {
        return valorEstimadoProximoConcurso;
    }

    @JsonProperty("valorEstimadoProximoConcurso")
    public void setValorEstimadoProximoConcurso(Double valorEstimadoProximoConcurso) {
        this.valorEstimadoProximoConcurso = valorEstimadoProximoConcurso;
    }

    @JsonProperty("valorSaldoReservaGarantidora")
    public Double getValorSaldoReservaGarantidora() {
        return valorSaldoReservaGarantidora;
    }

    @JsonProperty("valorSaldoReservaGarantidora")
    public void setValorSaldoReservaGarantidora(Double valorSaldoReservaGarantidora) {
        this.valorSaldoReservaGarantidora = valorSaldoReservaGarantidora;
    }

    @JsonProperty("valorTotalPremioFaixaUm")
    public Double getValorTotalPremioFaixaUm() {
        return valorTotalPremioFaixaUm;
    }

    @JsonProperty("valorTotalPremioFaixaUm")
    public void setValorTotalPremioFaixaUm(Double valorTotalPremioFaixaUm) {
        this.valorTotalPremioFaixaUm = valorTotalPremioFaixaUm;
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
