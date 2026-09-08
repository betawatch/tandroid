package v3;

import c3.k;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a extends k implements f {
    public final long h;
    public final int i;
    public final int j;
    public final boolean k;
    public final long l;

    public a(long j3, int i10, int i11, boolean z10, long j10) {
        super(j3, i10, i11, z10, j10);
        long j11 = j3;
        this.h = j10;
        this.i = i10;
        this.j = i11;
        this.k = z10;
        this.l = j11 == -1 ? -1L : j11;
    }

    @Override // v3.f
    public final long a(long j3) {
        return (Math.max(0L, j3 - this.b) * 8000000) / this.e;
    }

    @Override // v3.f
    public final long d() {
        return this.l;
    }

    @Override // v3.f
    public final long e() {
        return this.h;
    }

    @Override // v3.f
    public final int k() {
        return this.i;
    }
}
