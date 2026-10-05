package qg;

import ci.m5;
import java.util.List;
import org.telegram.ui.Components.w11;
import org.telegram.ui.am0;
import w7.z5;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
                w11 w11Var = m0Var.a1;
                if (w11Var != null) {
                    m0Var.a1 = null;
                    m0Var.removeView(w11Var);
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
                        am0 am0Var = new am0(m0Var3, lVar, m10, 12);
                        l0 l0Var = new l0(m0Var3, m0Var3.getContext());
                        l0Var.setIcon(m10);
                        l0Var.setText(n10);
                        l0Var.setSelected(false);
                        int i11 = 6;
                        l0Var.setOnClickListener(new org.telegram.ui.Components.voip.o(am0Var, i11));
                        l0Var.setOnLongClickListener(new m5(m0Var3, i11));
                        m0Var3.S1.a(l0Var, z5.n(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
