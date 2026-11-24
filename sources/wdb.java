// default package

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class wdb extends mg3 {
    public AlertDialog B0;
    public DialogInterface.OnCancelListener C0;
    public AlertDialog D0;

    @Override // mg3
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
        ite.h(n);
        AlertDialog create = new AlertDialog.Builder(n).create();
        this.D0 = create;
        return create;
    }

    @Override // mg3, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.C0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
