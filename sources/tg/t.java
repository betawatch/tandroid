package tg;

import c8.na;
import hi.y4;
import java.util.List;
import org.telegram.ui.Components.e21;
import org.telegram.ui.Components.nz0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ t(l0 l0Var, int i7) {
        this.a = i7;
        this.b = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                nz0 nz0Var = l0Var.K0;
                if (nz0Var != null) {
                    l0Var.K0 = null;
                    l0Var.removeView(nz0Var);
                    break;
                }
                break;
            case 1:
                l0 l0Var2 = this.b;
                if (l0Var2.o0 != null) {
                    l0Var2.q0.postRunnable(new t(l0Var2, 4), 200L);
                    break;
                }
                break;
            case 2:
                r1 r1Var = this.b.V0;
                if (r1Var != null) {
                    r1Var.invalidate();
                    break;
                }
                break;
            case 3:
                r1 r1Var2 = this.b.V0;
                if (r1Var2 != null) {
                    r1Var2.invalidate();
                    break;
                }
                break;
            case 4:
                l0.X(this.b);
                break;
            default:
                l0 l0Var3 = this.b;
                boolean z10 = sg.j0.e(l0Var3.z1).k;
                int i7 = 0;
                while (true) {
                    List list = sg.g.c;
                    if (i7 >= list.size()) {
                        break;
                    } else {
                        sg.g gVar = (sg.g) list.get(i7);
                        int m10 = z10 ? gVar.m() : gVar.e();
                        String n10 = gVar.n();
                        e21 e21Var = new e21(l0Var3, gVar, m10, 26);
                        k0 k0Var = new k0(l0Var3, l0Var3.getContext());
                        k0Var.setIcon(m10);
                        k0Var.setText(n10);
                        k0Var.setSelected(false);
                        k0Var.setOnClickListener(new a0(e21Var, 0));
                        k0Var.setOnLongClickListener(new y4(l0Var3, 6));
                        l0Var3.C1.a(k0Var, na.o(-1, 48));
                        i7++;
                    }
                }
        }
    }
}
