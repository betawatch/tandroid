// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class qeb {
    public static final qeb c = new qeb(-9223372036854775807L, false);
    public long a;
    public boolean b;

    public qeb(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final void a(long j) {
        this.a = ls6.r(this.a, j);
    }

    public final void b(boolean z) {
        a(z ? 1L : 0L);
    }

    public final void c(float f) {
        a(Float.floatToIntBits(f));
    }
}
