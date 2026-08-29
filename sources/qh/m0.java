package qh;

import nh.d6;
import org.telegram.ui.Components.c5;
import th.x1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m0(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o0 o0Var = (o0) this.c;
                o0Var.i = null;
                o0Var.g.l(this.b);
                o0Var.l++;
                o0Var.a();
                n0 n0Var = o0Var.h;
                if (n0Var != null) {
                    n0Var.k();
                    break;
                }
                break;
            case 1:
                th.p pVar = (th.p) this.c;
                c5.M(pVar.b.b0.getParentActivity(), this.b, new org.telegram.ui.Components.n(pVar, 18), pVar.a);
                break;
            default:
                x1 x1Var = (x1) this.c;
                c5.M(x1Var.getParentActivity(), this.b, new d6(x1Var, 26), x1Var.getResourceProvider());
                break;
        }
    }
}
