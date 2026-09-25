package qg;

import ci.m5;
import java.util.List;
import org.telegram.ui.Components.k11;
import org.telegram.ui.wl0;
import w7.y5;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ n(n0 n0Var, int i10) {
        this.a = i10;
        this.b = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n0 n0Var = this.b;
                k11 k11Var = n0Var.a1;
                if (k11Var != null) {
                    n0Var.a1 = null;
                    n0Var.removeView(k11Var);
                    break;
                }
                break;
            case 1:
                n0 n0Var2 = this.b;
                if (n0Var2.E0 != null) {
                    n0Var2.G0.postRunnable(new n(n0Var2, 3), 200L);
                    break;
                }
                break;
            case 2:
                x1 x1Var = this.b.l1;
                if (x1Var != null) {
                    x1Var.invalidate();
                    break;
                }
                break;
            case 3:
                n0.a0(this.b);
                break;
            default:
                n0 n0Var3 = this.b;
                boolean z10 = pg.u0.e(n0Var3.P1).k;
                int i10 = 0;
                while (true) {
                    List list = pg.l.b;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        pg.l lVar = (pg.l) list.get(i10);
                        int m10 = z10 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        wl0 wl0Var = new wl0(n0Var3, lVar, m10, 12);
                        m0 m0Var = new m0(n0Var3, n0Var3.getContext());
                        m0Var.setIcon(m10);
                        m0Var.setText(n10);
                        m0Var.setSelected(false);
                        int i11 = 6;
                        m0Var.setOnClickListener(new org.telegram.ui.Components.voip.o(wl0Var, i11));
                        m0Var.setOnLongClickListener(new m5(n0Var3, i11));
                        n0Var3.S1.a(m0Var, y5.n(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
