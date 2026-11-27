// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class usc {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;

    public usc(float f, float f2, float f3) {
        this.b = f;
        this.a = f;
        this.d = f2;
        this.e = f3;
    }

    public final void a(float f) {
        this.b = f;
        this.a = f;
        this.c = 0.0f;
    }

    public final boolean b(float f) {
        float sqrt = this.e * 2.0f * ((float) Math.sqrt(this.d));
        while (f > 0.0f) {
            float min = Math.min(f, 0.0020833334f);
            float f2 = this.c;
            float f3 = -this.d;
            float f4 = this.a;
            float f5 = ((((f4 - this.b) * f3) - (sqrt * f2)) * min) + f2;
            this.c = f5;
            this.a = (f5 * min) + f4;
            f -= min;
        }
        boolean z = Math.abs(this.a - this.b) > 0.002f || Math.abs(this.c) > 0.02f;
        if (!z) {
            a(this.b);
        }
        return z;
    }
}
