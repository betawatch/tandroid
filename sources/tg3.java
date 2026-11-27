// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class tg3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uj3 b;

    public /* synthetic */ tg3(uj3 uj3Var, byte b) {
        this.a = b;
        this.b = uj3Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        uj3 uj3Var = this.b;
        switch (b) {
            case 0:
                uj3Var.X3();
                break;
            case 1:
                if (uj3Var.Y3 != null) {
                    uj3Var.getMessagesController().v4(0L, uj3Var.Y3);
                    uj3Var.Y3 = null;
                    uj3Var.g5();
                    break;
                }
                break;
            case 2:
                uj3Var.A3(true);
                break;
            default:
                uj3Var.A3(true);
                break;
        }
    }
}
