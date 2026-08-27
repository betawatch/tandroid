package zf;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ r(l0 l0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = l0Var;
        this.c = z10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                t1 t1Var = l0Var.r1;
                if (hVar == l0Var.B1) {
                    l0Var.B1 = null;
                    if (!this.c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                l0 l0Var2 = this.b;
                i0 i0Var = l0Var2.C1;
                if (hVar == l0Var2.I1) {
                    l0Var2.I1 = null;
                    if (!this.c) {
                        i0Var.setVisibility(8);
                        yf.r0.e(l0Var2.L1).g();
                        i0Var.getAdapter().l();
                        break;
                    }
                }
                break;
        }
    }
}
