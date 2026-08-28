package xf;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;
    public final /* synthetic */ a6.a c;

    public /* synthetic */ n0(q0 q0Var, a6.a aVar, int i9) {
        this.a = i9;
        this.b = q0Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p(this.c, true);
                break;
            default:
                q0 q0Var = this.b;
                q0Var.f.f(new n0(q0Var, this.c, 0));
                break;
        }
    }
}
