package zi;

import y7.h7;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ j0(h7 h7Var, Exception exc, int i7) {
        this.a = i7;
        this.b = h7Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = (u0) this.b.a;
                u0Var.m.a("recording segment interrupted in state=".concat(yi.i.e(u0Var.a0)), this.c);
                int i7 = u0Var.a0;
                if (i7 != 3) {
                    if (i7 == 2) {
                        u0Var.D = true;
                        break;
                    }
                } else {
                    u0Var.q();
                    break;
                }
                break;
            default:
                ((u0) this.b.a).h(this.c);
                break;
        }
    }
}
