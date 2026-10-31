package r1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
