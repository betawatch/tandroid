package rf;

import org.telegram.ui.kv;
import org.telegram.ui.y00;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ q(a0 a0Var, int i10) {
        this.a = i10;
        this.b = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a0 a0Var = this.b;
                y00 y00Var = a0Var.w0;
                if (y00Var != null) {
                    ((kv) y00Var).i(false, null, a0Var.u0, a0Var.v0);
                    break;
                }
                break;
            default:
                a0 a0Var2 = this.b;
                a0Var2.getClass();
                a0Var2.c = x.d;
                a0Var2.E.clear();
                int i10 = a0Var2.B0;
                if (i10 >= 0 && i10 < a0Var2.h()) {
                    a0Var2.m(a0Var2.B0);
                }
                a0Var2.Q();
                break;
        }
    }
}
