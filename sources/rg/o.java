package rg;

import di.n5;
import java.util.List;
import ji.m4;
import org.telegram.ui.Components.w01;
import org.telegram.ui.ai0;
import w7.x5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0 b;

    public /* synthetic */ o(o0 o0Var, int i10) {
        this.a = i10;
        this.b = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o0 o0Var = this.b;
                w01 w01Var = o0Var.a1;
                if (w01Var != null) {
                    o0Var.a1 = null;
                    o0Var.removeView(w01Var);
                    break;
                }
                break;
            case 1:
                o0 o0Var2 = this.b;
                if (o0Var2.E0 != null) {
                    o0Var2.G0.postRunnable(new o(o0Var2, 3), 200L);
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
                        ai0 ai0Var = new ai0(o0Var3, lVar, m10, 14);
                        n0 n0Var = new n0(o0Var3, o0Var3.getContext());
                        n0Var.setIcon(m10);
                        n0Var.setText(n10);
                        n0Var.setSelected(false);
                        n0Var.setOnClickListener(new m4(ai0Var, 7));
                        n0Var.setOnLongClickListener(new n5(o0Var3, 6));
                        o0Var3.S1.a(n0Var, x5.n(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
