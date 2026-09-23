package pg;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;
    public final /* synthetic */ a5.a c;

    public /* synthetic */ p0(r0 r0Var, a5.a aVar, int i10) {
        this.a = i10;
        this.b = r0Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p(this.c, true);
                break;
            default:
                r0 r0Var = this.b;
                r0Var.f.f(new p0(r0Var, this.c, 0));
                break;
        }
    }
}
