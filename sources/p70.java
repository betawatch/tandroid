// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class p70 {
    public short a;
    public short b;
    public float c;
    public long d;
    public long e;
    public long f;
    public float g;
    public int h;

    public final float a(long j) {
        if (j < this.d) {
            return 0.0f;
        }
        long j2 = this.f;
        if (j2 < 0 || j < j2) {
            return w76.b((j - r0) / this.a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.g;
        return (w76.b((j - j2) / this.h, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
