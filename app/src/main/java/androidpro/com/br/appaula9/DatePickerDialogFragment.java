package androidpro.com.br.appaula9;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.widget.DatePicker;

/**
 * Created by p061046 on 06/07/2016.
 */
public class DatePickerDialogFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {



    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this.getActivity(), this, 2015, 7, 13);

        return datePickerDialog;
    }

    public interface OnDateEnteredListener {
        public void OnDateEntered(int year, int monthOfYear, int dayOfMonth);
    }

    OnDateEnteredListener mListener;

    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        mListener.OnDateEntered(year, monthOfYear, dayOfMonth);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnDateEnteredListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnDateEnteredListener");
        }
    }

}
