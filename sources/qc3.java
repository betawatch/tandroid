// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
