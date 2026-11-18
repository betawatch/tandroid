package y3;

import f3.k;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class a extends k implements h {
    public final long i;
    public final int j;
    public final int k;
    public final boolean l;
    public final long m;

    public a(long j3, long j10, int i7, int i10, boolean z10, boolean z11) {
        super(j3, j10, i7, i10, z10, z11);
        long j11 = j3;
        this.i = j10;
        this.j = i7;
        this.k = i10;
        this.l = z10;
        this.m = j11 == -1 ? -1L : j11;
    }

    @Override // y3.h
    public final long a(long j3) {
        return (Math.max(0L, j3 - this.b) * 8000000) / this.e;
    }

    @Override // y3.h
    public final long b() {
        return this.m;
    }

    @Override // y3.h
    public final long c() {
        return this.i;
    }

    @Override // y3.h
    public final int g() {
        return this.j;
    }
}
