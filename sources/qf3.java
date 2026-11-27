// default package

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
