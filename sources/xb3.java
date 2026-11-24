// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xb3 extends s44 {
    public static final xb3 d;
    public zw2 c;

    static {
        int i = dgb.c;
        int i2 = dgb.d;
        long j = dgb.e;
        String str = dgb.a;
        xb3 xb3Var = new xb3();
        xb3Var.c = new zw2(i, j, str, i2);
        d = xb3Var;
    }

    @Override // vw2
    public final void c(sw2 sw2Var, Runnable runnable) {
        this.c.b(runnable, false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // vw2
    public final String toString() {
        return "Dispatchers.Default";
    }
}
