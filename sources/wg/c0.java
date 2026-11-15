package wg;

import org.telegram.messenger.m10;
import ug.g1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ c0(e0 e0Var, int i7) {
        this.a = i7;
        this.b = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e0.l1(this.b);
                break;
            default:
                e0 e0Var = this.b;
                g1 g1Var = new g1(e0Var.s1, m10.t0, null, null, null, e0Var.J0);
                g1Var.F2 = true;
                g1Var.G2 = true;
                g1Var.Y1 = true;
                e0Var.s1.showDialog(g1Var);
                break;
        }
    }
}
