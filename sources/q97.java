// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
