package wg;

import org.telegram.messenger.j10;
import ug.i1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
