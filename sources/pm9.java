// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class pm9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ pm9(int[] iArr, Runnable runnable, byte b) {
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
                gl.c3(new pm9(iArr, runnable, b2));
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
