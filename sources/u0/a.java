package u0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
            return e.b((j10 - r0) / this.a, 0.0f, 1.0f) * 0.5f;
        }
        float f7 = this.h;
        return (e.b((j10 - j11) / this.i, 0.0f, 1.0f) * f7) + (1.0f - f7);
    }
}
