package y2;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class b implements m {
    public final long a;
    public final long b;
    public long c;

    public b(long j3, long j10) {
        this.a = j3;
        this.b = j10;
        this.c = j3 - 1;
    }

    public final void a() {
        long j3 = this.c;
        if (j3 < this.a || j3 > this.b) {
            throw new NoSuchElementException();
        }
    }

    @Override // y2.m
    public final boolean next() {
        long j3 = this.c + 1;
        this.c = j3;
        return !(j3 > this.b);
    }
}
