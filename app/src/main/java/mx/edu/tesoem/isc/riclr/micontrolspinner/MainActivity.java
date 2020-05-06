package mx.edu.tesoem.isc.riclr.micontrolspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] strCapitales;
    List<String> listCapitales;
    ArrayAdapter <String> Adaptador;
    Spinner ContenedorCapitales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ContenedorCapitales = findViewById(R.id.spinnerCapitales);
        strCapitales = new String[] {"Aguascalientes",
        "Mexicali", "La paz", "Campeche", "Saltillo",
        "Colima", "Tuxtla Gutiérrez", "Chichuachua",
        "CDMX","Durango", "Guanajuato","Chilpancingo","Pachuca",
        "Guadalajara","Toluca","Morelia","Cuernavaca",
        "Tepic", "Monterrey", "Oaxaca", "Puebla",
        "Querétaro", "Chetumal", "San Luis Potosí",
        "Culiacán", "Hermosillo", "Villahermosa",
        "Ciudad Victoria", "Tlaxcala", "Xalapa", "Merida",
        "Zacatecas"};

        listCapitales= new ArrayList<String>();
        Collections.addAll(listCapitales,strCapitales);
        Adaptador= new ArrayAdapter<String>(
                this,android.R.layout.simple_spinner_item,
                listCapitales);
        ContenedorCapitales.setAdapter(Adaptador);

        ContenedorCapitales.setOnItemSelectedListener(
                this
        );
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String texto =ContenedorCapitales.getSelectedItem().toString();
        Toast.makeText(this,
                "Valor seleccionado "+texto,
                Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
