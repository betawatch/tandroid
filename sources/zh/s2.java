package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.kj0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements Utilities.Callback4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;
    public final /* synthetic */ y2 c;

    public /* synthetic */ s2(v2 v2Var, y2 y2Var, int i10) {
        this.a = i10;
        this.b = v2Var;
        this.c = y2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback4
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                long currentTimeMillis = System.currentTimeMillis();
                a3 a3Var = this.b.l;
                k2.v vVar = a3Var.M2;
                t7 t7Var = (t7) vVar.c;
                if (t7Var != null) {
                    t7Var.firstFrameRendered = false;
                    vVar.a = false;
                    t7Var.setOnReadyListener(new n1(1, currentTimeMillis, runnable));
                    ((l7) a3Var.Q1).g(false);
                    kj0 kj0Var = a3Var.z0;
                    if (kj0Var != null) {
                        kj0Var.setAnimation(this.c.u);
                    }
                    if (a3Var.R2 > 0 && l4.longValue() > a3Var.R2 - 1400) {
                        l4 = 0L;
                    }
                    a3Var.T0(l4.longValue(), true);
                    a3Var.U3 = false;
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    if (bool.booleanValue()) {
                        a3Var.f1(false);
                        break;
                    }
                } else {
                    ((l7) a3Var.Q1).g(false);
                    a3Var.setActive(true);
                    a3Var.U3 = false;
                    a3Var.i1 = new org.telegram.tgnet.f(2, runnable);
                    if (bool.booleanValue()) {
                        a3Var.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    break;
                }
                break;
            default:
                Long l10 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                long currentTimeMillis2 = System.currentTimeMillis();
                a3 a3Var2 = this.b.l;
                k2.v vVar2 = a3Var2.M2;
                t7 t7Var2 = (t7) vVar2.c;
                if (t7Var2 != null) {
                    t7Var2.firstFrameRendered = false;
                    vVar2.a = false;
                    t7Var2.setOnReadyListener(new n1(2, currentTimeMillis2, runnable2));
                    ((l7) a3Var2.Q1).g(false);
                    kj0 kj0Var2 = a3Var2.z0;
                    if (kj0Var2 != null) {
                        kj0Var2.setAnimation(this.c.u);
                    }
                    if (a3Var2.R2 > 0 && l10.longValue() > a3Var2.R2 - 1400) {
                        l10 = 0L;
                    }
                    a3Var2.T0(l10.longValue(), true);
                    a3Var2.U3 = false;
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    if (bool2.booleanValue()) {
                        a3Var2.f1(false);
                        break;
                    }
                } else {
                    ((l7) a3Var2.Q1).g(false);
                    a3Var2.setActive(true);
                    a3Var2.U3 = false;
                    a3Var2.i1 = new org.telegram.tgnet.f(3, runnable2);
                    if (bool2.booleanValue()) {
                        a3Var2.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    break;
                }
                break;
        }
    }
}
