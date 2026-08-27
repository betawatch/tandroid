package u0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        float f10 = this.h;
        return (d.b((j10 - j11) / this.i, 0.0f, 1.0f) * f10) + (1.0f - f10);
    }
}
