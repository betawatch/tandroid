package qg;

import ci.m5;
import java.util.List;
import org.telegram.ui.Components.w01;
import org.telegram.ui.yl0;
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;

    public /* synthetic */ n(p0 p0Var, int i10) {
        this.a = i10;
        this.b = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p0 p0Var = this.b;
                w01 w01Var = p0Var.a1;
                if (w01Var != null) {
                    p0Var.a1 = null;
                    p0Var.removeView(w01Var);
                    break;
                }
                break;
            case 1:
                p0 p0Var2 = this.b;
                if (p0Var2.E0 != null) {
                    p0Var2.G0.postRunnable(new n(p0Var2, 3), 200L);
                    break;
                }
                break;
            case 2:
                z1 z1Var = this.b.l1;
                if (z1Var != null) {
                    z1Var.invalidate();
                    break;
                }
                break;
            case 3:
                p0.a0(this.b);
                break;
            default:
                p0 p0Var3 = this.b;
                boolean z10 = pg.t0.e(p0Var3.P1).k;
                int i10 = 0;
                while (true) {
                    List list = pg.l.b;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        pg.l lVar = (pg.l) list.get(i10);
                        int m10 = z10 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        yl0 yl0Var = new yl0(p0Var3, lVar, m10, 12);
                        o0 o0Var = new o0(p0Var3, p0Var3.getContext());
                        o0Var.setIcon(m10);
                        o0Var.setText(n10);
                        o0Var.setSelected(false);
                        int i11 = 6;
                        o0Var.setOnClickListener(new org.telegram.ui.Components.voip.o(yl0Var, i11));
                        o0Var.setOnLongClickListener(new m5(p0Var3, i11));
                        p0Var3.S1.a(o0Var, x5.n(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
