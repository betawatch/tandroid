package sd;

import java.util.concurrent.Executor;
import ld.a0;
import ld.x0;
import qd.v;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d extends x0 implements Executor {
    public static final d c = new d();
    public static final a0 d;

    static {
        a0 a0Var = l.c;
        int i10 = v.a;
        if (64 >= i10) {
            i10 = 64;
        }
        int j10 = qd.a.j(i10, 12, "kotlinx.coroutines.io.parallelism");
        a0Var.getClass();
        if (j10 < 1) {
            throw new IllegalArgumentException(l.d.j(j10, "Expected positive parallelism level, but got ").toString());
        }
        if (j10 < k.d) {
            if (j10 < 1) {
                throw new IllegalArgumentException(l.d.j(j10, "Expected positive parallelism level, but got ").toString());
            }
            a0Var = new qd.i(a0Var, j10);
        }
        d = a0Var;
    }

    @Override // ld.a0
    public final void c(uc.h hVar, Runnable runnable) {
        d.c(hVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(uc.i.a, runnable);
    }

    @Override // ld.a0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
