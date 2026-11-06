package qi;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class b {
    public static final b c = new b(Float.POSITIVE_INFINITY);
    public final float a;
    public final float b;

    public b(float f10) {
        if (Float.isNaN(Float.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("epsX must be >= 0");
        }
        if (Float.isNaN(f10) || f10 < 0.0f) {
            throw new IllegalArgumentException("epsY must be >= 0");
        }
        this.a = Float.POSITIVE_INFINITY;
        this.b = f10;
    }
}
