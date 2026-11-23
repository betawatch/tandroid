package u0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
