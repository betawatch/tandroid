// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
