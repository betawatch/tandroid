// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
