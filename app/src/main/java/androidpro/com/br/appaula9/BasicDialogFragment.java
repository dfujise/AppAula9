/**
 * Created by dan on 01/07/16.
 */
package androidpro.com.br.appaula9;


import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class BasicDialogFragment extends DialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        getDialog().setTitle("Insira seu primeiro nome");
        //return inflater.inflate(R.layout.dialog_basic, container, false);

        View view = inflater.inflate(R.layout.dialog_basic, container, false);

        Button mCancel = (Button)view.findViewById(R.id.buttonCancelar);
        mCancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                BasicDialogFragment.this.dismiss();
            }
        });

        return view;


    }
}