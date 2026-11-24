// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class tab {
    public static final tab c = new tab(-9223372036854775807L, false);
    public long a;
    public boolean b;

    public tab(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final void a(long j) {
        this.a = hq6.r(this.a, j);
    }

    public final void b(boolean z) {
        a(z ? 1L : 0L);
    }

    public final void c(float f) {
        a(Float.floatToIntBits(f));
    }
}
