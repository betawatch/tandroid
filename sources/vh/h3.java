package vh;

import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;

    public /* synthetic */ h3(b4 b4Var, int i10) {
        this.a = i10;
        this.b = b4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jg.d2 d2Var = this.b.M0;
                if (d2Var != null) {
                    d2Var.invalidate();
                    break;
                }
                break;
            case 1:
                new kg.i1((org.telegram.ui.ActionBar.k2) new kg.q1(this.b, 13), 14, true).show();
                break;
            case 2:
                this.b.w0(false);
                break;
            default:
                b4 b4Var = this.b;
                boolean z10 = ig.s0.e(b4Var.o1).k;
                int i10 = 0;
                while (true) {
                    List list = ig.g.c;
                    if (i10 >= list.size()) {
                        break;
                    } else {
                        ig.g gVar = (ig.g) list.get(i10);
                        int m10 = z10 ? gVar.m() : gVar.e();
                        String n10 = gVar.n();
                        org.telegram.ui.Wallet.x0 x0Var = new org.telegram.ui.Wallet.x0(b4Var, gVar, m10, 21);
                        z3 z3Var = new z3(b4Var, b4Var.getContext());
                        z3Var.setIcon(m10);
                        z3Var.setText(n10);
                        z3Var.setSelected(false);
                        z3Var.setOnClickListener(new rh.s(x0Var, 20));
                        z3Var.setOnLongClickListener(new bi.h1(b4Var, 5));
                        b4Var.r1.a(z3Var, w7.b6.o(-1, 48));
                        i10++;
                    }
                }
        }
    }
}
