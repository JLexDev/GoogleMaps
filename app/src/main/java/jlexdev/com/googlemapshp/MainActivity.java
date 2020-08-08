package jlexdev.com.googlemapshp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/** Fuente:
 *  http://www.hermosaprogramacion.com/2016/05/google-maps-android-api-v2/#obtener-sha1
 */

public class MainActivity extends AppCompatActivity {

    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    btnNext = (Button)findViewById(R.id.btn_next);

    btnNext.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(MainActivity.this, FirstMapActivity.class);
            startActivity(i);
        }
    });
    }
}
