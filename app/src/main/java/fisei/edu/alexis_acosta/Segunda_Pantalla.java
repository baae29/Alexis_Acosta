package fisei.edu.alexis_acosta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Segunda_Pantalla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);
    }
    public void onClick_Tercera(View view){
        Intent intent = new Intent(Segunda_Pantalla.this, Tercera_Pantalla.class);
        startActivity(intent);
    }
}