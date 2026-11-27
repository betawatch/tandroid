// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wb1 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ibb b;

    public /* synthetic */ wb1(ibb ibbVar, byte b) {
        this.a = b;
        this.b = ibbVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        ibb ibbVar = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                ibbVar.setPeriod(num.intValue());
                pcc pccVar = ibbVar.B1;
                if (pccVar != null) {
                    pccVar.a(num);
                    break;
                }
                break;
            default:
                pcc pccVar2 = ibbVar.C1;
                if (pccVar2 != null) {
                    pccVar2.a(num);
                    break;
                }
                break;
        }
    }
}
