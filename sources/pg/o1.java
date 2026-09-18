package pg;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class o1 extends q1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ n1 g;
    public final /* synthetic */ r1 h;

    public /* synthetic */ o1(r1 r1Var, n1 n1Var, int i10) {
        this.f = i10;
        this.h = r1Var;
        this.g = n1Var;
    }

    @Override // pg.q1
    public final void a() {
        switch (this.f) {
            case 0:
                h1 h1Var = this.h.h;
                float f7 = h1Var.i;
                float f10 = h1Var.j;
                this.d = f7;
                this.e = f10;
                break;
            default:
                h1 h1Var2 = this.h.h;
                float f11 = h1Var2.d;
                float f12 = h1Var2.e;
                this.d = f11;
                this.e = f12;
                break;
        }
    }

    @Override // pg.q1
    public final void b(float f7, float f10) {
        switch (this.f) {
            case 0:
                h1 h1Var = this.h.h;
                h1Var.i = f7;
                h1Var.j = f10;
                this.d = f7;
                this.e = f10;
                this.g.a();
                break;
            default:
                h1 h1Var2 = this.h.h;
                h1Var2.d = f7;
                h1Var2.e = f10;
                this.d = f7;
                this.e = f10;
                this.g.a();
                break;
        }
    }
}
