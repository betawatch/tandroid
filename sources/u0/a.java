package u0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        float f10 = this.h;
        return (d.b((j3 - j10) / this.i, 0.0f, 1.0f) * f10) + (1.0f - f10);
    }
}
