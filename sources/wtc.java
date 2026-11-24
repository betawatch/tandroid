// default package

import java.math.RoundingMode;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wtc implements ix9 {
    public final tm9 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public wtc(tm9 tm9Var, int i, long j, long j2) {
        this.a = tm9Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / tm9Var.c;
        this.d = j3;
        this.e = i(j3);
    }

    @Override // ix9
    public final boolean c() {
        return true;
    }

    @Override // ix9
    public final boolean d() {
        return false;
    }

    @Override // ix9
    public final hx9 f(long j) {
        tm9 tm9Var = this.a;
        long j2 = this.d - 1;
        long j3 = hac.j((tm9Var.b * j) / (this.b * 1000000), 0L, j2);
        int i = tm9Var.c;
        long j4 = this.c;
        long i2 = i(j3);
        kx9 kx9Var = new kx9(i2, (i * j3) + j4);
        if (i2 >= j || j3 == j2) {
            return new hx9(kx9Var, kx9Var);
        }
        long j5 = j3 + 1;
        return new hx9(kx9Var, new kx9(i(j5), (i * j5) + j4));
    }

    @Override // ix9
    public final long h() {
        return this.e;
    }

    public final long i(long j) {
        long j2 = j * this.b;
        long j3 = this.a.b;
        String str = hac.a;
        return hac.b0(j2, 1000000L, j3, RoundingMode.DOWN);
    }
}
