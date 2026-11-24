// default package

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class wdf implements t76 {
    public static final boolean d;
    public static final Logger e;
    public static final e6f f;
    public static final Object h;
    public volatile Object a;
    public volatile qdf b;
    public volatile udf c;

    static {
        boolean z;
        e6f sdfVar;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = Logger.getLogger(wdf.class.getName());
        try {
            sdfVar = new tdf();
            th = null;
            th2 = null;
        } catch (Error | RuntimeException e2) {
            try {
                th2 = e2;
                sdfVar = new rdf(AtomicReferenceFieldUpdater.newUpdater(udf.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(udf.class, udf.class, "b"), AtomicReferenceFieldUpdater.newUpdater(wdf.class, udf.class, "c"), AtomicReferenceFieldUpdater.newUpdater(wdf.class, qdf.class, "b"), AtomicReferenceFieldUpdater.newUpdater(wdf.class, Object.class, "a"));
                th = null;
            } catch (Error | RuntimeException e3) {
                sdfVar = new sdf();
                th = e3;
                th2 = e2;
            }
        }
        f = sdfVar;
        if (th != null) {
            Logger logger = e;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        h = new Object();
    }

    public static Object e(wdf wdfVar) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = wdfVar.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void g(wdf wdfVar) {
        for (udf b = f.b(wdfVar); b != null; b = b.b) {
            Thread thread = b.a;
            if (thread != null) {
                b.a = null;
                LockSupport.unpark(thread);
            }
        }
        wdfVar.d();
        qdf a = f.a(wdfVar);
        qdf qdfVar = null;
        while (a != null) {
            qdf qdfVar2 = a.c;
            a.c = qdfVar;
            qdfVar = a;
            a = qdfVar2;
        }
        while (qdfVar != null) {
            Runnable runnable = qdfVar.a;
            qdf qdfVar3 = qdfVar.c;
            runnable.getClass();
            Executor executor = qdfVar.b;
            executor.getClass();
            h(runnable, executor);
            qdfVar = qdfVar3;
        }
    }

    public static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", td4.r("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e2);
        }
    }

    public static final Object j(Object obj) {
        if (obj instanceof odf) {
            RuntimeException runtimeException = ((odf) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof pdf) {
            throw new ExecutionException(((pdf) obj).a);
        }
        if (obj == h) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String a() {
        if (this instanceof ScheduledFuture) {
            return wi8.n(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // t76
    public final void b(Runnable runnable, Executor executor) {
        qdf qdfVar;
        qdf qdfVar2 = qdf.d;
        if (!isDone() && (qdfVar = this.b) != qdfVar2) {
            qdf qdfVar3 = new qdf(runnable, executor);
            do {
                qdfVar3.c = qdfVar;
                if (f.e(this, qdfVar, qdfVar3)) {
                    return;
                } else {
                    qdfVar = this.b;
                }
            } while (qdfVar != qdfVar2);
        }
        h(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        odf odfVar;
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (d) {
            odfVar = new odf(z, new CancellationException("Future.cancel() was called."));
        } else {
            odfVar = z ? odf.c : odf.d;
            odfVar.getClass();
        }
        if (!f.f(this, obj, odfVar)) {
            return false;
        }
        g(this);
        return true;
    }

    public final void f(StringBuilder sb) {
        try {
            Object e2 = e(this);
            sb.append("SUCCESS, result=[");
            if (e2 == null) {
                sb.append("null");
            } else if (e2 == this) {
                sb.append("this future");
            } else {
                sb.append(e2.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(e2)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e4) {
            sb.append("FAILURE, cause=[");
            sb.append(e4.getCause());
            sb.append("]");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x009c -> B:27:0x006b). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(long j, TimeUnit timeUnit) {
        long j2;
        long nanoTime;
        udf udfVar = udf.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return j(obj);
        }
        long j3 = 0;
        long nanoTime2 = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            udf udfVar2 = this.c;
            if (udfVar2 != udfVar) {
                udf udfVar3 = new udf();
                while (true) {
                    e6f e6fVar = f;
                    e6fVar.c(udfVar3, udfVar2);
                    boolean g = e6fVar.g(this, udfVar2, udfVar3);
                    j2 = j3;
                    if (!g) {
                        udfVar2 = this.c;
                        if (udfVar2 == udfVar) {
                            break;
                        }
                        j3 = j2;
                    } else {
                        while (true) {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                i(udfVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return j(obj2);
                            }
                            nanoTime = nanoTime2 - System.nanoTime();
                            if (nanoTime < 1000) {
                                i(udfVar3);
                                break;
                            }
                            nanos = nanoTime;
                        }
                    }
                }
            }
            Object obj3 = this.a;
            obj3.getClass();
            return j(obj3);
        }
        j2 = 0;
        if (nanos <= j2) {
            String wdfVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < j2) {
                String concat = str.concat(" (plus ");
                long j4 = -nanos;
                long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit.toNanos(convert);
                boolean z = true;
                if (convert != j2 && nanos2 <= 1000) {
                    z = false;
                }
                if (convert > j2) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z) {
                    concat = wi8.n(nanos2, concat, " nanoseconds ");
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(kt6.o(str, " for ", wdfVar));
        }
        Object obj5 = this.a;
        if (obj5 != null) {
            return j(obj5);
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        nanoTime = nanoTime2 - System.nanoTime();
        nanos = nanoTime;
        if (nanos <= j2) {
        }
    }

    public final void i(udf udfVar) {
        udfVar.a = null;
        while (true) {
            udf udfVar2 = this.c;
            if (udfVar2 != udf.c) {
                udf udfVar3 = null;
                while (udfVar2 != null) {
                    udf udfVar4 = udfVar2.b;
                    if (udfVar2.a != null) {
                        udfVar3 = udfVar2;
                    } else if (udfVar3 != null) {
                        udfVar3.b = udfVar4;
                        if (udfVar3.a == null) {
                            break;
                        }
                    } else if (f.g(this, udfVar2, udfVar4)) {
                    }
                    udfVar2 = udfVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof odf;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (r3.isEmpty() != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.a instanceof odf) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            f(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            try {
                concat = a();
                int i = l0e.a;
                if (concat != null) {
                }
                concat = null;
            } catch (RuntimeException | StackOverflowError e2) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e2.getClass()));
            }
            if (concat != null) {
                wi8.z(", info=[", concat, "]", sb);
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                f(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void d() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        udf udfVar = udf.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return j(obj2);
            }
            udf udfVar2 = this.c;
            if (udfVar2 != udfVar) {
                udf udfVar3 = new udf();
                do {
                    e6f e6fVar = f;
                    e6fVar.c(udfVar3, udfVar2);
                    if (e6fVar.g(this, udfVar2, udfVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                i(udfVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return j(obj);
                    }
                    udfVar2 = this.c;
                } while (udfVar2 != udfVar);
            }
            Object obj3 = this.a;
            obj3.getClass();
            return j(obj3);
        }
        throw new InterruptedException();
    }
}
