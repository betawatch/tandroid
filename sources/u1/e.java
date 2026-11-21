package u1;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
