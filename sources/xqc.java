// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
