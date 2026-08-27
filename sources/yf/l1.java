package yf;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class l1 extends n1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ k1 g;
    public final /* synthetic */ o1 h;

    public /* synthetic */ l1(o1 o1Var, k1 k1Var, int i10) {
        this.f = i10;
        this.h = o1Var;
        this.g = k1Var;
    }

    @Override // yf.n1
    public final void a() {
        switch (this.f) {
            case 0:
                e1 e1Var = this.h.h;
                float f10 = e1Var.i;
                float f11 = e1Var.j;
                this.d = f10;
                this.e = f11;
                break;
            default:
                e1 e1Var2 = this.h.h;
                float f12 = e1Var2.d;
                float f13 = e1Var2.e;
                this.d = f12;
                this.e = f13;
                break;
        }
    }

    @Override // yf.n1
    public final void b(float f10, float f11) {
        switch (this.f) {
            case 0:
                e1 e1Var = this.h.h;
                e1Var.i = f10;
                e1Var.j = f11;
                this.d = f10;
                this.e = f11;
                this.g.a();
                break;
            default:
                e1 e1Var2 = this.h.h;
                e1Var2.d = f10;
                e1Var2.e = f11;
                this.d = f10;
                this.e = f11;
                this.g.a();
                break;
        }
    }
}
