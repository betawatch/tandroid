package zi;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ j0(k0 k0Var, Exception exc, int i7) {
        this.a = i7;
        this.b = k0Var;
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
