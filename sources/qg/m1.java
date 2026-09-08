package qg;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

    @Override // qg.o1
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

    @Override // qg.o1
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
