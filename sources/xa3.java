// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class xa3 extends s44 implements Executor {
    public static final xa3 c = new xa3();
    public static final vw2 d;

    static {
        u5c u5cVar = u5c.c;
        int i = hdb.a;
        if (64 >= i) {
            i = 64;
        }
        d = u5cVar.e(zue.b(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(z14.a, runnable);
    }

    @Override // vw2
    public final String toString() {
        return "Dispatchers.IO";
    }
}
