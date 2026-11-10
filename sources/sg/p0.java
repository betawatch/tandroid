package sg;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ p0(v0 v0Var, int i7) {
        this.a = i7;
        this.b = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b.a;
                if (u0Var != null) {
                    u0Var.o();
                    break;
                }
                break;
            case 1:
                v0 v0Var = this.b;
                v0Var.c.a(v0Var.r);
                t0 t0Var = v0Var.d;
                t0Var.getClass();
                t0Var.postRunnable(new s0(t0Var, 2));
                v0Var.d = null;
                break;
            default:
                v0 v0Var2 = this.b;
                v0Var2.c.q(v0Var2.y);
                break;
        }
    }
}
