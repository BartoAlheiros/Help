package ufrpe.br.help.service;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import ufrpe.br.help.R;
import ufrpe.br.help.model.Pedido;

public class PedidoListAdapter extends BaseAdapter {

    private Context mContext;
    private List<Pedido> mPedidosList;

    public PedidoListAdapter(Context mContext, List<Pedido> mmPedidosList) {
        this.mContext = mContext;
        this.mPedidosList = mPedidosList;
    }

    @Override
    public int getCount() {
        return mPedidosList.size();
    }

    @Override
    public Object getItem(int position) {
        return mPedidosList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.)
    }
}
