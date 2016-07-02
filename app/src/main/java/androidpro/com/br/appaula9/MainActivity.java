package androidpro.com.br.appaula9;

import android.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              BasicDialogFragment dialogFragment = new BasicDialogFragment();
              dialogFragment.show(getFragmentManager(), "basic dialog");
            }
        });

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageDialogFragment imageDialogFragment = new ImageDialogFragment();
                imageDialogFragment.show(getFragmentManager(), "image dialog");
            }
        });
    }


}
