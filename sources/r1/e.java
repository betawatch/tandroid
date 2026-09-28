package r1;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class e {
    public final long a;
    public final long b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.a = 0L;
            this.b = 1L;
        } else {
            this.a = j3;
            this.b = j10;
        }
    }

    public final String toString() {
        return this.a + "/" + this.b;
    }
}
