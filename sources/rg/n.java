package rg;

import ei.c5;
import java.util.List;
import org.telegram.ui.Components.t11;
import org.telegram.ui.Components.w31;
import w7.z5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                t11 t11Var = m0Var.a1;
                if (t11Var != null) {
                    m0Var.a1 = null;
                    m0Var.removeView(t11Var);
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
                boolean z10 = qg.u0.e(m0Var3.P1).k;
                int i10 = 0;
                while (true) {
                    List list = qg.l.b;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        qg.l lVar = (qg.l) list.get(i10);
                        int m10 = z10 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        w31 w31Var = new w31(m0Var3, lVar, m10, 24);
                        l0 l0Var = new l0(m0Var3, m0Var3.getContext());
                        l0Var.setIcon(m10);
                        l0Var.setText(n10);
                        l0Var.setSelected(false);
                        l0Var.setOnClickListener(new hg.r0(w31Var, 17));
                        l0Var.setOnLongClickListener(new c5(m0Var3, 6));
                        m0Var3.S1.a(l0Var, z5.n(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
