// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rab implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ sab b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ rab(sab sabVar, Runnable runnable, boolean z) {
        this.b = sabVar;
        this.c = runnable;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        Runnable runnable = this.c;
        sab sabVar = this.b;
        switch (b) {
            case 0:
                sabVar.g(runnable, z);
                break;
            default:
                runnable.run();
                sbb sbbVar = sabVar.a;
                hg5 hg5Var = sbbVar.U0;
                hg5Var.a.t(ob6.M0(z ? 2131744314 : 2131744315, null), false, true);
                hg5Var.invalidate();
                sbbVar.e(true, true);
                sbbVar.c0(true);
                sbbVar.J0.a(false, true);
                sbbVar.K0.b(true, true);
                sbbVar.h0(true, true);
                break;
        }
    }

    public /* synthetic */ rab(sab sabVar, boolean z, Runnable runnable) {
        this.b = sabVar;
        this.d = z;
        this.c = runnable;
    }
}
