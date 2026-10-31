package th;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.wb;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p1 b;

    public /* synthetic */ u(p1 p1Var, int i10) {
        this.a = i10;
        this.b = p1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p1 p1Var = this.b;
                if (p1Var.O != null && !p1Var.U) {
                    org.telegram.messenger.i0.r(p1Var.V);
                    p1Var.U = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = p1Var.O;
                    ConnectionsManager.getInstance(p1Var.N).sendRequestTyped(getgroupcallstars, new a3.b(1), new rh.s6(3, p1Var, getgroupcallstars));
                    break;
                }
                break;
            case 1:
                p1 p1Var2 = this.b;
                org.telegram.messenger.i0.r(p1Var2.d0);
                wb wbVar = p1Var2.W;
                if (wbVar != null) {
                    wbVar.b();
                    p1Var2.W = null;
                }
                long j10 = p1Var2.R;
                if (j10 <= 0) {
                    p1Var2.j();
                    break;
                } else {
                    p1Var2.R = 0L;
                    p1Var2.S = true;
                    p1Var2.o(new TLRPC.TL_textWithEntities(), j10);
                    break;
                }
            default:
                p1 p1Var3 = this.b;
                p1Var3.e.O(true);
                p1Var3.n.O(true);
                break;
        }
    }
}
