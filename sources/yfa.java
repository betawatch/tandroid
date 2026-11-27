// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
        ida idaVar;
        byte b = this.a;
        eja ejaVar = this.b;
        v5b v5bVar = (v5b) obj;
        switch (b) {
            case 0:
                ejaVar.getClass();
                idaVar = new ida(ejaVar, v5bVar, (byte) 3);
                break;
            default:
                int[] iArr = eja.t2;
                idaVar = new ida(ejaVar, v5bVar, (byte) 3);
                break;
        }
        hl.d3(idaVar, 100L);
    }
}
