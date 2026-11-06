package pi;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class g {
    public static final g b = new g(-1);
    public final int a;

    public g(int i7) {
        if (i7 != -1 && i7 <= 0) {
            throw new IllegalArgumentException("height must be positive or -1");
        }
        this.a = i7;
    }
}
