package tg;

import c8.ha;
import fi.s4;
import java.util.List;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.f10;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                ez0 ez0Var = g0Var.J0;
                if (ez0Var != null) {
                    g0Var.J0 = null;
                    g0Var.removeView(ez0Var);
                    break;
                }
                break;
            case 1:
                g0 g0Var2 = this.b;
                if (g0Var2.n0 != null) {
                    g0Var2.p0.postRunnable(new n(g0Var2, 3), 200L);
                    break;
                }
                break;
            case 2:
                m1 m1Var = this.b.U0;
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
                boolean z9 = sg.l0.e(g0Var3.y1).k;
                int i7 = 0;
                while (true) {
                    List list = sg.g.c;
                    if (i7 >= list.size()) {
                        break;
                    } else {
                        sg.g gVar = (sg.g) list.get(i7);
                        int m10 = z9 ? gVar.m() : gVar.e();
                        String n10 = gVar.n();
                        f10 f10Var = new f10(g0Var3, gVar, m10, 23);
                        f0 f0Var = new f0(g0Var3, g0Var3.getContext());
                        f0Var.setIcon(m10);
                        f0Var.setText(n10);
                        f0Var.setSelected(false);
                        f0Var.setOnClickListener(new ii.g(f10Var, 23));
                        f0Var.setOnLongClickListener(new s4(g0Var3, 6));
                        g0Var3.B1.a(f0Var, ha.o(-1, 48));
                        i7++;
                    }
                }
        }
    }
}
