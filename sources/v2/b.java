package v2;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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

    @Override // v2.m
    public final boolean next() {
        long j10 = this.c + 1;
        this.c = j10;
        return !(j10 > this.b);
    }
}
