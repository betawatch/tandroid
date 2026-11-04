package x3;

import e3.k;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends k implements h {
    public final long i;
    public final int j;
    public final int k;
    public final boolean l;
    public final long m;

    public a(long j10, long j11, int i3, int i10, boolean z10, boolean z11) {
        super(j10, j11, i3, i10, z10, z11);
        long j12 = j10;
        this.i = j11;
        this.j = i3;
        this.k = i10;
        this.l = z10;
        this.m = j12 == -1 ? -1L : j12;
    }

    @Override // x3.h
    public final long a() {
        return this.m;
    }

    @Override // x3.h
    public final long b(long j10) {
        return (Math.max(0L, j10 - this.b) * 8000000) / this.e;
    }

    @Override // x3.h
    public final long c() {
        return this.i;
    }

    @Override // x3.h
    public final int g() {
        return this.j;
    }
}
