// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
