package com.example.produtos;

import android.app.Activity;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private List<Produto> produtos;
    private EditText editNome;
    private Spinner spinnerCategoria;
    private Spinner spinnerQuantidade;
    private EditText editValor;
    private ListView listProduto;
    private ArrayAdapter<Produto> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        produtos = new ArrayList<>();
        editNome = findViewById(R.id.editNome);
        spinnerCategoria = findViewById(R.id.spinnerCategoria);
        spinnerQuantidade = findViewById(R.id.spinnerQuantidade);
        editValor = findViewById(R.id.editValor);
        listProduto = findViewById(R.id.listProduto);
        atualizarProdutos();
    }

    private void atualizarProdutos(){
        if(adapter == null) {
            adapter = new ProdutoAdapter(getApplicationContext(), R.layout.produto_item, produtos);
            listProduto.setAdapter(adapter);
        }else{
            adapter.notifyDataSetChanged();
        }
    }

    public void salvarProdutos(View v){
        String nome = editNome.getText().toString();
        String categoria = spinnerCategoria.getSelectedItem().toString();
        String quantidade = spinnerQuantidade.getSelectedItem().toString();
        String valor = editValor.getText().toString();

        Produto a = new Produto();
        a.setNome(nome);
        a.setCategoria(categoria);
        a.setQuantidade(quantidade);
        a.setValor(valor);

        produtos.add(a);
        atualizarProdutos();
    }
}