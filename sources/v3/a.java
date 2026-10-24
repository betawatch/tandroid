package v3;

import c3.k;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class a extends k implements h {
    public final long i;
    public final int j;
    public final int k;
    public final boolean l;
    public final long m;

    public a(long j10, long j11, int i10, int i11, boolean z10, boolean z11) {
        super(j10, j11, i10, i11, z10, z11);
        long j12 = j10;
        this.i = j11;
        this.j = i10;
        this.k = i11;
        this.l = z10;
        this.m = j12 == -1 ? -1L : j12;
    }

    @Override // v3.h
    public final long a() {
        return this.m;
    }

    @Override // v3.h
    public final long b(long j10) {
        return (Math.max(0L, j10 - this.b) * 8000000) / this.e;
    }

    @Override // v3.h
    public final long c() {
        return this.i;
    }

    @Override // v3.h
    public final int g() {
        return this.j;
    }
}
