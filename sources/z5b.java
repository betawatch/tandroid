// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z5b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b6b b;

    public /* synthetic */ z5b(b6b b6bVar, byte b) {
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
