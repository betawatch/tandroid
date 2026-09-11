package u2;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
    public final int f(n4.y yVar, h2.g gVar, int i10) {
        int f7 = this.a.f(yVar, gVar, i10);
        if (f7 == -4) {
            gVar.h += this.b;
        }
        return f7;
    }

    @Override // u2.b1
    public final int m(long j3) {
        return this.a.m(j3 - this.b);
    }
}
