package sg;

import fi.b5;
import java.util.List;
import org.telegram.ui.Components.g21;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.yx;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ n(n0 n0Var, int i10) {
        this.a = i10;
        this.b = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n0 n0Var = this.b;
                g21 g21Var = n0Var.P0;
                if (g21Var != null) {
                    n0Var.P0 = null;
                    n0Var.removeView(g21Var);
                    break;
                }
                break;
            case 1:
                n0 n0Var2 = this.b;
                if (n0Var2.t0 != null) {
                    n0Var2.v0.postRunnable(new n(n0Var2, 3), 200L);
                    break;
                }
                break;
            case 2:
                y1 y1Var = this.b.a1;
                if (y1Var != null) {
                    y1Var.invalidate();
                    break;
                }
                break;
            case 3:
                n0.Y(this.b);
                break;
            default:
                n0 n0Var3 = this.b;
                boolean z10 = rg.s0.e(n0Var3.E1).k;
                int i10 = 0;
                while (true) {
                    List list = rg.l.b;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        rg.l lVar = (rg.l) list.get(i10);
                        int m10 = z10 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        yx yxVar = new yx(n0Var3, lVar, m10, 24);
                        m0 m0Var = new m0(n0Var3, n0Var3.getContext());
                        m0Var.setIcon(m10);
                        m0Var.setText(n10);
                        m0Var.setSelected(false);
                        m0Var.setOnClickListener(new ig.d0(yxVar, 18));
                        m0Var.setOnLongClickListener(new b5(n0Var3, 6));
                        n0Var3.H1.a(m0Var, gb1.r(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
