package v2;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
