package v2;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class b implements l {
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

    @Override // v2.l
    public final boolean next() {
        long j3 = this.c + 1;
        this.c = j3;
        return !(j3 > this.b);
    }
}
