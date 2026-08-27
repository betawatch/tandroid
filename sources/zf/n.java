package zf;

import h7.z5;
import java.util.List;
import lh.b5;
import lh.c5;
import org.telegram.ui.Components.f01;
import org.telegram.ui.ol0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ n(l0 l0Var, int i10) {
        this.a = i10;
        this.b = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                f01 f01Var = l0Var.W0;
                if (f01Var != null) {
                    l0Var.W0 = null;
                    l0Var.removeView(f01Var);
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
                boolean z10 = yf.r0.e(l0Var3.L1).k;
                int i10 = 0;
                while (true) {
                    List list = yf.l.b;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        yf.l lVar = (yf.l) list.get(i10);
                        int m10 = z10 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        ol0 ol0Var = new ol0(l0Var3, lVar, m10, 18);
                        k0 k0Var = new k0(l0Var3, l0Var3.getContext());
                        k0Var.setIcon(m10);
                        k0Var.setText(n10);
                        k0Var.setSelected(false);
                        k0Var.setOnClickListener(new c5(ol0Var, 26));
                        k0Var.setOnLongClickListener(new b5(l0Var3, 6));
                        l0Var3.O1.a(k0Var, z5.n(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
