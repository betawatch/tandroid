// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qc2 implements ed, z97, vc7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zc2 b;

    public /* synthetic */ qc2(zc2 zc2Var, byte b) {
        this.a = b;
        this.b = zc2Var;
    }

    @Override // z97
    public final boolean b(TLRPC.TL_error tL_error) {
        byte b = this.a;
        zc2 zc2Var = this.b;
        switch (b) {
            case 2:
                zc2Var.p0(false);
                return true;
            case 3:
                zc2Var.p0(false);
                return true;
            default:
                return zc2Var.m0(tL_error);
        }
    }

    @Override // vc7
    public final void run(long j) {
        this.b.l0(j);
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        byte b2 = 3;
        byte b3 = 0;
        zc2 zc2Var = this.b;
        switch (b) {
            case 0:
                zc2Var.n0(true);
                break;
            case 1:
                zc2 zc2Var2 = this.b;
                zc2Var2.p0(true);
                sc2 sc2Var = new sc2(zc2Var2, b3);
                if (!zc2Var2.L && !zc2Var2.M) {
                    zc2Var2.getMessagesController().j(zc2Var2.x.id, zc2Var2.w, 0, zc2Var2.Z0, zc2Var2, true, sc2Var, new qc2(zc2Var2, b2), null);
                    break;
                } else {
                    zc2Var2.getMessagesController().U4(zc2Var2.x.id, zc2Var2.w, zc2Var2.L ? zc2Var2.N : zc2.d0(false), zc2Var2.T, false, zc2Var2, zc2Var2.a1, zc2Var2.L, zc2Var2.Z0, sc2Var, new qc2(zc2Var2, (byte) 2));
                    break;
                }
            case 2:
            case 3:
            default:
                zc2Var.getClass();
                zc2Var.presentFragment(new p3c(6, null));
                break;
            case 4:
                zc2Var.finishFragment();
                break;
            case 5:
                zc2Var.getClass();
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                v82 v82Var = new v82(zc2Var, twoStepVerificationActivity, (byte) 3);
                twoStepVerificationActivity.a0 = (byte) 0;
                twoStepVerificationActivity.c0 = v82Var;
                zc2Var.presentFragment(twoStepVerificationActivity);
                break;
        }
    }
}
