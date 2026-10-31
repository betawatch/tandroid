package th;

import android.app.Activity;
import org.telegram.messenger.cd;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z2 b;

    public /* synthetic */ i1(z2 z2Var, int i10) {
        this.a = i10;
        this.b = z2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        boolean z10 = false;
        z2 z2Var = this.b;
        switch (i10) {
            case 0:
                z2Var.S1.setVisibility(8);
                break;
            case 1:
                if (!z2Var.s0.H0) {
                    z2Var.i3 = null;
                    if (z2Var.q0 == null) {
                        vh.p2 p2Var = new vh.p2(z2Var.getContext(), 3);
                        p2Var.l(1.0f, -22.0f);
                        z2Var.q0 = p2Var;
                        p2Var.h(i0.b.o(i0.b.f(0.13f, -16777216, -1), zs.P3));
                        vh.p2 p2Var2 = z2Var.q0;
                        p2Var2.U = false;
                        p2Var2.s(cd.L0(2131746414, null));
                        z2Var.q0.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(1.0f));
                        z2Var.L0.addView(z2Var.q0, w7.b6.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, z2Var.g2 ? 0.0f : 56.0f));
                    }
                    z2Var.q0.u();
                    tz.H(true);
                    break;
                }
                break;
            case 2:
                z2Var.O0();
                break;
            case 3:
                ((f7) z2Var.z1).b(true);
                break;
            case 4:
                z2Var.p0(true);
                break;
            case 5:
                o7 o7Var = z2Var.s0;
                if (o7Var != null) {
                    o7Var.V(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 6:
                z2Var.M0();
                break;
            case 7:
                z2Var.u3 = 0L;
                t1 t1Var = z2Var.K1;
                if (t1Var != null) {
                    t1Var.F(true);
                    z2Var.K1.Q1();
                    z2Var.p0(true);
                    break;
                }
                break;
            case 8:
                Activity W = org.telegram.messenger.i0.W(z2Var.getContext());
                if (W != null) {
                    o0 o0Var = new o0(2, z2Var, W);
                    o7 o7Var2 = ((f7) z2Var.z1).d;
                    n7 n7Var = o7Var2.z0;
                    if (n7Var != null) {
                        z10 = n7Var.release(o0Var);
                        o7Var2.z0 = null;
                    }
                    if (!z10) {
                        org.telegram.messenger.i0.h3(o0Var, 80L);
                        break;
                    }
                }
                break;
            case 9:
                o7 o7Var3 = ((f7) z2Var.z1).d;
                o7Var3.i1 = false;
                o7Var3.d0();
                break;
            case 10:
                z2Var.J0(null);
                break;
            case 11:
                z2Var.a1(false);
                vp.d1().edit().putInt("taptostorysoundhint", vp.d1().getInt("taptostorysoundhint", 0) + 1).apply();
                break;
            default:
                z2Var.D3 = true;
                z2Var.setActive(false);
                break;
        }
    }
}
