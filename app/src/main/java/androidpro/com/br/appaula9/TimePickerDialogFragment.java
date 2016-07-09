package androidpro.com.br.appaula9;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.DatePicker;

/**
 * Created by dan on 08/07/16.
 */
public class TimePickerDialogFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {

    interface OnTimeEnteredListener {
        public void OnDateEntered(int hour, int minute);
    }
    OnTimeEnteredListener mListener;


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(), this, 4, 0, true);
        return timePickerDialog;
    }



    @Override
    public void onTimeSet(TimePicker timePicker, int hour, int minute) {
        mListener.OnDateEntered(hour, minute);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnTimeEnteredListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnTimeEnteredListener");
        }
    }
}

