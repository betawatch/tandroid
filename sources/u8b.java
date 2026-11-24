// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class u8b implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ v8b b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ u8b(v8b v8bVar, Runnable runnable, boolean z) {
        this.b = v8bVar;
        this.c = runnable;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        Runnable runnable = this.c;
        v8b v8bVar = this.b;
        switch (b) {
            case 0:
                v8bVar.g(runnable, z);
                break;
            default:
                runnable.run();
                v9b v9bVar = v8bVar.a;
                eg5 eg5Var = v9bVar.U0;
                eg5Var.a.t(jb6.M0(z ? 2131744346 : 2131744347, null), false, true);
                eg5Var.invalidate();
                v9bVar.e(true, true);
                v9bVar.c0(true);
                v9bVar.J0.a(false, true);
                v9bVar.K0.b(true, true);
                v9bVar.h0(true, true);
                break;
        }
    }

    public /* synthetic */ u8b(v8b v8bVar, boolean z, Runnable runnable) {
        this.b = v8bVar;
        this.d = z;
        this.c = runnable;
    }
}
