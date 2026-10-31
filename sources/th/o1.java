package th;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ long c;

    public /* synthetic */ o1(int i10, long j10, Runnable runnable) {
        this.a = i10;
        this.b = runnable;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Runnable runnable = this.b;
                org.telegram.messenger.i0.r(runnable);
                org.telegram.messenger.i0.h3(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.c)));
                break;
            case 1:
                Runnable runnable2 = this.b;
                org.telegram.messenger.i0.r(runnable2);
                org.telegram.messenger.i0.h3(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.c)));
                break;
            default:
                Runnable runnable3 = this.b;
                org.telegram.messenger.i0.r(runnable3);
                org.telegram.messenger.i0.h3(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.c)));
                break;
        }
    }
}
