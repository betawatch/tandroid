package qd;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    @Override // jd.a0
    public final String toString() {
        return "Dispatchers.Default";
    }
}
