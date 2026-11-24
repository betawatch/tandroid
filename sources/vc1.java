// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class vc1 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l9b b;

    public /* synthetic */ vc1(l9b l9bVar, byte b) {
        this.a = b;
        this.b = l9bVar;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        l9b l9bVar = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                l9bVar.setPeriod(num.intValue());
                qac qacVar = l9bVar.B1;
                if (qacVar != null) {
                    qacVar.a(num);
                    break;
                }
                break;
            default:
                qac qacVar2 = l9bVar.C1;
                if (qacVar2 != null) {
                    qacVar2.a(num);
                    break;
                }
                break;
        }
    }
}
