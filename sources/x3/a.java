package x3;

import c3.d0;
import c3.e0;
import c3.f0;
import e2.m0;
import java.math.BigInteger;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class a implements e0 {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // c3.e0
    public final boolean d() {
        return true;
    }

    @Override // c3.e0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // c3.e0
    public final d0 f(long j10) {
        b bVar = this.a;
        long j11 = bVar.b;
        BigInteger valueOf = BigInteger.valueOf((bVar.d.i * j10) / 1000000);
        long j12 = bVar.c;
        f0 f0Var = new f0(j10, m0.j((valueOf.multiply(BigInteger.valueOf(j12 - j11)).divide(BigInteger.valueOf(bVar.f)).longValue() + j11) - 30000, bVar.b, j12 - 1));
        return new d0(f0Var, f0Var);
    }

    @Override // c3.e0
    public final long h() {
        return (this.a.f * 1000000) / r0.d.i;
    }
}
