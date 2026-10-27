package sg;

import fi.b5;
import java.util.List;
import org.telegram.ui.Components.h21;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.fx;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                h21 h21Var = m0Var.P0;
                if (h21Var != null) {
                    m0Var.P0 = null;
                    m0Var.removeView(h21Var);
                    break;
                }
                break;
            case 1:
                m0 m0Var2 = this.b;
                if (m0Var2.t0 != null) {
                    m0Var2.v0.postRunnable(new n(m0Var2, 3), 200L);
                    break;
                }
                break;
            case 2:
                x1 x1Var = this.b.a1;
                if (x1Var != null) {
                    x1Var.invalidate();
                    break;
                }
                break;
            case 3:
                m0.Y(this.b);
                break;
            default:
                m0 m0Var3 = this.b;
                boolean z10 = rg.s0.e(m0Var3.E1).k;
                int i10 = 0;
                while (true) {
                    List list = rg.l.b;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        rg.l lVar = (rg.l) list.get(i10);
                        int m10 = z10 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        fx fxVar = new fx(m0Var3, lVar, m10, 25);
                        l0 l0Var = new l0(m0Var3, m0Var3.getContext());
                        l0Var.setIcon(m10);
                        l0Var.setText(n10);
                        l0Var.setSelected(false);
                        l0Var.setOnClickListener(new ig.d0(fxVar, 18));
                        l0Var.setOnLongClickListener(new b5(m0Var3, 6));
                        m0Var3.H1.a(l0Var, kb1.r(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
