package rg;

import di.l5;
import java.util.List;
import ji.o4;
import org.telegram.ui.Components.y11;
import org.telegram.ui.c90;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0 b;

    public /* synthetic */ n(o0 o0Var, int i10) {
        this.a = i10;
        this.b = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o0 o0Var = this.b;
                y11 y11Var = o0Var.a1;
                if (y11Var != null) {
                    o0Var.a1 = null;
                    o0Var.removeView(y11Var);
                    break;
                }
                break;
            case 1:
                o0 o0Var2 = this.b;
                if (o0Var2.E0 != null) {
                    o0Var2.G0.postRunnable(new n(o0Var2, 3), 200L);
                    break;
                }
                break;
            case 2:
                y1 y1Var = this.b.l1;
                if (y1Var != null) {
                    y1Var.invalidate();
                    break;
                }
                break;
            case 3:
                o0.a0(this.b);
                break;
            default:
                o0 o0Var3 = this.b;
                boolean z10 = qg.s0.e(o0Var3.P1).k;
                int i10 = 0;
                while (true) {
                    List list = qg.l.b;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        qg.l lVar = (qg.l) list.get(i10);
                        int m10 = z10 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        c90 c90Var = new c90(o0Var3, lVar, m10, 20);
                        n0 n0Var = new n0(o0Var3, o0Var3.getContext());
                        n0Var.setIcon(m10);
                        n0Var.setText(n10);
                        n0Var.setSelected(false);
                        n0Var.setOnClickListener(new o4(c90Var, 7));
                        n0Var.setOnLongClickListener(new l5(o0Var3, 6));
                        o0Var3.S1.a(n0Var, a6.n(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
