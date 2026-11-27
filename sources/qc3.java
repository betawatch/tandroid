// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class qc3 extends o54 {
    public static final qc3 d;
    public tx2 c;

    static {
        int i = zjb.c;
        int i2 = zjb.d;
        long j = zjb.e;
        String str = zjb.a;
        qc3 qc3Var = new qc3();
        qc3Var.c = new tx2(i, j, str, i2);
        d = qc3Var;
    }

    @Override // px2
    public final void c(mx2 mx2Var, Runnable runnable) {
        this.c.b(runnable, false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // px2
    public final String toString() {
        return "Dispatchers.Default";
    }
}
