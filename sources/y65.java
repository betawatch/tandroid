// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class y65 implements Runnable {
    public final /* synthetic */ j95 a;

    public y65(j95 j95Var) {
        this.a = j95Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j95 j95Var = this.a;
        ema emaVar = j95Var.N1;
        s85 s85Var = j95Var.O1;
        if (s85Var == null || j95Var.J) {
            return;
        }
        vc2 vc2Var = j95Var.T2;
        int i = vc2Var != null ? vc2Var.b.schedule_date : j95Var.c4;
        if (i != 0) {
            int currentTime = i - ConnectionsManager.getInstance(j95Var.n1.a).getCurrentTime();
            if (currentTime >= 86400) {
                s85Var.l(ob6.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]), false);
            } else {
                s85Var.l(hl.j0(Math.abs(currentTime)), false);
                if (currentTime < 0 && emaVar.getTag() == null) {
                    emaVar.setTag(1);
                    emaVar.l(ob6.M0(2131743093, null), false);
                }
            }
            j95Var.P1.l(ob6.W(3, i, true), false);
            hl.d3(j95Var.o4, 1000L);
        }
    }
}
