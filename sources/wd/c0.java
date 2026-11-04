package wd;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c0 extends s0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final c0 s;
    public static final long w;

    static {
        Long l10;
        c0 c0Var = new c0();
        s = c0Var;
        c0Var.i(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        w = timeUnit.toNanos(l10.longValue());
    }

    @Override // wd.s0, wd.g0
    public final l0 b(long j10, y1 y1Var, fd.h hVar) {
        long j11 = j10 > 0 ? j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10 : 0L;
        if (j11 >= 4611686018427387903L) {
            return p1.a;
        }
        long nanoTime = System.nanoTime();
        p0 p0Var = new p0(j11 + nanoTime, y1Var);
        q(nanoTime, p0Var);
        return p0Var;
    }

    @Override // wd.t0
    public final Thread h() {
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
                thread.setContextClassLoader(s.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // wd.t0
    public final void l(long j10, q0 q0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // wd.s0
    public final void m(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.m(runnable);
    }

    public final synchronized void r() {
        int i3 = debugStatus;
        if (i3 == 2 || i3 == 3) {
            debugStatus = 3;
            s0.h.set(this, null);
            s0.n.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean p10;
        v1.a.set(this);
        try {
            synchronized (this) {
                int i3 = debugStatus;
                if (i3 == 2 || i3 == 3) {
                    if (p10) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j10 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long j11 = j();
                    if (j11 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j10 == Long.MAX_VALUE) {
                            j10 = w + nanoTime;
                        }
                        long j12 = j10 - nanoTime;
                        if (j12 <= 0) {
                            _thread = null;
                            r();
                            if (p()) {
                                return;
                            }
                            h();
                            return;
                        }
                        if (j11 > j12) {
                            j11 = j12;
                        }
                    } else {
                        j10 = Long.MAX_VALUE;
                    }
                    if (j11 > 0) {
                        int i10 = debugStatus;
                        if (i10 == 2 || i10 == 3) {
                            _thread = null;
                            r();
                            if (p()) {
                                return;
                            }
                            h();
                            return;
                        }
                        LockSupport.parkNanos(this, j11);
                    }
                }
            }
        } finally {
            _thread = null;
            r();
            if (!p()) {
                h();
            }
        }
    }

    @Override // wd.s0, wd.t0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // wd.x
    public final String toString() {
        return "DefaultExecutor";
    }
}
