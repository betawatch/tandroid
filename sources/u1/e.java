package u1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
