package qd;

import j7.l1;
import java.util.concurrent.Executor;
import jd.a0;
import jd.x0;
import od.w;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d extends x0 implements Executor {
    public static final d c = new d();
    public static final a0 d;

    static {
        a0 a0Var = l.c;
        int i10 = w.a;
        if (64 >= i10) {
            i10 = 64;
        }
        int j10 = od.a.j(i10, 12, "kotlinx.coroutines.io.parallelism");
        a0Var.getClass();
        if (j10 < 1) {
            throw new IllegalArgumentException(l1.k(j10, "Expected positive parallelism level, but got ").toString());
        }
        if (j10 < k.d) {
            if (j10 < 1) {
                throw new IllegalArgumentException(l1.k(j10, "Expected positive parallelism level, but got ").toString());
            }
            a0Var = new od.j(a0Var, j10);
        }
        d = a0Var;
    }

    @Override // jd.a0
    public final void c(sc.h hVar, Runnable runnable) {
        d.c(hVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(sc.i.a, runnable);
    }

    @Override // jd.a0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
