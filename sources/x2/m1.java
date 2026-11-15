package x2;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
