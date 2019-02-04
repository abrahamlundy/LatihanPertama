package lundy.com.latihanpertama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class Beranda extends AppCompatActivity {

    RecyclerView rv_kelas;
    private ArrayList<DataSetGet> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        /* === Deklarasi untuk Toolbar Custom */
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);


        rv_kelas = (RecyclerView)findViewById(R.id.rv_kelas);
        rv_kelas.setHasFixedSize(true);
        list = new ArrayList<>();
        list.addAll(DataObjek.getListData());

    }

    private void showRecyclerList(){
        rv_kelas.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        ListRowAdapter listRowAdapter = new ListRowAdapter(getApplicationContext());
        //ListRowAdapter.setListDataSetGet(list);
        rv_kelas.setAdapter(listRowAdapter);
    }

    //Fungsu untuk menambahkan layout menu ke Toolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    // Fungsi untuk menghandle aksi menu saat diTap
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu_kelas:
                Toast.makeText(getApplicationContext(), "Menu_Kelas", Toast.LENGTH_LONG).show();
                showRecyclerList();
                return true;
            case R.id.menu_profil:
                 Toast.makeText(getApplicationContext(), "Menu_Profil", Toast.LENGTH_LONG).show();

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
