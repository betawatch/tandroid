// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ymc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dnc b;
    public final /* synthetic */ int c;

    public /* synthetic */ ymc(dnc dncVar, int i, byte b) {
        this.a = b;
        this.b = dncVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        dnc dncVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new ymc(dncVar, i, (byte) 2));
                break;
            case 1:
                hl.c3(new ymc(dncVar, i, (byte) 3));
                break;
            case 2:
                dncVar.c(i);
                break;
            default:
                dncVar.a(i);
                break;
        }
    }
}
