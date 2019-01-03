package ufrpe.br.help.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.widget.Toolbar;

import ufrpe.br.help.R;
import ufrpe.br.help.view.NovoPedidoActivity;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar myToolbar = findViewById(R.id.wld_toolbar);
        setSupportActionBar(myToolbar);
    }

    public void abrirPedidoActivity(){
        Intent intent = new Intent(this, NovoPedidoActivity.class);
        startActivity(intent);
    }

    public void abrirNoticiasActivity() {
        Intent intent = new Intent(this, ListaPedidosActivity.class);
        startActivity(intent);
    }

}
