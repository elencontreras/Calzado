package com.example.android.calzado;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    private Spinner genero, tipo, marca;
    private EditText cantidad;
    private TextView monto;
    private Resources res;
    private String opcGenero[], opcTipo[], opcMarca[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        res = this.getResources();

        genero = (Spinner)findViewById(R.id.cmbGenero);
        tipo = (Spinner)findViewById(R.id.cmbTipo);
        marca = (Spinner)findViewById(R.id.cmbMarca);
        cantidad = (EditText)findViewById(R.id.txtCantidad);
        monto = (TextView)findViewById(R.id.txtMonto);


        opcGenero = res.getStringArray(R.array.opc_genero);
        opcTipo = res.getStringArray(R.array.opc_tipo);
        opcMarca = res.getStringArray(R.array.opc_marca);

        ArrayAdapter<String> adapterGenero = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opcGenero);
        ArrayAdapter<String> adapterTipo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opcTipo);
        ArrayAdapter<String> adapterMarca = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opcMarca);

        genero.setAdapter(adapterGenero);
        tipo.setAdapter(adapterTipo);
        marca.setAdapter(adapterMarca);
    }

    public void calcular(View v) {
        int cant, opcGen, opcTip, opcMar, mont = 0, res = 0;

        if (validar()) {
            opcGen = genero.getSelectedItemPosition();
            opcTip = tipo.getSelectedItemPosition();
            opcMar = marca.getSelectedItemPosition();
            cant = Integer.parseInt(cantidad.getText().toString());


            monto.setText(""+Metodos.calcular(opcGen,opcTip,opcMar,cant));

        }
    }

    private boolean validar(){

        if (cantidad.getText().toString().isEmpty()){
            cantidad.setError(res.getString(R.string.error1));
            cantidad.requestFocus();
            return false;
        }
        if (Metodos.validarCantidad(Integer.parseInt(cantidad.getText().toString()))){
            cantidad.setError(res.getString(R.string.error2));
            cantidad.requestFocus();
            return false;
        }
        return true;
    }

    public void borrar(View v){

        cantidad.setText("");
        genero.setSelection(0);
        tipo.setSelection(0);
        marca.setSelection(0);
        monto.setText("");
    }

}
