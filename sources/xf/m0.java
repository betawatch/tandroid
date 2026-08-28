package xf;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ m0(q0 q0Var, int i9) {
        this.a = i9;
        this.b = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q0 q0Var = this.b;
                q0Var.c = null;
                m5.c0 c0Var = q0Var.a;
                if (c0Var != null) {
                    c0Var.i();
                    break;
                }
                break;
            default:
                this.b.b();
                break;
        }
    }
}
