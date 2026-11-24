// default package

import java.util.function.LongSupplier;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class xs2 extends ns2 {
    public long d;
    public long e;
    public long f;

    public final ys2 u(bt2 bt2Var) {
        long j = this.d;
        r(j >= this.e && j <= this.f, Long.valueOf(j));
        final long j2 = this.d;
        ys2 ys2Var = new ys2(s(), new LongSupplier() { // from class: ws2
            @Override // java.util.function.LongSupplier
            public final long getAsLong() {
                return j2;
            }
        }, this.e, this.f, this.a);
        q(bt2Var, ys2Var);
        return ys2Var;
    }

    public final void v() {
        this.e = 0L;
        this.f = Long.MAX_VALUE;
    }
}
