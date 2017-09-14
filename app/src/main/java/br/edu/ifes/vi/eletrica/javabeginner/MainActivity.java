package br.edu.ifes.vi.eletrica.javabeginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public ArCondicionado arLab102a;
    public ArCondicionado arLab102b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        arLab102a = new ArCondicionado("California","CA123", "Split", 12000, 220, 20);
        arLab102b = new ArCondicionado("California","CA123", "Split", 12000, 220, 20);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exibeNotificacao("Minha primeira notificção");
        exibeNotificacao("Método sobrecarregado", 3);

    }

   /* public void clickBotao (View v){
        exibeNotificacao("Minha primeira notificção");
    }*/

    protected void exibeNotificacao (String mensagem){
        Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show();
        arLab102a.setModelo("CA456");
    }

    protected void exibeNotificacao (String mensagem, int tempo){
        Toast.makeText(this, mensagem, tempo).show();
        Log.i("Main.exibeNotificacao", "log do metodo sobrecarregado" );
        arLab102a.Modelo = "CA567";
        arLab102b.Modelo = "SPRG123";
        Toast.makeText(this, arLab102b.getMarca(), tempo).show();
    }
}
