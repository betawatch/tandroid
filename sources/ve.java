// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ve implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pcc b;
    public final /* synthetic */ long c;

    public /* synthetic */ ve(pcc pccVar, long j, byte b) {
        this.a = b;
        this.b = pccVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.c;
        pcc pccVar = this.b;
        switch (b) {
            case 0:
                pccVar.a(Long.valueOf(j));
                break;
            default:
                pccVar.a(Long.valueOf(j));
                break;
        }
    }
}
