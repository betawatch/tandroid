// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class w86 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n38 b;

    public /* synthetic */ w86(n38 n38Var, byte b) {
        this.a = b;
        this.b = n38Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        n38 n38Var = this.b;
        switch (b) {
            case 0:
                n38Var.a();
                break;
            case 1:
                if (n38Var.P != null && !n38Var.V) {
                    gm.r(n38Var.W);
                    n38Var.V = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = n38Var.P;
                    ConnectionsManager.getInstance(n38Var.O).sendRequestTyped(getgroupcallstars, new kc((byte) 0), new lf2(n38Var, getgroupcallstars, (byte) 29));
                    break;
                }
                break;
            case 2:
                gm.r(n38Var.e0);
                u31 u31Var = n38Var.a0;
                if (u31Var != null) {
                    u31Var.b();
                    n38Var.a0 = null;
                }
                long j = n38Var.S;
                if (j <= 0) {
                    n38Var.i();
                    break;
                } else {
                    n38Var.S = 0L;
                    n38Var.T = true;
                    n38Var.n(new TLRPC.TL_textWithEntities(), j);
                    break;
                }
            default:
                n38Var.e.O(true);
                n38Var.n.O(true);
                break;
        }
    }
}
