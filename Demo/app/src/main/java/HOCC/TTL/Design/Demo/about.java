package HOCC.TTL.Design.Demo;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;


public class about extends AppCompatActivity {

    float x1, y1, x2, y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(getResources().getColor(R.color.orange_light));
        setContentView(R.layout.activity_about);
    }

    public boolean onTouchEvent(MotionEvent touchEvent) {
        switch (touchEvent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                if (x1 < x2) {
                    Intent i = new Intent(about.this, MainActivity.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
                } else if (x1 > x2) {
                    Intent i = new Intent(about.this, MainActivity.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
                break;
        }
        return false;
    }
}
