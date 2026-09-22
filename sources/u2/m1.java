package u2;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class m1 implements b1 {
    public final b1 a;
    public final long b;

    public m1(b1 b1Var, long j3) {
        this.a = b1Var;
        this.b = j3;
    }

    @Override // u2.b1
    public final void a() {
        this.a.a();
    }

    @Override // u2.b1
    public final boolean e() {
        return this.a.e();
    }

    @Override // u2.b1
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        int f7 = this.a.f(yVar, hVar, i10);
        if (f7 == -4) {
            hVar.e += this.b;
        }
        return f7;
    }

    @Override // u2.b1
    public final int j(long j3) {
        return this.a.j(j3 - this.b);
    }
}
