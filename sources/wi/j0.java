package wi;

import org.telegram.ui.Components.qt;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
