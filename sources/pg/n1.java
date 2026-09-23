package pg;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class n1 extends p1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ m1 g;
    public final /* synthetic */ q1 h;

    public /* synthetic */ n1(q1 q1Var, m1 m1Var, int i10) {
        this.f = i10;
        this.h = q1Var;
        this.g = m1Var;
    }

    @Override // pg.p1
    public final void a() {
        switch (this.f) {
            case 0:
                g1 g1Var = this.h.h;
                float f7 = g1Var.i;
                float f10 = g1Var.j;
                this.d = f7;
                this.e = f10;
                break;
            default:
                g1 g1Var2 = this.h.h;
                float f11 = g1Var2.d;
                float f12 = g1Var2.e;
                this.d = f11;
                this.e = f12;
                break;
        }
    }

    @Override // pg.p1
    public final void b(float f7, float f10) {
        switch (this.f) {
            case 0:
                g1 g1Var = this.h.h;
                g1Var.i = f7;
                g1Var.j = f10;
                this.d = f7;
                this.e = f10;
                this.g.a();
                break;
            default:
                g1 g1Var2 = this.h.h;
                g1Var2.d = f7;
                g1Var2.e = f10;
                this.d = f7;
                this.e = f10;
                this.g.a();
                break;
        }
    }
}
