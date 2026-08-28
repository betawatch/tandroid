package xf;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m1 extends o1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ l1 g;
    public final /* synthetic */ p1 h;

    public /* synthetic */ m1(p1 p1Var, l1 l1Var, int i9) {
        this.f = i9;
        this.h = p1Var;
        this.g = l1Var;
    }

    @Override // xf.o1
    public final void a() {
        switch (this.f) {
            case 0:
                f1 f1Var = this.h.h;
                float f10 = f1Var.i;
                float f11 = f1Var.j;
                this.d = f10;
                this.e = f11;
                break;
            default:
                f1 f1Var2 = this.h.h;
                float f12 = f1Var2.d;
                float f13 = f1Var2.e;
                this.d = f12;
                this.e = f13;
                break;
        }
    }

    @Override // xf.o1
    public final void b(float f10, float f11) {
        switch (this.f) {
            case 0:
                f1 f1Var = this.h.h;
                f1Var.i = f10;
                f1Var.j = f11;
                this.d = f10;
                this.e = f11;
                this.g.a();
                break;
            default:
                f1 f1Var2 = this.h.h;
                f1Var2.d = f10;
                f1Var2.e = f11;
                this.d = f10;
                this.e = f11;
                this.g.a();
                break;
        }
    }
}
