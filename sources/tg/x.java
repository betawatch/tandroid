package tg;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ x(l0 l0Var, boolean z10, int i7) {
        this.a = i7;
        this.b = l0Var;
        this.c = z10;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                o1 o1Var = l0Var.f1;
                if (gVar == l0Var.p1) {
                    l0Var.p1 = null;
                    if (!this.c) {
                        o1Var.setVisibility(8);
                    }
                    o1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                l0 l0Var2 = this.b;
                i0 i0Var = l0Var2.q1;
                if (gVar == l0Var2.w1) {
                    l0Var2.w1 = null;
                    if (!this.c) {
                        i0Var.setVisibility(8);
                        sg.j0.e(l0Var2.z1).g();
                        i0Var.getAdapter().f();
                        break;
                    }
                }
                break;
        }
    }
}
