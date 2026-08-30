package ph;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class q {
    public final r a;
    public final int b;
    public final int c;

    public q(r rVar, int i10, int i11) {
        this.a = rVar;
        this.b = i10;
        this.c = i11;
    }

    public final float a(float f10) {
        return (f10 / this.a.d[this.c]) * this.b;
    }

    public final float b(float f10) {
        return (f10 / this.a.d[this.c]) * (this.b + 1);
    }
}
