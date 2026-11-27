// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class u0c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l1c b;

    public /* synthetic */ u0c(l1c l1cVar, byte b) {
        this.a = b;
        this.b = l1cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        l1c l1cVar = this.b;
        switch (b) {
            case 0:
                if (l1cVar.i()) {
                    l1cVar.j();
                    break;
                }
                break;
            default:
                b1c b1cVar = l1cVar.K;
                b1cVar.A1(true);
                z0c z0cVar = l1cVar.y;
                z0cVar.A1(true);
                l1cVar.N.a(true, true);
                hl.V3(z0cVar);
                hl.V3(b1cVar);
                break;
        }
    }
}
