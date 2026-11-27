// default package

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
