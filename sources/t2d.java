// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class t2d implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t2d(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b;
        byte b2 = this.a;
        Object obj2 = this.b;
        switch (b2) {
            case 0:
                v2d v2dVar = (v2d) obj2;
                if (((sx5) obj) == sx5.d && ((b = v2dVar.s) == 2 || b == 3)) {
                    v2dVar.s = (byte) 1;
                }
                v2dVar.h.run();
                break;
            default:
                ((of3) obj2).l0(true);
                break;
        }
    }
}
