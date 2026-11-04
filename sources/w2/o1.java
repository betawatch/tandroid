package w2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o1 implements d1 {
    public final d1 a;
    public final long b;

    public o1(d1 d1Var, long j10) {
        this.a = d1Var;
        this.b = j10;
    }

    @Override // w2.d1
    public final void a() {
        this.a.a();
    }

    @Override // w2.d1
    public final boolean f() {
        return this.a.f();
    }

    @Override // w2.d1
    public final int m(long j10) {
        return this.a.m(j10 - this.b);
    }

    @Override // w2.d1
    public final int o(tf.b bVar, j2.h hVar, int i3) {
        int o10 = this.a.o(bVar, hVar, i3);
        if (o10 == -4) {
            hVar.e += this.b;
        }
        return o10;
    }
}
