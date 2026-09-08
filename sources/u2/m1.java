package u2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class m1 implements b1 {
    public final b1 a;
    public final long b;

    public m1(b1 b1Var, long j3) {
        this.a = b1Var;
        this.b = j3;
    }

    @Override // u2.b1
    public final void b() {
        this.a.b();
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
    public final int m(long j3) {
        return this.a.m(j3 - this.b);
    }
}
