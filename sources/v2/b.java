package v2;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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

    public final void b() {
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
