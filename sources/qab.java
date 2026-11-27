// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qab implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ rab b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ qab(rab rabVar, Runnable runnable, boolean z) {
        this.b = rabVar;
        this.c = runnable;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        Runnable runnable = this.c;
        rab rabVar = this.b;
        switch (b) {
            case 0:
                rabVar.g(runnable, z);
                break;
            default:
                runnable.run();
                rbb rbbVar = rabVar.a;
                hg5 hg5Var = rbbVar.U0;
                hg5Var.a.t(ob6.M0(z ? 2131744314 : 2131744315, null), false, true);
                hg5Var.invalidate();
                rbbVar.e(true, true);
                rbbVar.c0(true);
                rbbVar.J0.a(false, true);
                rbbVar.K0.b(true, true);
                rbbVar.h0(true, true);
                break;
        }
    }

    public /* synthetic */ qab(rab rabVar, boolean z, Runnable runnable) {
        this.b = rabVar;
        this.d = z;
        this.c = runnable;
    }
}
