package tg;

import c8.ma;
import hi.n4;
import java.util.List;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.oz0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;

    public /* synthetic */ n(h0 h0Var, int i7) {
        this.a = i7;
        this.b = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h0 h0Var = this.b;
                oz0 oz0Var = h0Var.K0;
                if (oz0Var != null) {
                    h0Var.K0 = null;
                    h0Var.removeView(oz0Var);
                    break;
                }
                break;
            case 1:
                h0 h0Var2 = this.b;
                if (h0Var2.o0 != null) {
                    h0Var2.q0.postRunnable(new n(h0Var2, 3), 200L);
                    break;
                }
                break;
            case 2:
                n1 n1Var = this.b.V0;
                if (n1Var != null) {
                    n1Var.invalidate();
                    break;
                }
                break;
            case 3:
                h0.Y(this.b);
                break;
            default:
                h0 h0Var3 = this.b;
                boolean z10 = sg.k0.e(h0Var3.z1).k;
                int i7 = 0;
                while (true) {
                    List list = sg.g.c;
                    if (i7 >= list.size()) {
                        break;
                    } else {
                        sg.g gVar = (sg.g) list.get(i7);
                        int m10 = z10 ? gVar.m() : gVar.e();
                        String n10 = gVar.n();
                        f21 f21Var = new f21(h0Var3, gVar, m10, 26);
                        g0 g0Var = new g0(h0Var3, h0Var3.getContext());
                        g0Var.setIcon(m10);
                        g0Var.setText(n10);
                        g0Var.setSelected(false);
                        g0Var.setOnClickListener(new u(f21Var, 0));
                        g0Var.setOnLongClickListener(new n4(h0Var3, 6));
                        h0Var3.C1.a(g0Var, ma.o(-1, 48));
                        i7++;
                    }
                }
        }
    }
}
