package wg;

import org.telegram.messenger.k10;
import ug.h1;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ e0(g0 g0Var, int i7) {
        this.a = i7;
        this.b = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0.m1(this.b);
                break;
            default:
                g0 g0Var = this.b;
                h1 h1Var = new h1(g0Var.s1, k10.t0, null, null, null, g0Var.J0);
                h1Var.F2 = true;
                h1Var.G2 = true;
                h1Var.Y1 = true;
                g0Var.s1.showDialog(h1Var);
                break;
        }
    }
}
