package sg;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ o0(u0 u0Var, int i7) {
        this.a = i7;
        this.b = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t0 t0Var = this.b.a;
                if (t0Var != null) {
                    t0Var.k();
                    break;
                }
                break;
            case 1:
                u0 u0Var = this.b;
                u0Var.c.a(u0Var.r);
                s0 s0Var = u0Var.d;
                s0Var.getClass();
                s0Var.postRunnable(new r0(s0Var, 2));
                u0Var.d = null;
                break;
            default:
                u0 u0Var2 = this.b;
                u0Var2.c.q(u0Var2.y);
                break;
        }
    }
}
