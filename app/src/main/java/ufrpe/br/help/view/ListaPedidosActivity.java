package ufrpe.br.help.view;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import ufrpe.br.help.R;
import ufrpe.br.help.model.Pedido;

public class ListaPedidosActivity extends AppCompatActivity {
    private ListView lvPedidoList;
    private PedidoListAdapter adapter;
    private List<Pedido> mPedidoList;

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
        setContentView(R.layout.listview_pedido);


        lvPedidoList = (ListView)findViewById(R.id.listview_pedido);

        mPedidoList = new ArrayList<>();
        // adiciona dados exemplo à lista
        // Nós podemos obter dados de um DB ou WebService aqui(ex; Firebase)
        mPedidoList.add(new Pedido(1, "João Marques", "Casa Forte", "Recife", "Preciso de alguém para cuidar da minha mãe idosa.", "2018-01-02"));
        mPedidoList.add(new Pedido(2, "Augusto Maya", "Casa Amarela", "Recife", "Preciso para cuidar do meu cachorro Pluto.", "2017-12-31"));
        mPedidoList.add(new Pedido(3, "Mauro Fernandes", "Ipsep", "Recife", "Preciso que alguém me leve ao Hospital Real Português em 07/02/2018.", "2017-12-28"));
        mPedidoList.add(new Pedido(4, "Akita Kruchev", "Casa Caiada", "Olinda", "Preciso que alguém me ajude a fazer as compras deste mês, de preferência com carro, para carregar os pacotes.", "2018-01-01"));
        mPedidoList.add(new Pedido(5, "Luciana Freire", "Casa Forte", "Recife", "Preciso de alguém para cuidar da minha mãe idosa.", "2018-01-02"));
        mPedidoList.add(new Pedido(6, "Cláudia Silva", "Bom Pastor", "Recife", "Preciso de alguém para cuidar da minha mãe idosa.", "2018-01-02"));
        mPedidoList.add(new Pedido(7, "João Marques", "Piedade", "Jaboatão dos Guararapes", "Preciso de alguém para cuidar da minha mãe idosa.", "2018-01-02"));

        // Inicializa o adapter
        adapter = new PedidoListAdapter(getApplicationContext(), mPedidoList);
        lvPedidoList.setAdapter(adapter);

        lvPedidoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Id do Pedido selecionado = " + view.getTag(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}