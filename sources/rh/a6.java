package rh;

import org.telegram.messenger.jj;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.wb;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;

    public /* synthetic */ a6(c6 c6Var, int i10) {
        this.a = i10;
        this.b = c6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        c6 c6Var = this.b;
        switch (i10) {
            case 0:
                c6Var.b();
                break;
            case 1:
                c6Var.a();
                break;
            default:
                wb wbVar = c6Var.d;
                e6 e6Var = c6Var.q;
                a6 a6Var = c6Var.p;
                jj jjVar = c6Var.b;
                if (!c6Var.l) {
                    c6Var.l = true;
                    jjVar.f((int) c6Var.k, c6Var.c(), true);
                    long j10 = e6Var.g;
                    int i11 = e6Var.a;
                    e6Var.g = j10 + c6Var.k;
                    zs.f(i11).k(zs.y3, new Object[0]);
                    c6Var.k = 0L;
                    zs.f(i11).k(zs.o1, Long.valueOf(jj.B0(jjVar.k)), Integer.valueOf(jjVar.f1()), jjVar.k.reactions);
                }
                if (!c6Var.m) {
                    c6Var.m = true;
                    c6Var.f.b = 5000L;
                    org.telegram.messenger.i0.r(a6Var);
                    org.telegram.messenger.i0.h3(a6Var, 5000L);
                    wbVar.k(true);
                    wbVar.v = a6Var;
                }
                c6Var.e.b.setText(c6Var.d());
                break;
        }
    }
}
