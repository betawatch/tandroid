package th;

import org.telegram.messenger.n20;
import org.telegram.ui.Components.ei0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements n20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u2 b;
    public final /* synthetic */ x2 c;

    public /* synthetic */ q2(u2 u2Var, x2 x2Var, int i10) {
        this.a = i10;
        this.b = u2Var;
        this.c = x2Var;
    }

    @Override // org.telegram.messenger.n20
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                long currentTimeMillis = System.currentTimeMillis();
                z2 z2Var = this.b.x;
                k2.t0 t0Var = z2Var.v2;
                n7 n7Var = (n7) t0Var.c;
                if (n7Var != null) {
                    n7Var.firstFrameRendered = false;
                    t0Var.b = false;
                    n7Var.setOnReadyListener(new o1(1, currentTimeMillis, runnable));
                    ((f7) z2Var.z1).g(false);
                    ei0 ei0Var = z2Var.i0;
                    if (ei0Var != null) {
                        ei0Var.setAnimation(this.c.u);
                    }
                    if (z2Var.A2 > 0 && l4.longValue() > z2Var.A2 - 1400) {
                        l4 = 0L;
                    }
                    z2Var.R0(l4.longValue(), true);
                    z2Var.D3 = false;
                    org.telegram.messenger.i0.h3(runnable, 400L);
                    if (bool.booleanValue()) {
                        z2Var.d1(false);
                        break;
                    }
                } else {
                    ((f7) z2Var.z1).g(false);
                    z2Var.setActive(true);
                    z2Var.D3 = false;
                    z2Var.R0 = new lg.b(3, runnable);
                    if (bool.booleanValue()) {
                        z2Var.d1(false);
                    }
                    org.telegram.messenger.i0.h3(runnable, 400L);
                    break;
                }
                break;
            default:
                Long l10 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                long currentTimeMillis2 = System.currentTimeMillis();
                z2 z2Var2 = this.b.x;
                k2.t0 t0Var2 = z2Var2.v2;
                n7 n7Var2 = (n7) t0Var2.c;
                if (n7Var2 != null) {
                    n7Var2.firstFrameRendered = false;
                    t0Var2.b = false;
                    n7Var2.setOnReadyListener(new o1(2, currentTimeMillis2, runnable2));
                    ((f7) z2Var2.z1).g(false);
                    ei0 ei0Var2 = z2Var2.i0;
                    if (ei0Var2 != null) {
                        ei0Var2.setAnimation(this.c.u);
                    }
                    if (z2Var2.A2 > 0 && l10.longValue() > z2Var2.A2 - 1400) {
                        l10 = 0L;
                    }
                    z2Var2.R0(l10.longValue(), true);
                    z2Var2.D3 = false;
                    org.telegram.messenger.i0.h3(runnable2, 400L);
                    if (bool2.booleanValue()) {
                        z2Var2.d1(false);
                        break;
                    }
                } else {
                    ((f7) z2Var2.z1).g(false);
                    z2Var2.setActive(true);
                    z2Var2.D3 = false;
                    z2Var2.R0 = new lg.b(4, runnable2);
                    if (bool2.booleanValue()) {
                        z2Var2.d1(false);
                    }
                    org.telegram.messenger.i0.h3(runnable2, 400L);
                    break;
                }
                break;
        }
    }
}
