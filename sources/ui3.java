// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ui3 implements uz1, m9b {
    public final /* synthetic */ nk3 a;

    public /* synthetic */ ui3(nk3 nk3Var) {
        this.a = nk3Var;
    }

    @Override // uz1
    public final int B0() {
        return 0;
    }

    @Override // uz1
    public final TL_stories.StoryItem C0() {
        return null;
    }

    @Override // uz1
    public final boolean E0(long j) {
        return false;
    }

    @Override // uz1
    public final boolean G0() {
        return false;
    }

    @Override // uz1
    public final void H0(CharSequence charSequence, boolean z, boolean z2) {
        nk3 nk3Var = this.a;
        gm.d3(new di3(nk3Var, (byte) 18), 100L);
        bda bdaVar = nk3Var.I2;
        if (bdaVar != null) {
            if (z) {
                if (bdaVar.h) {
                    bdaVar.e(charSequence, true);
                }
            } else {
                rd3 rd3Var = nk3Var.J2;
                if (rd3Var != null) {
                    gm.r(rd3Var);
                }
                rd3 rd3Var2 = new rd3(this, charSequence, (byte) 6);
                nk3Var.J2 = rd3Var2;
                gm.d3(rd3Var2, 1000L);
            }
        }
    }

    @Override // uz1
    public final nv1 J() {
        return null;
    }

    @Override // uz1
    public final boolean K0() {
        return false;
    }

    @Override // m9b
    public final q9b b(long j) {
        aj3 aj3Var = this.a.F0;
        return q9b.c(aj3Var != null ? aj3Var.e(j) : null);
    }

    @Override // uz1
    public final boolean b0() {
        return true;
    }

    @Override // m9b
    public final void c(long j, toa toaVar) {
        nk3 nk3Var = this.a;
        if (nk3Var.F0 == null) {
            toaVar.run();
            return;
        }
        byte b = 0;
        nk3Var.R4(false, true);
        nk3Var.R = true;
        nk3Var.fragmentView.invalidate();
        if (j == 0 || j == nk3Var.getUserConfig().e()) {
            nk3Var.F0.T.g1(0, 0);
        } else {
            nk3Var.F0.k(j);
        }
        nk3Var.f0[0].a.getViewTreeObserver().addOnPreDrawListener(new xj3(this, toaVar, b));
    }

    @Override // uz1
    public final boolean d1() {
        return false;
    }

    @Override // uz1
    public final boolean h() {
        return false;
    }

    @Override // uz1
    public final int j() {
        return 0;
    }

    @Override // uz1
    public final TLRPC.Peer l() {
        return null;
    }

    @Override // uz1
    public final void w(CharSequence charSequence, boolean z, int i, int i2, long j) {
        nk3 nk3Var = this.a;
        ArrayList arrayList = nk3Var.K2;
        if (nk3Var.E2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList2.add(bf7.a(((Long) nk3Var.K2.get(i3)).longValue(), 0L));
        }
        nk3Var.E2.q(nk3Var, arrayList2, charSequence, false, z, i, i2, null);
    }

    @Override // uz1
    public final TLRPC.TL_channels_sendAsPeers x() {
        return null;
    }

    @Override // uz1
    public final void A1() {
    }

    @Override // uz1
    public final void B() {
    }

    @Override // uz1
    public final void C(boolean z) {
    }

    @Override // uz1
    public final void E1(boolean z) {
    }

    @Override // uz1
    public final void G1() {
    }

    @Override // uz1
    public final void H1() {
    }

    @Override // uz1
    public final void I() {
    }

    @Override // uz1
    public final void I0() {
    }

    @Override // uz1
    public final void L() {
    }

    @Override // uz1
    public final void O0() {
    }

    @Override // uz1
    public final void R1() {
    }

    @Override // uz1
    public final void W0() {
    }

    @Override // uz1
    public final void Y0() {
    }

    @Override // uz1
    public final void a() {
    }

    @Override // uz1
    public final void c0() {
    }

    @Override // uz1
    public final void c1(CharSequence charSequence) {
    }

    @Override // uz1
    public final void e() {
    }

    @Override // uz1
    public final void e1() {
    }

    @Override // uz1
    public final void f0() {
    }

    @Override // uz1
    public final void j1() {
    }

    @Override // uz1
    public final void n() {
    }

    @Override // uz1
    public final void n0() {
    }

    @Override // uz1
    public final void o(float f) {
    }

    @Override // uz1
    public final void p(boolean z) {
    }

    @Override // uz1
    public final void r() {
    }

    @Override // uz1
    public final void s1() {
    }

    @Override // uz1
    public final void v() {
    }

    @Override // uz1
    public final void v1(int i) {
    }

    @Override // uz1
    public final void z0(int i) {
    }

    @Override // uz1
    public final void y(float f, int i) {
    }

    @Override // uz1
    public final void a1(View view, CharSequence charSequence, boolean z) {
    }

    @Override // uz1
    public final void F1(int i, int i2, int i3, long j, long j2, boolean z) {
    }
}
