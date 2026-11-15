package v9;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import o5.p;
import pb.l;
import q6.m;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class i implements Executor {
    public static final Logger f = Logger.getLogger(i.class.getName());
    public final Executor a;
    public final ArrayDeque b = new ArrayDeque();
    public int c = 1;
    public long d = 0;
    public final l e = new l(this);

    public i(Executor executor) {
        m.g(executor);
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m.g(runnable);
        synchronized (this.b) {
            int i7 = this.c;
            if (i7 != 4 && i7 != 3) {
                long j3 = this.d;
                p pVar = new p(1, runnable);
                this.b.add(pVar);
                this.c = 2;
                try {
                    this.a.execute(this.e);
                    if (this.c != 2) {
                        return;
                    }
                    synchronized (this.b) {
                        try {
                            if (this.d == j3 && this.c == 2) {
                                this.c = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.b) {
                        try {
                            int i10 = this.c;
                            boolean z10 = true;
                            if ((i10 != 1 && i10 != 2) || !this.b.removeLastOccurrence(pVar)) {
                                z10 = false;
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z10) {
                                throw e10;
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
