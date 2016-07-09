package androidpro.com.br.appaula9;

import android.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements DatePickerDialogFragment.OnDateEnteredListener, TimePickerDialogFragment.OnTimeEnteredListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BasicDialogFragment dialogFragment = new BasicDialogFragment();
                dialogFragment.show(getFragmentManager(), "basic dialog");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageDialogFragment imageDialogFragment = new ImageDialogFragment();
                imageDialogFragment.show(getFragmentManager(), "image dialog");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialogFragment datePickerDialogFragment = new DatePickerDialogFragment();
                datePickerDialogFragment.show(getFragmentManager(), "date picker dialog");
            }
        });
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePickerDialogFragment timePickerDialogFragment = new TimePickerDialogFragment();
                timePickerDialogFragment.show(getFragmentManager(), "timepicker dialog");
            }
        });
    }

    @Override
    public void OnDateEntered(int year, int monthOfYear, int dayOfMonth) {
        int mescorrigido = monthOfYear +1;
        Toast.makeText(getApplicationContext(), dayOfMonth + "/" + mescorrigido + "/" + year, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnDateEntered(int hour, int minute) {
        Toast.makeText(getApplicationContext(), hour + ":" + minute, Toast.LENGTH_SHORT).show();
    }
}
