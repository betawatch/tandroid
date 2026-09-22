package pg;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class p1 extends r1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ o1 g;
    public final /* synthetic */ s1 h;

    public /* synthetic */ p1(s1 s1Var, o1 o1Var, int i10) {
        this.f = i10;
        this.h = s1Var;
        this.g = o1Var;
    }

    @Override // pg.r1
    public final void a() {
        switch (this.f) {
            case 0:
                i1 i1Var = this.h.h;
                float f7 = i1Var.i;
                float f10 = i1Var.j;
                this.d = f7;
                this.e = f10;
                break;
            default:
                i1 i1Var2 = this.h.h;
                float f11 = i1Var2.d;
                float f12 = i1Var2.e;
                this.d = f11;
                this.e = f12;
                break;
        }
    }

    @Override // pg.r1
    public final void b(float f7, float f10) {
        switch (this.f) {
            case 0:
                i1 i1Var = this.h.h;
                i1Var.i = f7;
                i1Var.j = f10;
                this.d = f7;
                this.e = f10;
                this.g.a();
                break;
            default:
                i1 i1Var2 = this.h.h;
                i1Var2.d = f7;
                i1Var2.e = f10;
                this.d = f7;
                this.e = f10;
                this.g.a();
                break;
        }
    }
}
