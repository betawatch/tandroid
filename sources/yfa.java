// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yfa implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eja b;

    public /* synthetic */ yfa(eja ejaVar, byte b) {
        this.a = b;
        this.b = ejaVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        kba kbaVar;
        byte b = this.a;
        eja ejaVar = this.b;
        w5b w5bVar = (w5b) obj;
        switch (b) {
            case 0:
                ejaVar.getClass();
                kbaVar = new kba(ejaVar, w5bVar, (byte) 4);
                break;
            default:
                int[] iArr = eja.t2;
                kbaVar = new kba(ejaVar, w5bVar, (byte) 4);
                break;
        }
        hl.d3(kbaVar, 100L);
    }
}
