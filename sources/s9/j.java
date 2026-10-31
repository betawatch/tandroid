package s9;

import j9.u;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import l5.o;
import n6.l;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j implements Executor {
    public static final Logger f = Logger.getLogger(j.class.getName());
    public final Executor a;
    public final ArrayDeque b = new ArrayDeque();
    public int c = 1;
    public long d = 0;
    public final u e = new u(this);

    public j(Executor executor) {
        l.g(executor);
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        l.g(runnable);
        synchronized (this.b) {
            int i10 = this.c;
            if (i10 != 4 && i10 != 3) {
                long j10 = this.d;
                o oVar = new o(1, runnable);
                this.b.add(oVar);
                this.c = 2;
                try {
                    this.a.execute(this.e);
                    if (this.c != 2) {
                        return;
                    }
                    synchronized (this.b) {
                        try {
                            if (this.d == j10 && this.c == 2) {
                                this.c = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.b) {
                        try {
                            int i11 = this.c;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.b.removeLastOccurrence(oVar)) {
                                z10 = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z10) {
                                throw e;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.a + "}";
    }
}
