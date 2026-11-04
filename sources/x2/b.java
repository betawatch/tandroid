package x2;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class b implements m {
    public final long a;
    public final long b;
    public long c;

    public b(long j10, long j11) {
        this.a = j10;
        this.b = j11;
        this.c = j10 - 1;
    }

    public final void a() {
        long j10 = this.c;
        if (j10 < this.a || j10 > this.b) {
            throw new NoSuchElementException();
        }
    }

    @Override // x2.m
    public final boolean next() {
        long j10 = this.c + 1;
        this.c = j10;
        return !(j10 > this.b);
    }
}
