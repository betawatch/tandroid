package u1;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
