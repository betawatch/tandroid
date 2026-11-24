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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class y4f implements ymd {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(y4f.class.getName());
    public static final e1f f;
    public static final Object h;
    public volatile Object a;
    public volatile gce b;
    public volatile yze c;

    static {
        e1f jweVar;
        try {
            jweVar = new rme(AtomicReferenceFieldUpdater.newUpdater(yze.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(yze.class, yze.class, "b"), AtomicReferenceFieldUpdater.newUpdater(y4f.class, yze.class, "c"), AtomicReferenceFieldUpdater.newUpdater(y4f.class, gce.class, "b"), AtomicReferenceFieldUpdater.newUpdater(y4f.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            jweVar = new jwe();
        }
        Throwable th2 = th;
        f = jweVar;
        if (th2 != null) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        h = new Object();
    }

    public static void d(y4f y4fVar) {
        yze yzeVar;
        e1f e1fVar;
        gce gceVar;
        gce gceVar2;
        gce gceVar3;
        do {
            yzeVar = y4fVar.c;
            e1fVar = f;
        } while (!e1fVar.e(y4fVar, yzeVar, yze.c));
        while (true) {
            gceVar = null;
            if (yzeVar == null) {
                break;
            }
            Thread thread = yzeVar.a;
            if (thread != null) {
                yzeVar.a = null;
                LockSupport.unpark(thread);
            }
            yzeVar = yzeVar.b;
        }
        do {
            gceVar2 = y4fVar.b;
        } while (!e1fVar.c(y4fVar, gceVar2, gce.d));
        while (true) {
            gceVar3 = gceVar;
            gceVar = gceVar2;
            if (gceVar == null) {
                break;
            }
            gceVar2 = gceVar.c;
            gceVar.c = gceVar3;
        }
        while (gceVar3 != null) {
            Runnable runnable = gceVar3.a;
            gce gceVar4 = gceVar3.c;
            f(runnable, gceVar3.b);
            gceVar3 = gceVar4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", tb4.q("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e2);
        }
    }

    public static final Object h(Object obj) {
        if (obj instanceof htd) {
            CancellationException cancellationException = ((htd) obj).a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof z5e) {
            throw new ExecutionException(((z5e) obj).a);
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

    @Override // ymd
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        gce gceVar = this.b;
        gce gceVar2 = gce.d;
        if (gceVar != gceVar2) {
            gce gceVar3 = new gce(runnable, executor);
            do {
                gceVar3.c = gceVar;
                if (f.c(this, gceVar, gceVar3)) {
                    return;
                } else {
                    gceVar = this.b;
                }
            } while (gceVar != gceVar2);
        }
        f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (!f.d(this, obj, d ? new htd(new CancellationException("Future.cancel() was called.")) : z ? htd.b : htd.c)) {
            return false;
        }
        d(this);
        return true;
    }

    public final void e(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e3) {
                sb.append("FAILURE, cause=[");
                sb.append(e3.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    public final void g(yze yzeVar) {
        yzeVar.a = null;
        while (true) {
            yze yzeVar2 = this.c;
            if (yzeVar2 != yze.c) {
                yze yzeVar3 = null;
                while (yzeVar2 != null) {
                    yze yzeVar4 = yzeVar2.b;
                    if (yzeVar2.a != null) {
                        yzeVar3 = yzeVar2;
                    } else if (yzeVar3 != null) {
                        yzeVar3.b = yzeVar4;
                        if (yzeVar3.a == null) {
                            break;
                        }
                    } else if (f.e(this, yzeVar2, yzeVar4)) {
                    }
                    yzeVar2 = yzeVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return h(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            yze yzeVar = this.c;
            yze yzeVar2 = yze.c;
            if (yzeVar != yzeVar2) {
                yze yzeVar3 = new yze();
                do {
                    e1f e1fVar = f;
                    e1fVar.a(yzeVar3, yzeVar);
                    if (e1fVar.e(this, yzeVar, yzeVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                g(yzeVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return h(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        g(yzeVar3);
                    } else {
                        yzeVar = this.c;
                    }
                } while (yzeVar != yzeVar2);
            }
            return h(this.a);
        }
        while (nanos > 0) {
            Object obj3 = this.a;
            if (obj3 != null) {
                return h(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String y4fVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = true;
            if (convert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (convert > 0) {
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
        throw new TimeoutException(tb4.y(str, " for ", y4fVar));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof htd;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof htd) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            try {
                concat = a();
            } catch (RuntimeException e2) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e2.getClass()));
            }
            if (concat != null && !concat.isEmpty()) {
                ug8.z("PENDING, info=[", concat, "]", sb);
            } else if (isDone()) {
                e(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return h(obj2);
            }
            yze yzeVar = this.c;
            yze yzeVar2 = yze.c;
            if (yzeVar != yzeVar2) {
                yze yzeVar3 = new yze();
                do {
                    e1f e1fVar = f;
                    e1fVar.a(yzeVar3, yzeVar);
                    if (e1fVar.e(this, yzeVar, yzeVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                g(yzeVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return h(obj);
                    }
                    yzeVar = this.c;
                } while (yzeVar != yzeVar2);
            }
            return h(this.a);
        }
        throw new InterruptedException();
    }
}
