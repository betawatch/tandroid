package v9;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import o5.o;
import org.telegram.ui.fx;
import q6.m;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class i implements Executor {
    public static final Logger f = Logger.getLogger(i.class.getName());
    public final Executor a;
    public final ArrayDeque b = new ArrayDeque();
    public int c = 1;
    public long d = 0;
    public final fx e = new fx(this);

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
                            boolean z9 = true;
                            if ((i10 != 1 && i10 != 2) || !this.b.removeLastOccurrence(oVar)) {
                                z9 = false;
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z9) {
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
