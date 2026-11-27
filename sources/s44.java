// default package

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class s44 extends DialogFragment {
    public AlertDialog a;
    public DialogInterface.OnCancelListener b;
    public AlertDialog c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.a;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        AlertDialog alertDialog2 = this.c;
        if (alertDialog2 != null) {
            return alertDialog2;
        }
        Activity activity = getActivity();
        xve.h(activity);
        AlertDialog create = new AlertDialog.Builder(activity).create();
        this.c = create;
        return create;
    }
}
