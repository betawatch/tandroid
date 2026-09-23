package u2;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class l1 implements a1 {
    public final a1 a;
    public final long b;

    public l1(a1 a1Var, long j3) {
        this.a = a1Var;
        this.b = j3;
    }

    @Override // u2.a1
    public final void a() {
        this.a.a();
    }

    @Override // u2.a1
    public final boolean e() {
        return this.a.e();
    }

    @Override // u2.a1
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        int f7 = this.a.f(yVar, hVar, i10);
        if (f7 == -4) {
            hVar.e += this.b;
        }
        return f7;
    }

    @Override // u2.a1
    public final int j(long j3) {
        return this.a.j(j3 - this.b);
    }
}
