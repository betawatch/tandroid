// default package

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class qf3 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ tf3 a;

    public qf3(tf3 tf3Var) {
        this.a = tf3Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        tf3 tf3Var = this.a;
        Dialog dialog = tf3Var.w0;
        if (dialog != null) {
            tf3Var.onCancel(dialog);
        }
    }
}
