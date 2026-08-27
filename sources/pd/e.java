package pd;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e extends h {
    public static final e d;

    static {
        int i10 = k.c;
        int i11 = k.d;
        long j10 = k.e;
        String str = k.a;
        e eVar = new e();
        eVar.c = new c(i10, j10, str, i11);
        d = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // id.a0
    public final String toString() {
        return "Dispatchers.Default";
    }
}
