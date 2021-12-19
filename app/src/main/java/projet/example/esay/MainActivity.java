package projet.example.esay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

        // Array of strings...
        ListView simpleList;
        String countryList[] = {"India", "China", "australia", "Portugle", "America", "NewZealand"};

        @Override   protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);      setContentView(R.layout.activity_main);
            simpleList = (ListView)findViewById(R.id.simpleListView);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, countryList);
            simpleList.setAdapter(arrayAdapter);
        }
    }
    }
}