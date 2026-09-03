package y5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.p;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class i extends p {
    public Dialog x0;
    public DialogInterface.OnCancelListener y0;
    public AlertDialog z0;

    @Override // androidx.fragment.app.p
    public final Dialog O() {
        Dialog dialog = this.x0;
        if (dialog != null) {
            return dialog;
        }
        this.o0 = false;
        if (this.z0 == null) {
            Context n10 = n();
            b6.m.h(n10);
            this.z0 = new AlertDialog.Builder(n10).create();
        }
        return this.z0;
    }

    @Override // androidx.fragment.app.p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.y0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
