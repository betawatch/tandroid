package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.pc;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o1 b;

    public /* synthetic */ u(o1 o1Var, int i10) {
        this.a = i10;
        this.b = o1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o1 o1Var = this.b;
                if (o1Var.O != null && !o1Var.U) {
                    AndroidUtilities.cancelRunOnUIThread(o1Var.V);
                    o1Var.U = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = o1Var.O;
                    ConnectionsManager.getInstance(o1Var.N).sendRequestTyped(getgroupcallstars, new org.telegram.messenger.a(), new bi.k6(25, o1Var, getgroupcallstars));
                    break;
                }
                break;
            case 1:
                o1 o1Var2 = this.b;
                AndroidUtilities.cancelRunOnUIThread(o1Var2.d0);
                pc pcVar = o1Var2.W;
                if (pcVar != null) {
                    pcVar.b();
                    o1Var2.W = null;
                }
                long j3 = o1Var2.R;
                if (j3 <= 0) {
                    o1Var2.j();
                    break;
                } else {
                    o1Var2.R = 0L;
                    o1Var2.S = true;
                    o1Var2.o(new TLRPC.TL_textWithEntities(), j3);
                    break;
                }
            default:
                o1 o1Var3 = this.b;
                o1Var3.e.N(true);
                o1Var3.n.N(true);
                break;
        }
    }
}
