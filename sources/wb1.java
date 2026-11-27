// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wb1 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hbb b;

    public /* synthetic */ wb1(hbb hbbVar, byte b) {
        this.a = b;
        this.b = hbbVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        hbb hbbVar = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                hbbVar.setPeriod(num.intValue());
                pcc pccVar = hbbVar.B1;
                if (pccVar != null) {
                    pccVar.a(num);
                    break;
                }
                break;
            default:
                pcc pccVar2 = hbbVar.C1;
                if (pccVar2 != null) {
                    pccVar2.a(num);
                    break;
                }
                break;
        }
    }
}
