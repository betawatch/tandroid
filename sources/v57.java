// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class v57 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Runnable[] c;

    public /* synthetic */ v57(boolean[] zArr, Runnable[] runnableArr, byte b) {
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
