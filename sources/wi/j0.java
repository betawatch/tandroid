package wi;

import org.telegram.ui.Components.qt;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qt b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ j0(qt qtVar, Exception exc, int i7) {
        this.a = i7;
        this.b = qtVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t0 t0Var = (t0) this.b.b;
                t0Var.m.a("recording segment interrupted in state=".concat(rf.b.t(t0Var.Z)), this.c);
                int i7 = t0Var.Z;
                if (i7 != 3) {
                    if (i7 == 2) {
                        t0Var.D = true;
                        break;
                    }
                } else {
                    t0Var.q();
                    break;
                }
                break;
            default:
                ((t0) this.b.b).h(this.c);
                break;
        }
    }
}
