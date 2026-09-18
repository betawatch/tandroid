package u0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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

    public final float a(long j3) {
        if (j3 < this.e) {
            return 0.0f;
        }
        long j10 = this.g;
        if (j10 < 0 || j3 < j10) {
            return d.b((j3 - r0) / this.a, 0.0f, 1.0f) * 0.5f;
        }
        float f7 = this.h;
        return (d.b((j3 - j10) / this.i, 0.0f, 1.0f) * f7) + (1.0f - f7);
    }
}
