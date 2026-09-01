package qh;

import java.util.List;
import org.telegram.ui.bu0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b5 b;

    public /* synthetic */ a4(b5 b5Var, int i10) {
        this.a = i10;
        this.b = b5Var;
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
                b5 b5Var = this.b;
                boolean z4 = dg.e1.e(b5Var.C1).k;
                int i10 = 0;
                while (true) {
                    List list = dg.l.b;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        dg.l lVar = (dg.l) list.get(i10);
                        int m9 = z4 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        bu0 bu0Var = new bu0(b5Var, lVar, m9, 12);
                        z4 z4Var = new z4(b5Var, b5Var.getContext());
                        z4Var.setIcon(m9);
                        z4Var.setText(n10);
                        z4Var.setSelected(false);
                        z4Var.setOnClickListener(new org.telegram.ui.Components.voip.o(bu0Var, 9));
                        z4Var.setOnLongClickListener(new eg.d0(b5Var, 1));
                        b5Var.F1.a(z4Var, k7.c6.n(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
