package tg;

import c8.ma;
import hi.o4;
import java.util.List;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.mz0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ n(g0 g0Var, int i7) {
        this.a = i7;
        this.b = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0 g0Var = this.b;
                mz0 mz0Var = g0Var.K0;
                if (mz0Var != null) {
                    g0Var.K0 = null;
                    g0Var.removeView(mz0Var);
                    break;
                }
                break;
            case 1:
                g0 g0Var2 = this.b;
                if (g0Var2.o0 != null) {
                    g0Var2.q0.postRunnable(new n(g0Var2, 3), 200L);
                    break;
                }
                break;
            case 2:
                m1 m1Var = this.b.V0;
                if (m1Var != null) {
                    m1Var.invalidate();
                    break;
                }
                break;
            case 3:
                g0.Y(this.b);
                break;
            default:
                g0 g0Var3 = this.b;
                boolean z10 = sg.k0.e(g0Var3.z1).k;
                int i7 = 0;
                while (true) {
                    List list = sg.g.c;
                    if (i7 >= list.size()) {
                        break;
                    } else {
                        sg.g gVar = (sg.g) list.get(i7);
                        int m10 = z10 ? gVar.m() : gVar.e();
                        String n10 = gVar.n();
                        h01 h01Var = new h01(g0Var3, gVar, m10, 27);
                        f0 f0Var = new f0(g0Var3, g0Var3.getContext());
                        f0Var.setIcon(m10);
                        f0Var.setText(n10);
                        f0Var.setSelected(false);
                        f0Var.setOnClickListener(new sh.b(h01Var, 1));
                        f0Var.setOnLongClickListener(new o4(g0Var3, 6));
                        g0Var3.C1.a(f0Var, ma.o(-1, 48));
                        i7++;
                    }
                }
        }
    }
}
