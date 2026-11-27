// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
