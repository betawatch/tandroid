package x3;

import c3.a0;
import c3.b0;
import c3.c0;
import e2.n0;
import java.math.BigInteger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a implements b0 {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // c3.b0
    public final boolean d() {
        return true;
    }

    @Override // c3.b0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // c3.b0
    public final a0 f(long j10) {
        b bVar = this.a;
        long j11 = bVar.b;
        BigInteger valueOf = BigInteger.valueOf((bVar.d.i * j10) / 1000000);
        long j12 = bVar.c;
        c0 c0Var = new c0(j10, n0.j((valueOf.multiply(BigInteger.valueOf(j12 - j11)).divide(BigInteger.valueOf(bVar.f)).longValue() + j11) - 30000, bVar.b, j12 - 1));
        return new a0(c0Var, c0Var);
    }

    @Override // c3.b0
    public final long h() {
        return (this.a.f * 1000000) / r0.d.i;
    }
}
