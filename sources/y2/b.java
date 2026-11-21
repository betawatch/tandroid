package y2;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
