package x3;

import c3.a0;
import c3.b0;
import c3.c0;
import e2.d0;
import java.math.BigInteger;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a implements b0 {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // c3.b0
    public final boolean f() {
        return true;
    }

    @Override // c3.b0
    public final a0 j(long j3) {
        b bVar = this.a;
        long j10 = bVar.b;
        BigInteger valueOf = BigInteger.valueOf((bVar.d.i * j3) / 1000000);
        long j11 = bVar.c;
        c0 c0Var = new c0(j3, d0.i((valueOf.multiply(BigInteger.valueOf(j11 - j10)).divide(BigInteger.valueOf(bVar.f)).longValue() + j10) - 30000, bVar.b, j11 - 1));
        return new a0(c0Var, c0Var);
    }

    @Override // c3.b0
    public final long l() {
        return (this.a.f * 1000000) / r0.d.i;
    }
}
