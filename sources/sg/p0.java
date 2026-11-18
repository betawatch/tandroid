package sg;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ p0(q0 q0Var, int i7) {
        this.a = i7;
        this.b = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s0 s0Var = this.b.b.d;
                if (s0Var != null) {
                    s0Var.postRunnable(s0Var.x);
                    break;
                }
                break;
            case 1:
                s0 s0Var2 = this.b.b.d;
                if (s0Var2 != null) {
                    s0Var2.postRunnable(s0Var2.x);
                    break;
                }
                break;
            default:
                u0 u0Var = this.b.b;
                s0 s0Var3 = u0Var.d;
                s0Var3.getClass();
                s0Var3.postRunnable(new r0(s0Var3, 2));
                u0Var.d = null;
                break;
        }
    }
}
