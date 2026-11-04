package ug;

import b8.mf;
import gi.p4;
import java.util.List;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.rw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ n(f0 f0Var, int i3) {
        this.a = i3;
        this.b = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f0 f0Var = this.b;
                cz0 cz0Var = f0Var.K0;
                if (cz0Var != null) {
                    f0Var.K0 = null;
                    f0Var.removeView(cz0Var);
                    break;
                }
                break;
            case 1:
                f0 f0Var2 = this.b;
                if (f0Var2.o0 != null) {
                    f0Var2.q0.postRunnable(new n(f0Var2, 3), 200L);
                    break;
                }
                break;
            case 2:
                l1 l1Var = this.b.V0;
                if (l1Var != null) {
                    l1Var.invalidate();
                    break;
                }
                break;
            case 3:
                f0.Y(this.b);
                break;
            default:
                f0 f0Var3 = this.b;
                boolean z10 = tg.k0.e(f0Var3.z1).k;
                int i3 = 0;
                while (true) {
                    List list = tg.g.c;
                    if (i3 >= list.size()) {
                        break;
                    } else {
                        tg.g gVar = (tg.g) list.get(i3);
                        int m10 = z10 ? gVar.m() : gVar.e();
                        String n4 = gVar.n();
                        rw rwVar = new rw(f0Var3, gVar, m10, 26);
                        e0 e0Var = new e0(f0Var3, f0Var3.getContext());
                        e0Var.setIcon(m10);
                        e0Var.setText(n4);
                        e0Var.setSelected(false);
                        e0Var.setOnClickListener(new ii.m(rwVar, 27));
                        e0Var.setOnLongClickListener(new p4(f0Var3, 6));
                        f0Var3.C1.a(e0Var, mf.o(-1, 48));
                        i3++;
                    }
                }
        }
    }
}
