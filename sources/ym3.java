// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ym3 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ pcc c;

    public /* synthetic */ ym3(pcc pccVar, String str) {
        this.c = pccVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pcc pccVar = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                pccVar.a(str);
                break;
            default:
                hl.c3(new hp8(pccVar, sy8.c(str, hl.L(240.0f), r44.c, 0.75f, null), (byte) 29));
                break;
        }
    }

    public /* synthetic */ ym3(String str, pcc pccVar) {
        this.b = str;
        this.c = pccVar;
    }
}
