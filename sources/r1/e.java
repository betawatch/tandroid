package r1;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class e {
    public final long a;
    public final long b;

    public e(long j10, long j11) {
        if (j11 == 0) {
            this.a = 0L;
            this.b = 1L;
        } else {
            this.a = j10;
            this.b = j11;
        }
    }

    public final String toString() {
        return this.a + "/" + this.b;
    }
}
