// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
