package v3;

import c3.k;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
    public final long a(long j10) {
        return (Math.max(0L, j10 - this.b) * 8000000) / this.e;
    }

    @Override // v3.h
    public final long b() {
        return this.m;
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
