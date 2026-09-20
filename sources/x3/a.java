package x3;

import c3.a0;
import c3.b0;
import c3.c0;
import e2.d0;
import java.math.BigInteger;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
