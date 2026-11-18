package sg;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class d1 extends f1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ c1 g;
    public final /* synthetic */ g1 h;

    public /* synthetic */ d1(g1 g1Var, c1 c1Var, int i7) {
        this.f = i7;
        this.h = g1Var;
        this.g = c1Var;
    }

    @Override // sg.f1
    public final void a() {
        switch (this.f) {
            case 0:
                x0 x0Var = this.h.h;
                float f10 = x0Var.i;
                float f11 = x0Var.j;
                this.d = f10;
                this.e = f11;
                break;
            default:
                x0 x0Var2 = this.h.h;
                float f12 = x0Var2.d;
                float f13 = x0Var2.e;
                this.d = f12;
                this.e = f13;
                break;
        }
    }

    @Override // sg.f1
    public final void b(float f10, float f11) {
        switch (this.f) {
            case 0:
                x0 x0Var = this.h.h;
                x0Var.i = f10;
                x0Var.j = f11;
                this.d = f10;
                this.e = f11;
                this.g.a();
                break;
            default:
                x0 x0Var2 = this.h.h;
                x0Var2.d = f10;
                x0Var2.e = f11;
                this.d = f10;
                this.e = f11;
                this.g.a();
                break;
        }
    }
}
