package wi;

import org.telegram.ui.Components.rt;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rt b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ j0(rt rtVar, Exception exc, int i7) {
        this.a = i7;
        this.b = rtVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t0 t0Var = (t0) this.b.b;
                t0Var.m.a("recording segment interrupted in state=".concat(rf.b.u(t0Var.a0)), this.c);
                int i7 = t0Var.a0;
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
