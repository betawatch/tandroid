package sg;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class c1 extends e1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ b1 g;
    public final /* synthetic */ f1 h;

    public /* synthetic */ c1(f1 f1Var, b1 b1Var, int i7) {
        this.f = i7;
        this.h = f1Var;
        this.g = b1Var;
    }

    @Override // sg.e1
    public final void a() {
        switch (this.f) {
            case 0:
                w0 w0Var = this.h.h;
                float f10 = w0Var.i;
                float f11 = w0Var.j;
                this.d = f10;
                this.e = f11;
                break;
            default:
                w0 w0Var2 = this.h.h;
                float f12 = w0Var2.d;
                float f13 = w0Var2.e;
                this.d = f12;
                this.e = f13;
                break;
        }
    }

    @Override // sg.e1
    public final void b(float f10, float f11) {
        switch (this.f) {
            case 0:
                w0 w0Var = this.h.h;
                w0Var.i = f10;
                w0Var.j = f11;
                this.d = f10;
                this.e = f11;
                this.g.a();
                break;
            default:
                w0 w0Var2 = this.h.h;
                w0Var2.d = f10;
                w0Var2.e = f11;
                this.d = f10;
                this.e = f11;
                this.g.a();
                break;
        }
    }
}
