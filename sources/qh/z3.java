package qh;

import java.util.List;
import org.telegram.ui.gu0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a5 b;

    public /* synthetic */ z3(a5 a5Var, int i10) {
        this.a = i10;
        this.b = a5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                eg.r2 r2Var = this.b.a1;
                if (r2Var != null) {
                    r2Var.invalidate();
                    break;
                }
                break;
            case 1:
                new fg.n1((org.telegram.ui.ActionBar.p2) new fg.x1(this.b, 12), 14, true).show();
                break;
            case 2:
                this.b.z0(false);
                break;
            default:
                a5 a5Var = this.b;
                boolean z4 = dg.e1.e(a5Var.C1).k;
                int i10 = 0;
                while (true) {
                    List list = dg.l.b;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        dg.l lVar = (dg.l) list.get(i10);
                        int m9 = z4 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        gu0 gu0Var = new gu0(a5Var, lVar, m9, 12);
                        y4 y4Var = new y4(a5Var, a5Var.getContext());
                        y4Var.setIcon(m9);
                        y4Var.setText(n10);
                        y4Var.setSelected(false);
                        y4Var.setOnClickListener(new org.telegram.ui.Components.voip.o(gu0Var, 9));
                        y4Var.setOnLongClickListener(new eg.d0(a5Var, 1));
                        a5Var.F1.a(y4Var, k7.c6.n(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
