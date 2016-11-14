package michaeldaigle.com.laconiabikeweek;

import android.app.ListActivity;
import android.os.Bundle;

public class LFSundayJune12 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunday_june12);


       /* findViewById(R.id.ratebutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://laconiafest.com/events/saturday-june-11th-buckcherry-adelitas-way-biters/";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });*/

    }
}