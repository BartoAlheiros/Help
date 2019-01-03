package ufrpe.br.help.model;

import java.sql.Blob;

public class Pedido {

    private int id;
    private String nome_solict;
    private String bairro;
    private String cidade;
    private String desc;
    private String data;
    private Blob img;

    public Pedido(int id, String nome_solict, String bairro, String cidade, String desc, String data, Blob img) {
        this.id = id;
        this.nome_solict = nome_solict;
        this.bairro = bairro;
        this.cidade = cidade;
        this.desc = desc;
        this.data = data;
        this.img = img;
    }

    public Pedido(int id, String nome_solict, String bairro, String cidade, String desc, String data) {
        this.id = id;
        this.nome_solict = nome_solict;
        this.bairro = bairro;
        this.cidade = cidade;
        this.desc = desc;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_solict() {
        return nome_solict;
    }

    public void setNome_solict(String nome_solict) {
        this.nome_solict = nome_solict;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Blob getImg() {
        return img;
    }

    public void setImg(Blob img) {
        this.img = img;
    }
}
