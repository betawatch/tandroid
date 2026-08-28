package yf;

import g7.e6;
import java.util.List;
import kh.d5;
import kh.x8;
import org.telegram.ui.Components.d01;
import org.telegram.ui.jh0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ n(l0 l0Var, int i9) {
        this.a = i9;
        this.b = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                d01 d01Var = l0Var.W0;
                if (d01Var != null) {
                    l0Var.W0 = null;
                    l0Var.removeView(d01Var);
                    break;
                }
                break;
            case 1:
                l0 l0Var2 = this.b;
                if (l0Var2.A0 != null) {
                    l0Var2.C0.postRunnable(new n(l0Var2, 3), 200L);
                    break;
                }
                break;
            case 2:
                w1 w1Var = this.b.h1;
                if (w1Var != null) {
                    w1Var.invalidate();
                    break;
                }
                break;
            case 3:
                l0.a0(this.b);
                break;
            default:
                l0 l0Var3 = this.b;
                boolean z10 = xf.s0.e(l0Var3.L1).k;
                int i9 = 0;
                while (true) {
                    List list = xf.l.b;
                    if (i9 >= list.size()) {
                        break;
                    } else {
                        xf.l lVar = (xf.l) list.get(i9);
                        int m10 = z10 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        jh0 jh0Var = new jh0(l0Var3, lVar, m10, 18);
                        k0 k0Var = new k0(l0Var3, l0Var3.getContext());
                        k0Var.setIcon(m10);
                        k0Var.setText(n10);
                        k0Var.setSelected(false);
                        k0Var.setOnClickListener(new x8(jh0Var, 24));
                        k0Var.setOnLongClickListener(new d5(l0Var3, 6));
                        l0Var3.O1.a(k0Var, e6.n(-1, 48));
                        i9++;
                    }
                }
        }
    }
}
