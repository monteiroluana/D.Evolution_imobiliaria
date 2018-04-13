package model;

import java.util.Date;

public class Imovel {

    private int idImovel;
    private String codImovel;
    private String cpfProprietário;
    private Date data;
    private String venda_locacao;
    private String categoria;
    private double valor;
    //endereço
    private String cep;
    private String endereço;
    private String bairro;
    private String cidade;
    private String uf;
    private String num;
    private String complemento;
    //comodos_espaço
    private int quartos;
    private int suites;
    private int garagem;
    private int banheiros;
    private double areaUtil;
    private double areaTotal;
    //...
    private double iptu;
    private double condominio;
    private String status;

    public int getIdImovel() {
        return idImovel;
    }

    public void setIdImovel(int idImovel) {
        this.idImovel = idImovel;
    }

    public String getCodImovel() {
        return codImovel;
    }

    public void setCodImovel(String codImovel) {
        this.codImovel = codImovel;
    }

    public String getCpfProprietário() {
        return cpfProprietário;
    }

    public void setCpfProprietário(String cpfProprietário) {
        this.cpfProprietário = cpfProprietário;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getVenda_locacao() {
        return venda_locacao;
    }

    public void setVenda_locacao(String venda_locacao) {
        this.venda_locacao = venda_locacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getGaragem() {
        return garagem;
    }

    public void setGaragem(int garagem) {
        this.garagem = garagem;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public double getAreaUtil() {
        return areaUtil;
    }

    public void setAreaUtil(double areaUtil) {
        this.areaUtil = areaUtil;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public double getIptu() {
        return iptu;
    }

    public void setIptu(double iptu) {
        this.iptu = iptu;
    }

    public double getCondominio() {
        return condominio;
    }

    public void setCondominio(double condominio) {
        this.condominio = condominio;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
