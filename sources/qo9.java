// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class qo9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ qo9(int[] iArr, Runnable runnable, byte b) {
        this.a = b;
        this.b = iArr;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        Runnable runnable = this.c;
        int[] iArr = this.b;
        switch (b) {
            case 0:
                gm.c3(new qo9(iArr, runnable, b2));
                break;
            default:
                int i = iArr[0] - 1;
                iArr[0] = i;
                if (i == 0 && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
