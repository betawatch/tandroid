// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sva implements pcc {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ jxa b;
    public final /* synthetic */ int c;
    public final /* synthetic */ pcc d;
    public final /* synthetic */ boolean[] e;
    public final /* synthetic */ pcc f;

    public /* synthetic */ sva(jxa jxaVar, int i, pcc pccVar, boolean[] zArr, pcc pccVar2) {
        this.b = jxaVar;
        this.c = i;
        this.d = pccVar;
        this.e = zArr;
        this.f = pccVar2;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        pcc pccVar = this.f;
        boolean[] zArr = this.e;
        pcc pccVar2 = this.d;
        int i = this.c;
        jxa jxaVar = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                zArr[0] = true;
                if (i > 0) {
                    jxaVar.P();
                }
                if (pccVar2 != null) {
                    pccVar2.a(bool.booleanValue() ? "paid" : "failed");
                }
                if (pccVar != null) {
                    pccVar.a(Boolean.TRUE);
                    break;
                }
                break;
            default:
                if (i > 0) {
                    jxaVar.P();
                }
                if (pccVar2 != null) {
                    pccVar2.a(Boolean.TRUE);
                }
                zArr[0] = true;
                if (pccVar != null) {
                    pccVar.a(bool.booleanValue() ? "paid" : "failed");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ sva(jxa jxaVar, boolean[] zArr, int i, pcc pccVar, pcc pccVar2) {
        this.b = jxaVar;
        this.e = zArr;
        this.c = i;
        this.d = pccVar;
        this.f = pccVar2;
    }
}
