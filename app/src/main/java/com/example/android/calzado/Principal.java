package com.example.android.calzado;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    private Spinner genero, tipo, marca;
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
        monto = (TextView)findViewById(R.id.txtMonto);

        opcGenero = res.getStringArray(R.array.opc_genero);
        opcTipo = res.getStringArray(R.array.opc_tipo);
        opcMarca = res.getStringArray(R.array.opc_marca);

        ArrayAdapter<String> adapterGenero = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opcGenero);
        ArrayAdapter<String> adapterTipo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opcTipo);
        ArrayAdapter<String> adapterMarca = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opcMarca);

        genero.setAdapter(adapterGenero);
        genero.setAdapter(adapterTipo);
        genero.setAdapter(adapterMarca);



    }
}