package listview.cursoandroid.dell.listview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView listaDeItens;
    private String[] itens = {
            "Angra dos Reis", "Caldas Novas",
            "Campos do jordão", "Costa do sergipe",
            "Ilhéus", "Porto Seguro", "Rio de Janeiro", "Tiradentes",
            "Praga", "Santiago", "Zurique", "Caribe",
            "Buenos Aires", "Budapest", "Cancun", "Aruba"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDeItens = (ListView) findViewById(R.id.list_view_id);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        listaDeItens.setAdapter(adaptador);

        listaDeItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String valor = listaDeItens.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(), valor, Toast.LENGTH_LONG).show();
            }
        });
    }
}
