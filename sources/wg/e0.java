package wg;

import org.telegram.messenger.j10;
import ug.i1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                i1 i1Var = new i1(g0Var.s1, j10.t0, null, null, null, g0Var.J0);
                i1Var.F2 = true;
                i1Var.G2 = true;
                i1Var.Y1 = true;
                g0Var.s1.showDialog(i1Var);
                break;
        }
    }
}
