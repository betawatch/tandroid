package pd;

import id.a0;
import id.y0;
import java.util.concurrent.Executor;
import nd.v;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d extends y0 implements Executor {
    public static final d c = new d();
    public static final a0 d;

    static {
        a0 a0Var = l.c;
        int i10 = v.a;
        if (64 >= i10) {
            i10 = 64;
        }
        int j10 = nd.a.j(i10, 12, "kotlinx.coroutines.io.parallelism");
        a0Var.getClass();
        if (j10 < 1) {
            throw new IllegalArgumentException(i0.a.k(j10, "Expected positive parallelism level, but got ").toString());
        }
        if (j10 < k.d) {
            if (j10 < 1) {
                throw new IllegalArgumentException(i0.a.k(j10, "Expected positive parallelism level, but got ").toString());
            }
            a0Var = new nd.i(a0Var, j10);
        }
        d = a0Var;
    }

    @Override // id.a0
    public final void c(rc.h hVar, Runnable runnable) {
        d.c(hVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(rc.i.a, runnable);
    }

    @Override // id.a0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
