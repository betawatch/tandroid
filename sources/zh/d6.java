package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class d6 implements z4.e {
    public final /* synthetic */ u7 a;
    public final /* synthetic */ k7 b;

    public d6(k7 k7Var, u7 u7Var) {
        this.b = k7Var;
        this.a = u7Var;
    }

    @Override // z4.e
    public final void a(int i10) {
        k7 k7Var = this.b;
        a3 currentPeerView = k7Var.getCurrentPeerView();
        if (currentPeerView == null) {
            return;
        }
        ((l7) k7Var.B0).a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
        k7Var.F();
        u7 u7Var = this.a;
        q7 q7Var = u7Var.t0;
        if (q7Var != null) {
            if (i10 < 3) {
                q7Var.b(false);
            } else if (i10 > k7Var.z0.b() - 4) {
                u7Var.t0.b(true);
            }
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        k7 k7Var = this.b;
        k7Var.I0 = i10;
        k7Var.J0 = i11 > 0 ? i10 + 1 : i10 - 1;
        k7Var.K0 = f7;
        long j3 = UserConfig.getInstance(k7Var.y0).clientUserId;
        int i12 = k7Var.I0;
        if (i12 >= 0 && (k7Var.x0 != null ? k7Var.w0 == j3 : !(i12 >= k7Var.A0.size() || ((Long) k7Var.A0.get(k7Var.I0)).longValue() != j3))) {
            ((l7) k7Var.B0).d(1.0f - k7Var.K0);
            return;
        }
        int i13 = k7Var.J0;
        if (i13 < 0 || (k7Var.x0 != null ? k7Var.w0 != j3 : i13 >= k7Var.A0.size() || ((Long) k7Var.A0.get(k7Var.J0)).longValue() != j3)) {
            ((l7) k7Var.B0).d(0.0f);
        } else {
            ((l7) k7Var.B0).d(k7Var.K0);
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        k7 k7Var = this.b;
        ((l7) k7Var.B0).d.P();
        Runnable runnable = k7Var.G0;
        if (runnable != null && i10 == 0) {
            runnable.run();
            k7Var.G0 = null;
        }
        k7Var.F0 = i10;
        u7 u7Var = k7Var.Q0;
        if (u7Var.n0.F0 == 1) {
            AndroidUtilities.cancelRunOnUIThread(u7Var.b1);
        }
    }
}
