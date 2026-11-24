// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class v77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Runnable[] c;

    public /* synthetic */ v77(boolean[] zArr, Runnable[] runnableArr, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = runnableArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Runnable[] runnableArr = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                zArr[0] = true;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                zArr[0] = true;
                Runnable runnable2 = runnableArr[0];
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
