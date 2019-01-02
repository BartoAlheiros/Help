package ufrpe.br.help.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import ufrpe.br.help.R;
import ufrpe.br.help.model.Pedido;

public class PedidoListAdapter extends BaseAdapter {

    private Context mContext;
    private List<Pedido> mPedidoList;

    public PedidoListAdapter(Context mContext, List<Pedido> mmPedidosList) {
        this.mContext = mContext;
        this.mPedidoList = mPedidoList;
    }

    @Override
    public int getCount() {
        return mPedidoList.size();
    }

    @Override
    public Object getItem(int position) {
        return mPedidoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.item_pedido_list,null);
        TextView tvNomeSolict = (TextView)v.findViewById(R.id.nome_solict);
        TextView tvBairroSolict = (TextView)v.findViewById(R.id.bairro_solict);
        TextView tvCidadeSolict = (TextView)v.findViewById(R.id.cidade_solict);
        TextView tvDescricao = (TextView)v.findViewById(R.id.descricao);

        tvNomeSolict.setText(mPedidoList.get(position).getNome_solict());
        tvBairroSolict.setText(mPedidoList.get(position).getBairro());
        tvCidadeSolict.setText(mPedidoList.get(position).getCidade());
        tvDescricao.setText(mPedidoList.get(position).getDesc());

        v.setTag(mPedidoList.get(position).getId());

        return v;
    }
}
