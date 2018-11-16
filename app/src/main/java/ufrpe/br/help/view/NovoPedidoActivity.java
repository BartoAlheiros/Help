package ufrpe.br.help.view;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ufrpe.br.help.R;

public class NovoPedidoActivity extends AppCompatActivity {

    public void botaoPronto(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Confirmar pedido")
                .setMessage("Tem certeza que deseja liberar o pedido para postagem?")
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
        setContentView(R.layout.activity_novo_pedido);
    }

}
