// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class u59 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public boolean f;

    public final void a(float f, float f2, float f3, float f4) {
        this.a = f;
        this.d = f3;
        this.b = f - Math.max(0.0f, Math.min(f2, Math.max(0.0f, f3 - f4)));
        this.c = Math.max(f, f3);
        this.f = this.b <= f4 + 0.5f;
        this.e = 0.0f;
    }

    public final float b() {
        if (this.f) {
            return this.c;
        }
        float f = this.b;
        return ((this.c - f) * this.e) + f;
    }
}
