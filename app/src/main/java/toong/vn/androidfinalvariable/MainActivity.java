package toong.vn.androidfinalvariable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonStart;
    private int x = 1;
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            x = 2;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int y = 1;
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = 5;
                Log.i("TAG", "y = " + y);
            }
        });
    }
}
