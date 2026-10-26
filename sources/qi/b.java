package qi;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class b {
    public static final b c = new b(Float.POSITIVE_INFINITY);
    public final float a;
    public final float b;

    public b(float f7) {
        if (Float.isNaN(Float.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("epsX must be >= 0");
        }
        if (Float.isNaN(f7) || f7 < 0.0f) {
            throw new IllegalArgumentException("epsY must be >= 0");
        }
        this.a = Float.POSITIVE_INFINITY;
        this.b = f7;
    }
}
