// default package

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class x6a implements Executor {
    public static final Logger f = Logger.getLogger(x6a.class.getName());
    public final Executor a;
    public final ArrayDeque b = new ArrayDeque();
    public int c = 1;
    public long d = 0;
    public final us4 e = new us4(this);

    public x6a(Executor executor) {
        ite.h(executor);
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ite.h(runnable);
        synchronized (this.b) {
            int i = this.c;
            if (i == 4 || i == 3) {
                this.b.add(runnable);
                return;
            }
            long j = this.d;
            yq9 yq9Var = new yq9(runnable, (byte) 1);
            this.b.add(yq9Var);
            this.c = 2;
            try {
                this.a.execute(this.e);
                if (this.c == 2) {
                    synchronized (this.b) {
                        if (this.d == j && this.c == 2) {
                            this.c = 3;
                        }
                    }
                }
            } catch (Error | RuntimeException e) {
                synchronized (this.b) {
                    int i2 = this.c;
                    boolean z = (i2 == 1 || i2 == 2) && this.b.removeLastOccurrence(yq9Var);
                    if (!(e instanceof RejectedExecutionException) || z) {
                        throw e;
                    }
                }
            }
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.a + "}";
    }
}
