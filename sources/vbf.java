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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class vbf implements t56 {
    public static final boolean d;
    public static final Logger e;
    public static final c4f f;
    public static final Object h;
    public volatile Object a;
    public volatile pbf b;
    public volatile tbf c;

    static {
        boolean z;
        c4f rbfVar;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = Logger.getLogger(vbf.class.getName());
        try {
            rbfVar = new sbf();
            th = null;
            th2 = null;
        } catch (Error | RuntimeException e2) {
            try {
                th2 = e2;
                rbfVar = new qbf(AtomicReferenceFieldUpdater.newUpdater(tbf.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(tbf.class, tbf.class, "b"), AtomicReferenceFieldUpdater.newUpdater(vbf.class, tbf.class, "c"), AtomicReferenceFieldUpdater.newUpdater(vbf.class, pbf.class, "b"), AtomicReferenceFieldUpdater.newUpdater(vbf.class, Object.class, "a"));
                th = null;
            } catch (Error | RuntimeException e3) {
                rbfVar = new rbf();
                th = e3;
                th2 = e2;
            }
        }
        f = rbfVar;
        if (th != null) {
            Logger logger = e;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        h = new Object();
    }

    public static Object e(vbf vbfVar) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = vbfVar.get();
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

    public static void g(vbf vbfVar) {
        for (tbf b = f.b(vbfVar); b != null; b = b.b) {
            Thread thread = b.a;
            if (thread != null) {
                b.a = null;
                LockSupport.unpark(thread);
            }
        }
        vbfVar.d();
        pbf a = f.a(vbfVar);
        pbf pbfVar = null;
        while (a != null) {
            pbf pbfVar2 = a.c;
            a.c = pbfVar;
            pbfVar = a;
            a = pbfVar2;
        }
        while (pbfVar != null) {
            Runnable runnable = pbfVar.a;
            pbf pbfVar3 = pbfVar.c;
            runnable.getClass();
            Executor executor = pbfVar.b;
            executor.getClass();
            h(runnable, executor);
            pbfVar = pbfVar3;
        }
    }

    public static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", tb4.q("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e2);
        }
    }

    public static final Object j(Object obj) {
        if (obj instanceof nbf) {
            RuntimeException runtimeException = ((nbf) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof obf) {
            throw new ExecutionException(((obf) obj).a);
        }
        if (obj == h) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String a() {
        if (this instanceof ScheduledFuture) {
            return ug8.n(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // t56
    public final void b(Runnable runnable, Executor executor) {
        pbf pbfVar;
        pbf pbfVar2 = pbf.d;
        if (!isDone() && (pbfVar = this.b) != pbfVar2) {
            pbf pbfVar3 = new pbf(runnable, executor);
            do {
                pbfVar3.c = pbfVar;
                if (f.e(this, pbfVar, pbfVar3)) {
                    return;
                } else {
                    pbfVar = this.b;
                }
            } while (pbfVar != pbfVar2);
        }
        h(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        nbf nbfVar;
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (d) {
            nbfVar = new nbf(z, new CancellationException("Future.cancel() was called."));
        } else {
            nbfVar = z ? nbf.c : nbf.d;
            nbfVar.getClass();
        }
        if (!f.f(this, obj, nbfVar)) {
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
        tbf tbfVar = tbf.c;
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
            tbf tbfVar2 = this.c;
            if (tbfVar2 != tbfVar) {
                tbf tbfVar3 = new tbf();
                while (true) {
                    c4f c4fVar = f;
                    c4fVar.c(tbfVar3, tbfVar2);
                    boolean g = c4fVar.g(this, tbfVar2, tbfVar3);
                    j2 = j3;
                    if (!g) {
                        tbfVar2 = this.c;
                        if (tbfVar2 == tbfVar) {
                            break;
                        }
                        j3 = j2;
                    } else {
                        while (true) {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                i(tbfVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return j(obj2);
                            }
                            nanoTime = nanoTime2 - System.nanoTime();
                            if (nanoTime < 1000) {
                                i(tbfVar3);
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
            String vbfVar = toString();
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
                    concat = ug8.n(nanos2, concat, " nanoseconds ");
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(tb4.y(str, " for ", vbfVar));
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

    public final void i(tbf tbfVar) {
        tbfVar.a = null;
        while (true) {
            tbf tbfVar2 = this.c;
            if (tbfVar2 != tbf.c) {
                tbf tbfVar3 = null;
                while (tbfVar2 != null) {
                    tbf tbfVar4 = tbfVar2.b;
                    if (tbfVar2.a != null) {
                        tbfVar3 = tbfVar2;
                    } else if (tbfVar3 != null) {
                        tbfVar3.b = tbfVar4;
                        if (tbfVar3.a == null) {
                            break;
                        }
                    } else if (f.g(this, tbfVar2, tbfVar4)) {
                    }
                    tbfVar2 = tbfVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof nbf;
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
        if (this.a instanceof nbf) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            f(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            try {
                concat = a();
                int i = iyd.a;
                if (concat != null) {
                }
                concat = null;
            } catch (RuntimeException | StackOverflowError e2) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e2.getClass()));
            }
            if (concat != null) {
                ug8.z(", info=[", concat, "]", sb);
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
        tbf tbfVar = tbf.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return j(obj2);
            }
            tbf tbfVar2 = this.c;
            if (tbfVar2 != tbfVar) {
                tbf tbfVar3 = new tbf();
                do {
                    c4f c4fVar = f;
                    c4fVar.c(tbfVar3, tbfVar2);
                    if (c4fVar.g(this, tbfVar2, tbfVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                i(tbfVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return j(obj);
                    }
                    tbfVar2 = this.c;
                } while (tbfVar2 != tbfVar);
            }
            Object obj3 = this.a;
            obj3.getClass();
            return j(obj3);
        }
        throw new InterruptedException();
    }
}
