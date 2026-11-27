// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class qb3 extends o54 implements Executor {
    public static final qb3 c = new qb3();
    public static final px2 d;

    static {
        u9c u9cVar = u9c.c;
        int i = chb.a;
        if (64 >= i) {
            i = 64;
        }
        d = u9cVar.e(rze.b(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(u24.a, runnable);
    }

    @Override // px2
    public final String toString() {
        return "Dispatchers.IO";
    }
}
