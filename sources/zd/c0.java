package zd;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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

    @Override // zd.s0, zd.g0
    public final l0 a(long j3, y1 y1Var, id.h hVar) {
        long j10 = j3 > 0 ? j3 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j3 : 0L;
        if (j10 >= 4611686018427387903L) {
            return p1.a;
        }
        long nanoTime = System.nanoTime();
        p0 p0Var = new p0(j10 + nanoTime, y1Var);
        q(nanoTime, p0Var);
        return p0Var;
    }

    @Override // zd.t0
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

    @Override // zd.t0
    public final void l(long j3, q0 q0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // zd.s0
    public final void m(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.m(runnable);
    }

    public final synchronized void r() {
        int i7 = debugStatus;
        if (i7 == 2 || i7 == 3) {
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
                int i7 = debugStatus;
                if (i7 == 2 || i7 == 3) {
                    if (p10) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j3 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long j10 = j();
                    if (j10 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j3 == Long.MAX_VALUE) {
                            j3 = w + nanoTime;
                        }
                        long j11 = j3 - nanoTime;
                        if (j11 <= 0) {
                            _thread = null;
                            r();
                            if (p()) {
                                return;
                            }
                            h();
                            return;
                        }
                        if (j10 > j11) {
                            j10 = j11;
                        }
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                    if (j10 > 0) {
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
                        LockSupport.parkNanos(this, j10);
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

    @Override // zd.s0, zd.t0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // zd.x
    public final String toString() {
        return "DefaultExecutor";
    }
}
