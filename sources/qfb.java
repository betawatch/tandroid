// default package

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class qfb extends tf3 {
    public AlertDialog B0;
    public DialogInterface.OnCancelListener C0;
    public AlertDialog D0;

    @Override // tf3
    public final Dialog P() {
        AlertDialog alertDialog = this.B0;
        if (alertDialog != null) {
            return alertDialog;
        }
        this.s0 = false;
        AlertDialog alertDialog2 = this.D0;
        if (alertDialog2 != null) {
            return alertDialog2;
        }
        Context n = n();
        xve.h(n);
        AlertDialog create = new AlertDialog.Builder(n).create();
        this.D0 = create;
        return create;
    }

    @Override // tf3, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.C0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
