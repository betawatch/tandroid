package vi;

import li.e3;
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e3 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ j0(e3 e3Var, Exception exc, int i10) {
        this.a = i10;
        this.b = e3Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = (u0) this.b.b;
                u0Var.m.a("recording segment interrupted in state=".concat(b10.x(u0Var.Z)), this.c);
                int i10 = u0Var.Z;
                if (i10 != 3) {
                    if (i10 == 2) {
                        u0Var.D = true;
                        break;
                    }
                } else {
                    u0Var.q();
                    break;
                }
                break;
            default:
                ((u0) this.b.b).h(this.c);
                break;
        }
    }
}
