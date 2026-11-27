// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
