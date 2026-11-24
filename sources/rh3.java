// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rh3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nk3 b;

    public /* synthetic */ rh3(nk3 nk3Var, byte b) {
        this.a = b;
        this.b = nk3Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        nk3 nk3Var = this.b;
        switch (b) {
            case 0:
                if (nk3Var.Y3 != null) {
                    nk3Var.getMessagesController().p4(0L, nk3Var.Y3);
                    nk3Var.Y3 = null;
                    nk3Var.g5();
                    break;
                }
                break;
            case 1:
                nk3Var.A3(true);
                break;
            case 2:
                nk3Var.A3(true);
                break;
            default:
                nk3Var.X3();
                break;
        }
    }
}
