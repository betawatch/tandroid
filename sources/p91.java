// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class p91 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ia1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ p91(ia1 ia1Var, int i, byte b) {
        this.a = b;
        this.b = ia1Var;
        this.c = i;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.c;
        ia1 ia1Var = this.b;
        switch (b) {
            case 0:
                ia1Var.getConnectionsManager().cancelRequest(i, true);
                break;
            default:
                ia1Var.getConnectionsManager().cancelRequest(i, true);
                break;
        }
    }
}
