// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class y5b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b6b b;

    public /* synthetic */ y5b(b6b b6bVar, byte b) {
        this.a = b;
        this.b = b6bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        b6b b6bVar = this.b;
        switch (b) {
            case 0:
                b6bVar.e();
                break;
            default:
                b6bVar.b();
                break;
        }
    }
}
