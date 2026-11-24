// default package

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class x34 extends DialogFragment {
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
        fre.h(activity);
        AlertDialog create = new AlertDialog.Builder(activity).create();
        this.c = create;
        return create;
    }
}
