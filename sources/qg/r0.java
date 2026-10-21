package qg;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;
    public final /* synthetic */ a5.a c;

    public /* synthetic */ r0(t0 t0Var, a5.a aVar, int i10) {
        this.a = i10;
        this.b = t0Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p(this.c, true);
                break;
            default:
                t0 t0Var = this.b;
                t0Var.f.f(new r0(t0Var, this.c, 0));
                break;
        }
    }
}
