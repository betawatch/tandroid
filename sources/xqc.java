// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xqc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zqc b;

    public /* synthetic */ xqc(zqc zqcVar, byte b) {
        this.a = b;
        this.b = zqcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        zqc zqcVar = this.b;
        switch (b) {
            case 0:
                zqcVar.performClick();
                break;
            default:
                zqcVar.h.invalidate();
                zqcVar.n.invalidate();
                zqcVar.e.invalidate();
                break;
        }
    }
}
