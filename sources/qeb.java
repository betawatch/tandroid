// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
