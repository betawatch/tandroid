// default package

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tb3 extends t54 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final tb3 w;
    public static final long x;

    static {
        Long l;
        tb3 tb3Var = new tb3();
        w = tb3Var;
        tb3Var.g(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        x = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // t54, pe3
    public final xp3 a(long j, oqb oqbVar, cy2 cy2Var) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return vl7.a;
        }
        long nanoTime = System.nanoTime();
        q54 q54Var = new q54(j2 + nanoTime, oqbVar);
        p(nanoTime, q54Var);
        return q54Var;
    }

    @Override // t54
    public final void j(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.j(runnable);
    }

    @Override // t54
    public final Thread m() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(w.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // t54
    public final void o(long j, r54 r54Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void q() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            Unsafe unsafe = fy.a;
            unsafe.putObjectVolatile(this, t54.r, (Object) null);
            unsafe.putObjectVolatile(this, t54.h, (Object) null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean n;
        epb.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    q();
                    if (n()) {
                    }
                } else {
                    debugStatus = 1;
                    notifyAll();
                    long j = Long.MAX_VALUE;
                    while (true) {
                        Thread.interrupted();
                        long h = h();
                        if (h == Long.MAX_VALUE) {
                            long nanoTime = System.nanoTime();
                            if (j == Long.MAX_VALUE) {
                                j = x + nanoTime;
                            }
                            long j2 = j - nanoTime;
                            if (j2 <= 0) {
                                _thread = null;
                                q();
                                if (n()) {
                                    return;
                                }
                            } else if (h > j2) {
                                h = j2;
                            }
                        } else {
                            j = Long.MAX_VALUE;
                        }
                        if (h > 0) {
                            int i2 = debugStatus;
                            if (!(i2 == 2 || i2 == 3)) {
                                LockSupport.parkNanos(this, h);
                            } else if (n) {
                                return;
                            }
                        }
                    }
                }
            }
        } finally {
            _thread = null;
            q();
            if (!n()) {
                m();
            }
        }
    }

    @Override // t54, o54
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // fy2
    public final String toString() {
        return "DefaultExecutor";
    }
}
