// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s6b implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ t6b b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ s6b(t6b t6bVar, Runnable runnable, boolean z) {
        this.b = t6bVar;
        this.c = runnable;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        Runnable runnable = this.c;
        t6b t6bVar = this.b;
        switch (b) {
            case 0:
                t6bVar.g(runnable, z);
                break;
            default:
                runnable.run();
                t7b t7bVar = t6bVar.a;
                ge5 ge5Var = t7bVar.U0;
                ge5Var.a.t(k96.M0(z ? 2131744420 : 2131744421, null), false, true);
                ge5Var.invalidate();
                t7bVar.e(true, true);
                t7bVar.c0(true);
                t7bVar.J0.a(false, true);
                t7bVar.K0.b(true, true);
                t7bVar.h0(true, true);
                break;
        }
    }

    public /* synthetic */ s6b(t6b t6bVar, boolean z, Runnable runnable) {
        this.b = t6bVar;
        this.d = z;
        this.c = runnable;
    }
}
