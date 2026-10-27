package vi;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class v {
    public long a = Long.MIN_VALUE;
    public long b = Long.MIN_VALUE;
    public long c = Long.MIN_VALUE;
    public long d;

    public v(long j10) {
        this.d = j10;
    }

    public final long a() {
        long j10 = this.c;
        if (j10 == Long.MIN_VALUE) {
            return 0L;
        }
        return Math.max(1L, this.d) + j10;
    }
}
