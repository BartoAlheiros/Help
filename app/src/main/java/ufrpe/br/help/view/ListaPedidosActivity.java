package ufrpe.br.help.view;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ufrpe.br.help.R;

public class ListaPedidosActivity extends AppCompatActivity {

    public void botaoPronto(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Deletando curso")
                .setMessage("Tem certeza que deseja deletar esse curso?")
                .setPositiveButton("sim",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                chamaDetalharPedido();
                            }
                        })
                .setNegativeButton("não", null)
                .show();
    }

    public void chamaDetalharPedido() {
        Intent intent = new Intent(this, DetalharPedidoActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pedidos);
    }
}