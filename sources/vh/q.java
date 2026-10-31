package vh;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q {
    public final r a;
    public final int b;
    public final int c;

    public q(r rVar, int i10, int i11) {
        this.a = rVar;
        this.b = i10;
        this.c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.a.d[this.c]) * this.b;
    }

    public final float b(float f7) {
        return (f7 / this.a.d[this.c]) * (this.b + 1);
    }
}
