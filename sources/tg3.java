// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
