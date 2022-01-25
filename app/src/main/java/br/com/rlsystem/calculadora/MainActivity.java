package br.com.rlsystem.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_somar = (Button) findViewById(R.id.btn_somar);
        btn_somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtN1 = (EditText) findViewById(R.id.txtN1);
                EditText txtN2 = (EditText) findViewById(R.id.txtN2);
                double resultado = Double.parseDouble( txtN1.getText().toString() ) + Double.parseDouble( txtN2.getText().toString() );

                TextView txvResultado = (TextView)findViewById(R.id.txvResultado);
                txvResultado.setText("Resultado: " + String.valueOf(resultado));

                Toast.makeText(getBaseContext(), String.valueOf(resultado), Toast.LENGTH_SHORT).show();
            }
        });


        Button btn_sobre = (Button) findViewById(R.id.btn_sobre);
        btn_sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), SobreActivity.class);
                startActivity(intent);
            }
        });
    }
}