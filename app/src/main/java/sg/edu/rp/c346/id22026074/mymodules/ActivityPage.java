package sg.edu.rp.c346.id22026074.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityPage extends AppCompatActivity {

    TextView infoCode;
    TextView infoName;
    TextView infoYear;
    TextView infoSemester;
    TextView infoCredit;
    TextView infoVenue;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        infoCode = findViewById(R.id.infoCode);
        Intent intentCode = getIntent();
        String code = intentCode.getStringExtra("Code");
        infoCode.setText(code);

        infoName = findViewById(R.id.infoName);
        Intent intentName = getIntent();
        String name = intentName.getStringExtra("Name");
        infoName.setText(name);

        infoYear = findViewById(R.id.infoYear);
        Intent intentYear = getIntent();
        String year = intentYear.getStringExtra("Year");
        infoYear.setText(year);

        infoSemester = findViewById(R.id.infoSemester);
        Intent intentSemester = getIntent();
        String semester = intentSemester.getStringExtra("Semester");
        infoSemester.setText(semester);

        infoCredit = findViewById(R.id.infoCredit);
        Intent intentCredit = getIntent();
        String credit = intentCredit.getStringExtra("Credit");
        infoCredit.setText(credit);

        infoVenue = findViewById(R.id.infoVenue);
        Intent intentVenue = getIntent();
        String venue = intentVenue.getStringExtra("Venue");
        infoVenue.setText(venue);

        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}