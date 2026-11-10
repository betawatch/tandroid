package sg;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e1 extends g1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ d1 g;
    public final /* synthetic */ h1 h;

    public /* synthetic */ e1(h1 h1Var, d1 d1Var, int i7) {
        this.f = i7;
        this.h = h1Var;
        this.g = d1Var;
    }

    @Override // sg.g1
    public final void a() {
        switch (this.f) {
            case 0:
                y0 y0Var = this.h.h;
                float f10 = y0Var.i;
                float f11 = y0Var.j;
                this.d = f10;
                this.e = f11;
                break;
            default:
                y0 y0Var2 = this.h.h;
                float f12 = y0Var2.d;
                float f13 = y0Var2.e;
                this.d = f12;
                this.e = f13;
                break;
        }
    }

    @Override // sg.g1
    public final void b(float f10, float f11) {
        switch (this.f) {
            case 0:
                y0 y0Var = this.h.h;
                y0Var.i = f10;
                y0Var.j = f11;
                this.d = f10;
                this.e = f11;
                this.g.a();
                break;
            default:
                y0 y0Var2 = this.h.h;
                y0Var2.d = f10;
                y0Var2.e = f11;
                this.d = f10;
                this.e = f11;
                this.g.a();
                break;
        }
    }
}
