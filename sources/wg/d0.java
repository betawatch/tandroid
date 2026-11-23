package wg;

import org.telegram.messenger.i10;
import ug.h1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ d0(f0 f0Var, int i7) {
        this.a = i7;
        this.b = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f0.m1(this.b);
                break;
            default:
                f0 f0Var = this.b;
                h1 h1Var = new h1(f0Var.s1, i10.t0, null, null, null, f0Var.J0);
                h1Var.F2 = true;
                h1Var.G2 = true;
                h1Var.Y1 = true;
                f0Var.s1.showDialog(h1Var);
                break;
        }
    }
}
