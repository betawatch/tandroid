package r1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
