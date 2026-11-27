// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class z48 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ long c;

    public /* synthetic */ z48(Runnable runnable, long j, byte b) {
        this.a = b;
        this.b = runnable;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Runnable runnable = this.b;
                hl.r(runnable);
                hl.d3(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.c)));
                break;
            case 1:
                Runnable runnable2 = this.b;
                hl.r(runnable2);
                hl.d3(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.c)));
                break;
            default:
                Runnable runnable3 = this.b;
                hl.r(runnable3);
                hl.d3(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.c)));
                break;
        }
    }
}
