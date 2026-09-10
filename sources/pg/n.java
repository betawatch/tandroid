package pg;

import bi.l6;
import java.util.List;
import org.telegram.ui.Components.k11;
import org.telegram.ui.uu0;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                k11 k11Var = m0Var.a1;
                if (k11Var != null) {
                    m0Var.a1 = null;
                    m0Var.removeView(k11Var);
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
                boolean z10 = og.x0.e(m0Var3.P1).k;
                int i10 = 0;
                while (true) {
                    List list = og.l.b;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        og.l lVar = (og.l) list.get(i10);
                        int m10 = z10 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        uu0 uu0Var = new uu0(m0Var3, lVar, m10, 9);
                        l0 l0Var = new l0(m0Var3, m0Var3.getContext());
                        l0Var.setIcon(m10);
                        l0Var.setText(n10);
                        l0Var.setSelected(false);
                        l0Var.setOnClickListener(new org.telegram.ui.web.c(uu0Var, 1));
                        l0Var.setOnLongClickListener(new l6(m0Var3, 6));
                        m0Var3.S1.a(l0Var, a6.n(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
