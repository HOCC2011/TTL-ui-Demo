package HOCC.TTL.Design.Demo;

import android.content.Intent;
import androidx.core.content.ContextCompat;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.WindowManager;


public class MainActivity extends AppCompatActivity {

    float x1, y1, x2, y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(getResources().getColor(R.color.orange_light));
        setContentView(R.layout.activity_main);
    }

    public boolean onTouchEvent(MotionEvent touchEvent) {
        switch (touchEvent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                if (x1 < x2) {
                    Intent i = new Intent(MainActivity.this, about.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
                } else if (x1 > x2) {
                    Intent i = new Intent(MainActivity.this, about.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
                break;
        }
        return false;
    }
}

