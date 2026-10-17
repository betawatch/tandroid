package ug;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;

    public /* synthetic */ r0(x0 x0Var, int i10) {
        this.a = i10;
        this.b = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.X(true);
                break;
            case 1:
                this.b.c0(true, false);
                break;
            case 2:
                this.b.S();
                break;
            case 3:
                this.b.c0(true, false);
                break;
            case 4:
                this.b.c0(true, false);
                break;
            case 5:
                this.b.c0(true, false);
                break;
            case 6:
                x0 x0Var = this.b;
                x0Var.e0.clear();
                x0Var.f0.clear();
                x0Var.dismiss();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
