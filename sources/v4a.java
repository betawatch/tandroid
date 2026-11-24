// default package

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class v4a implements Executor {
    public static final Logger f = Logger.getLogger(v4a.class.getName());
    public final Executor a;
    public final ArrayDeque b = new ArrayDeque();
    public int c = 1;
    public long d = 0;
    public final tq4 e = new tq4(this);

    public v4a(Executor executor) {
        fre.h(executor);
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        fre.h(runnable);
        synchronized (this.b) {
            int i = this.c;
            if (i == 4 || i == 3) {
                this.b.add(runnable);
                return;
            }
            long j = this.d;
            xo9 xo9Var = new xo9(runnable, (byte) 1);
            this.b.add(xo9Var);
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
                    boolean z = (i2 == 1 || i2 == 2) && this.b.removeLastOccurrence(xo9Var);
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
