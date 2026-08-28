package u5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class i extends p {
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
            x5.l.h(n10);
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
