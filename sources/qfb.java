// default package

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
