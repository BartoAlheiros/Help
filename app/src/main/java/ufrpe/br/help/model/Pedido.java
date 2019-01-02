package ufrpe.br.help.model;

import java.sql.Blob;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


public class Pedido {

    private int id;
    private String nome_solict;
    private String bairro;
    private String cidade;
    private String desc;
    private Date data;
    private Blob img;

    public Pedido(String nome_solict, String bairro, String cidade, String desc, Date data, Blob img) {
        this.nome_solict = nome_solict;
        this.bairro = bairro;
        this.cidade = cidade;
        this.desc = desc;
        this.data = data;
        this.img = img;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Blob getImg() {
        return img;
    }

    public void setImg(Blob img) {
        this.img = img;
    }
}
