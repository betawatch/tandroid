package qg;

import ci.n5;
import java.util.List;
import org.telegram.ui.Components.m11;
import org.telegram.ui.fm0;
import w7.y5;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ n(m0 m0Var, int i10) {
        this.a = i10;
        this.b = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m0 m0Var = this.b;
                m11 m11Var = m0Var.a1;
                if (m11Var != null) {
                    m0Var.a1 = null;
                    m0Var.removeView(m11Var);
                    break;
                }
                break;
            case 1:
                m0 m0Var2 = this.b;
                if (m0Var2.E0 != null) {
                    m0Var2.G0.postRunnable(new n(m0Var2, 3), 200L);
                    break;
                }
                break;
            case 2:
                w1 w1Var = this.b.l1;
                if (w1Var != null) {
                    w1Var.invalidate();
                    break;
                }
                break;
            case 3:
                m0.a0(this.b);
                break;
            default:
                m0 m0Var3 = this.b;
                boolean z10 = pg.u0.e(m0Var3.P1).k;
                int i10 = 0;
                while (true) {
                    List list = pg.l.b;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        pg.l lVar = (pg.l) list.get(i10);
                        int m10 = z10 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        fm0 fm0Var = new fm0(m0Var3, lVar, m10, 12);
                        l0 l0Var = new l0(m0Var3, m0Var3.getContext());
                        l0Var.setIcon(m10);
                        l0Var.setText(n10);
                        l0Var.setSelected(false);
                        int i11 = 6;
                        l0Var.setOnClickListener(new org.telegram.ui.Components.voip.o(fm0Var, i11));
                        l0Var.setOnLongClickListener(new n5(m0Var3, i11));
                        m0Var3.S1.a(l0Var, y5.n(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
