package pg;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;
    public final /* synthetic */ a5.a c;

    public /* synthetic */ q0(s0 s0Var, a5.a aVar, int i10) {
        this.a = i10;
        this.b = s0Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p(this.c, true);
                break;
            default:
                s0 s0Var = this.b;
                s0Var.f.f(new q0(s0Var, this.c, 0));
                break;
        }
    }
}
