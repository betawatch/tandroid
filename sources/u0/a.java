package u0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a {
    public int a;
    public int b;
    public float c;
    public float d;
    public long e;
    public long f;
    public long g;
    public float h;
    public int i;

    public final float a(long j10) {
        if (j10 < this.e) {
            return 0.0f;
        }
        long j11 = this.g;
        if (j11 < 0 || j10 < j11) {
            return d.b((j10 - r0) / this.a, 0.0f, 1.0f) * 0.5f;
        }
        float f9 = this.h;
        return (d.b((j10 - j11) / this.i, 0.0f, 1.0f) * f9) + (1.0f - f9);
    }
}
