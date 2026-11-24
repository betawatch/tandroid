// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class w66 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l18 b;

    public /* synthetic */ w66(l18 l18Var, byte b) {
        this.a = b;
        this.b = l18Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        l18 l18Var = this.b;
        switch (b) {
            case 0:
                l18Var.a();
                break;
            case 1:
                if (l18Var.P != null && !l18Var.V) {
                    gl.r(l18Var.W);
                    l18Var.V = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = l18Var.P;
                    ConnectionsManager.getInstance(l18Var.O).sendRequestTyped(getgroupcallstars, new hc((byte) 0), new ae2(l18Var, getgroupcallstars, (byte) 27));
                    break;
                }
                break;
            case 2:
                gl.r(l18Var.e0);
                m21 m21Var = l18Var.a0;
                if (m21Var != null) {
                    m21Var.b();
                    l18Var.a0 = null;
                }
                long j = l18Var.S;
                if (j <= 0) {
                    l18Var.i();
                    break;
                } else {
                    l18Var.S = 0L;
                    l18Var.T = true;
                    l18Var.n(new TLRPC.TL_textWithEntities(), j);
                    break;
                }
            default:
                l18Var.e.O(true);
                l18Var.n.O(true);
                break;
        }
    }
}
