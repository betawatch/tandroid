package pg;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class m1 extends o1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ l1 g;
    public final /* synthetic */ p1 h;

    public /* synthetic */ m1(p1 p1Var, l1 l1Var, int i10) {
        this.f = i10;
        this.h = p1Var;
        this.g = l1Var;
    }

    @Override // pg.o1
    public final void a() {
        switch (this.f) {
            case 0:
                f1 f1Var = this.h.h;
                float f7 = f1Var.i;
                float f10 = f1Var.j;
                this.d = f7;
                this.e = f10;
                break;
            default:
                f1 f1Var2 = this.h.h;
                float f11 = f1Var2.d;
                float f12 = f1Var2.e;
                this.d = f11;
                this.e = f12;
                break;
        }
    }

    @Override // pg.o1
    public final void b(float f7, float f10) {
        switch (this.f) {
            case 0:
                f1 f1Var = this.h.h;
                f1Var.i = f7;
                f1Var.j = f10;
                this.d = f7;
                this.e = f10;
                this.g.a();
                break;
            default:
                f1 f1Var2 = this.h.h;
                f1Var2.d = f7;
                f1Var2.e = f10;
                this.d = f7;
                this.e = f10;
                this.g.a();
                break;
        }
    }
}
