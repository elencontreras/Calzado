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

    public void calcular(View v){
        int cant, opcGen, opcTip, opcMar, mont=0, res=0;

        if (validar()) {
            opcGen = genero.getSelectedItemPosition();
            opcTip = tipo.getSelectedItemPosition();
            opcMar = marca.getSelectedItemPosition();
            cant = Integer.parseInt(cantidad.getText().toString());


            if (opcGen == 0 && opcTip == 0 && opcMar == 0) {
                res = 100000;
            }
            if (opcGen == 0 && opcTip == 0 && opcMar == 1) {
                res = 130000;
            }
            if (opcGen == 0 && opcTip == 0 && opcMar == 2) {
                res = 110000;
            }
            if (opcGen == 0 && opcTip == 1 && opcMar == 0) {
                res = 60000;
            }
            if (opcGen == 0 && opcTip == 1 && opcMar == 1) {
                res = 70000;
            }
            if (opcGen == 0 && opcTip == 1 && opcMar == 2) {
                res = 120000;
            }
            if (opcGen == 1 && opcTip == 0 && opcMar == 0) {
                res = 120000;
            }
            if (opcGen == 1 && opcTip == 0 && opcMar == 1) {
                res = 140000;
            }
            if (opcGen == 1 && opcTip == 0 && opcMar == 2) {
                res = 130000;
            }
            if (opcGen == 1 && opcTip == 1 && opcMar == 0) {
                res = 50000;
            }
            if (opcGen == 1 && opcTip == 1 && opcMar == 1) {
                res = 80000;
            }
            if (opcGen == 1 && opcTip == 1 && opcMar == 2) {
                res = 100000;
            }

            mont = res * cant;
            monto.setText("$" + mont);
        }
    }

    private boolean validar(){

        if (cantidad.getText().toString().isEmpty()){
            cantidad.setError(res.getString(R.string.error1));
            cantidad.requestFocus();
            return false;
        }
        if (Integer.parseInt(cantidad.getText().toString())==0){
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
