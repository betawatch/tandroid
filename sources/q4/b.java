package q4;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class b implements l {
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

    @Override // q4.l
    public final boolean next() {
        long j10 = this.c + 1;
        this.c = j10;
        return !(j10 > this.b);
    }
}
