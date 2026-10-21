package ug;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y0 b;

    public /* synthetic */ s0(y0 y0Var, int i10) {
        this.a = i10;
        this.b = y0Var;
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
                y0 y0Var = this.b;
                y0Var.e0.clear();
                y0Var.f0.clear();
                y0Var.dismiss();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
