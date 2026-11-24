// default package

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class we3 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ ze3 a;

    public we3(ze3 ze3Var) {
        this.a = ze3Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ze3 ze3Var = this.a;
        Dialog dialog = ze3Var.w0;
        if (dialog != null) {
            ze3Var.onCancel(dialog);
        }
    }
}
