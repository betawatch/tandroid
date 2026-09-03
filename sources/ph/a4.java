package ph;

import java.util.List;
import org.telegram.ui.gu0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c5 b;

    public /* synthetic */ a4(c5 c5Var, int i10) {
        this.a = i10;
        this.b = c5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dg.t2 t2Var = this.b.a1;
                if (t2Var != null) {
                    t2Var.invalidate();
                    break;
                }
                break;
            case 1:
                new eg.o1((org.telegram.ui.ActionBar.p2) new eg.y1(this.b, 12), 14, true).show();
                break;
            case 2:
                this.b.z0(false);
                break;
            default:
                c5 c5Var = this.b;
                boolean z4 = cg.f1.e(c5Var.C1).k;
                int i10 = 0;
                while (true) {
                    List list = cg.l.b;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        cg.l lVar = (cg.l) list.get(i10);
                        int m9 = z4 ? lVar.m() : lVar.e();
                        String n10 = lVar.n();
                        gu0 gu0Var = new gu0(c5Var, lVar, m9, 11);
                        a5 a5Var = new a5(c5Var, c5Var.getContext());
                        a5Var.setIcon(m9);
                        a5Var.setText(n10);
                        a5Var.setSelected(false);
                        a5Var.setOnClickListener(new oh.n(gu0Var, 9));
                        a5Var.setOnLongClickListener(new dg.f0(c5Var, 1));
                        c5Var.F1.a(a5Var, k7.b6.n(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
