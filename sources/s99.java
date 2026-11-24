// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class s99 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ qac c;

    public /* synthetic */ s99(jva jvaVar, boolean[] zArr, qac qacVar) {
        this.a = (byte) 2;
        this.b = zArr;
        this.c = qacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qac qacVar = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (!zArr[0] && qacVar != null) {
                    zArr[0] = true;
                    qacVar.a(Boolean.TRUE);
                }
                gm.d3(new bo6((byte) 16), 220L);
                break;
            case 1:
                if (!zArr[0] && qacVar != null) {
                    zArr[0] = true;
                    qacVar.a(Boolean.FALSE);
                    break;
                }
                break;
            default:
                if (!zArr[0] && qacVar != null) {
                    qacVar.a("cancelled");
                    zArr[0] = true;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ s99(byte b, qac qacVar, boolean[] zArr) {
        this.a = b;
        this.b = zArr;
        this.c = qacVar;
    }
}
