// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class q97 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc7 b;
    public final /* synthetic */ int c;

    public /* synthetic */ q97(uc7 uc7Var, int i, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = i;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.c;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                uc7Var.getConnectionsManager().cancelRequest(i, true);
                break;
            default:
                uc7Var.getConnectionsManager().cancelRequest(i, true);
                break;
        }
    }
}
