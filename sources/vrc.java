// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
