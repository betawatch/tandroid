package th;

import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z2 b;

    public /* synthetic */ l1(z2 z2Var, int i10) {
        this.a = i10;
        this.b = z2Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                z2 z2Var = this.b;
                if (tL_premium_boostsStatus != null) {
                    z2Var.s3 = tL_premium_boostsStatus;
                    vp.r1(z2Var.l2).G0().b(z2Var.k1, tL_premium_boostsStatus, new rh.e3(2, z2Var, tL_premium_boostsStatus));
                    break;
                } else {
                    o7 o7Var = z2Var.s0;
                    if (o7Var != null) {
                        o7Var.k1 = false;
                        o7Var.d0();
                        break;
                    }
                }
                break;
            default:
                long longValue = ((Long) obj).longValue();
                z2 z2Var2 = this.b;
                z2Var2.u3 = longValue;
                t1 t1Var = z2Var2.K1;
                if (t1Var != null) {
                    t1Var.F(true);
                    z2Var2.K1.Q1();
                }
                z2Var2.p0(true);
                break;
        }
    }
}
