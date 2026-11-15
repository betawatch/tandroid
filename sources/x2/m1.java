package x2;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class m1 implements b1 {
    public final b1 a;
    public final long b;

    public m1(b1 b1Var, long j3) {
        this.a = b1Var;
        this.b = j3;
    }

    @Override // x2.b1
    public final void a() {
        this.a.a();
    }

    @Override // x2.b1
    public final boolean f() {
        return this.a.f();
    }

    @Override // x2.b1
    public final int n(long j3) {
        return this.a.n(j3 - this.b);
    }

    @Override // x2.b1
    public final int q(k8.a aVar, k2.h hVar, int i7) {
        int q10 = this.a.q(aVar, hVar, i7);
        if (q10 == -4) {
            hVar.e += this.b;
        }
        return q10;
    }
}
