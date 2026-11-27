// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
