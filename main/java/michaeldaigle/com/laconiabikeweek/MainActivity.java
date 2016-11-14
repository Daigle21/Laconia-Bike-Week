package michaeldaigle.com.laconiabikeweek;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Button laconia, concert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button schedule = (Button) findViewById(R.id.schedule);
        Button laconia_fest = (Button) findViewById(R.id.laconia_fest);

        schedule.setOnClickListener(this);
        laconia_fest.setOnClickListener(this);
        assert schedule != null;
        assert laconia_fest != null;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.schedule:
                Intent intent = new Intent(MainActivity.this, List.class);
                startActivity(intent);
                break;
            case R.id.laconia_fest:
                Intent i = new Intent(MainActivity.this, LaconiaFest.class);
                startActivity(i);
                break;
        }

    }
}