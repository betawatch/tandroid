package u0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
