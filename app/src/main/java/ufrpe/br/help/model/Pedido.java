package ufrpe.br.help.model;

import java.sql.Blob;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Pedido {

    private int id;
    private String nome_solict;
    private String cidade;
    private String UF;
    private String desc;
    private Date data;
    private Blob img;

}
