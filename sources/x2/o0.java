package x2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ o0(v0 v0Var, int i7) {
        this.a = i7;
        this.b = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b0 = true;
                break;
            case 1:
                this.b.u();
                break;
            default:
                v0 v0Var = this.b;
                if (!v0Var.h0) {
                    c0 c0Var = v0Var.I;
                    c0Var.getClass();
                    c0Var.d(v0Var);
                    break;
                }
                break;
        }
    }
}
