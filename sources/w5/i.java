package w5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class i extends androidx.fragment.app.p {
    public Dialog w0;
    public DialogInterface.OnCancelListener x0;
    public AlertDialog y0;

    @Override // androidx.fragment.app.p
    public final Dialog O() {
        Dialog dialog = this.w0;
        if (dialog != null) {
            return dialog;
        }
        this.n0 = false;
        if (this.y0 == null) {
            Context n10 = n();
            z5.l.h(n10);
            this.y0 = new AlertDialog.Builder(n10).create();
        }
        return this.y0;
    }

    @Override // androidx.fragment.app.p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.x0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
