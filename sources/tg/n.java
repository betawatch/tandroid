package tg;

import c8.ha;
import fi.s4;
import java.util.List;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.d10;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
                dz0 dz0Var = g0Var.J0;
                if (dz0Var != null) {
                    g0Var.J0 = null;
                    g0Var.removeView(dz0Var);
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
                        d10 d10Var = new d10(g0Var3, gVar, m10, 23);
                        f0 f0Var = new f0(g0Var3, g0Var3.getContext());
                        f0Var.setIcon(m10);
                        f0Var.setText(n10);
                        f0Var.setSelected(false);
                        f0Var.setOnClickListener(new ii.g(d10Var, 23));
                        f0Var.setOnLongClickListener(new s4(g0Var3, 6));
                        g0Var3.B1.a(f0Var, ha.o(-1, 48));
                        i7++;
                    }
                }
        }
    }
}
