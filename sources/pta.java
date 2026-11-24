// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pta implements qac {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ jva b;
    public final /* synthetic */ int c;
    public final /* synthetic */ qac d;
    public final /* synthetic */ boolean[] e;
    public final /* synthetic */ qac f;

    public /* synthetic */ pta(jva jvaVar, int i, qac qacVar, boolean[] zArr, qac qacVar2) {
        this.b = jvaVar;
        this.c = i;
        this.d = qacVar;
        this.e = zArr;
        this.f = qacVar2;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        qac qacVar = this.f;
        boolean[] zArr = this.e;
        qac qacVar2 = this.d;
        int i = this.c;
        jva jvaVar = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                zArr[0] = true;
                if (i > 0) {
                    jvaVar.O();
                }
                if (qacVar2 != null) {
                    qacVar2.a(bool.booleanValue() ? "paid" : "failed");
                }
                if (qacVar != null) {
                    qacVar.a(Boolean.TRUE);
                    break;
                }
                break;
            default:
                if (i > 0) {
                    jvaVar.O();
                }
                if (qacVar2 != null) {
                    qacVar2.a(Boolean.TRUE);
                }
                zArr[0] = true;
                if (qacVar != null) {
                    qacVar.a(bool.booleanValue() ? "paid" : "failed");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ pta(jva jvaVar, boolean[] zArr, int i, qac qacVar, qac qacVar2) {
        this.b = jvaVar;
        this.e = zArr;
        this.c = i;
        this.d = qacVar;
        this.f = qacVar2;
    }
}
