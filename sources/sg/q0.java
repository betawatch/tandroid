package sg;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ q0(r0 r0Var, int i7) {
        this.a = i7;
        this.b = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b.b.d;
                if (u0Var != null) {
                    u0Var.postRunnable(u0Var.x);
                    break;
                }
                break;
            case 1:
                u0 u0Var2 = this.b.b.d;
                if (u0Var2 != null) {
                    u0Var2.postRunnable(u0Var2.x);
                    break;
                }
                break;
            default:
                w0 w0Var = this.b.b;
                u0 u0Var3 = w0Var.d;
                u0Var3.getClass();
                u0Var3.postRunnable(new s0(u0Var3, 2));
                w0Var.d = null;
                break;
        }
    }
}
