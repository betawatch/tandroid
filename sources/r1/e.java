package r1;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
