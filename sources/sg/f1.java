package sg;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class f1 extends h1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ e1 g;
    public final /* synthetic */ i1 h;

    public /* synthetic */ f1(i1 i1Var, e1 e1Var, int i7) {
        this.f = i7;
        this.h = i1Var;
        this.g = e1Var;
    }

    @Override // sg.h1
    public final void a() {
        switch (this.f) {
            case 0:
                z0 z0Var = this.h.h;
                float f10 = z0Var.i;
                float f11 = z0Var.j;
                this.d = f10;
                this.e = f11;
                break;
            default:
                z0 z0Var2 = this.h.h;
                float f12 = z0Var2.d;
                float f13 = z0Var2.e;
                this.d = f12;
                this.e = f13;
                break;
        }
    }

    @Override // sg.h1
    public final void b(float f10, float f11) {
        switch (this.f) {
            case 0:
                z0 z0Var = this.h.h;
                z0Var.i = f10;
                z0Var.j = f11;
                this.d = f10;
                this.e = f11;
                this.g.a();
                break;
            default:
                z0 z0Var2 = this.h.h;
                z0Var2.d = f10;
                z0Var2.e = f11;
                this.d = f10;
                this.e = f11;
                this.g.a();
                break;
        }
    }
}
