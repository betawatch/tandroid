// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vrc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yrc b;

    public /* synthetic */ vrc(yrc yrcVar, byte b) {
        this.a = b;
        this.b = yrcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        yrc yrcVar = this.b;
        switch (b) {
            case 0:
                yrcVar.i();
                break;
            default:
                Runnable runnable = yrcVar.d0;
                yrcVar.d0 = null;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
