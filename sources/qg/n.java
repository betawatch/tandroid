package qg;

import ci.l5;
import java.util.List;
import org.telegram.ui.Components.c21;
import org.telegram.ui.bi0;
import w7.x5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                c21 c21Var = m0Var.a1;
                if (c21Var != null) {
                    m0Var.a1 = null;
                    m0Var.removeView(c21Var);
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
                        bi0 bi0Var = new bi0(m0Var3, lVar, m10, 18);
                        l0 l0Var = new l0(m0Var3, m0Var3.getContext());
                        l0Var.setIcon(m10);
                        l0Var.setText(n10);
                        l0Var.setSelected(false);
                        int i11 = 6;
                        l0Var.setOnClickListener(new org.telegram.ui.Components.voip.o(bi0Var, i11));
                        l0Var.setOnLongClickListener(new l5(m0Var3, i11));
                        m0Var3.S1.a(l0Var, x5.n(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
