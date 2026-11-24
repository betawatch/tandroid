// default package

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class ubb extends ze3 {
    public AlertDialog B0;
    public DialogInterface.OnCancelListener C0;
    public AlertDialog D0;

    @Override // ze3
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
        fre.h(n);
        AlertDialog create = new AlertDialog.Builder(n).create();
        this.D0 = create;
        return create;
    }

    @Override // ze3, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.C0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
