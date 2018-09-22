package com.example.produtos;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ProdutoAdapter extends ArrayAdapter<Produto> {
    private int rId;

    public ProdutoAdapter(Context context, int resource, List<Produto> objects) {
        super(context, resource, objects);
        this.rId = resource;
    }

    @Override
    public View getView(int position, View currentView, ViewGroup parent){
        View mView = currentView;

        if(mView == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            mView = inflater.inflate(rId,null);
        }

        Produto produto = getItem(position);

        TextView textNome = mView.findViewById(R.id.editNome);
        TextView textCategoria = mView.findViewById(R.id.spinnerCategoria);
        TextView textQuantidade = mView.findViewById(R.id.spinnerQuantidade);
        TextView textValor = mView.findViewById(R.id.editValor);



        textNome.setText(produto.getNome());
        textCategoria.setText(produto.getCategoria());
        textQuantidade.setText(produto.getQuantidade());
        textValor.setText(produto.getValor());


        return mView;
    }
}

