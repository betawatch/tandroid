// default package

import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class tod extends akd implements ymd {
    public ymd n;
    public ScheduledFuture r;

    public static Object e(Object obj) {
        if (obj instanceof ijd) {
            RuntimeException runtimeException = ((ijd) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (!(obj instanceof ljd)) {
            if (obj == akd.d) {
                return null;
            }
            return obj;
        }
        Throwable th = ((ljd) obj).a;
        if (th != null) {
            throw new ExecutionException(th);
        }
        akd.e.c().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "getDoneValue", "Failure.exception is unexpectedly null.");
        throw new ExecutionException(ljd.c.a);
    }

    public static boolean g(Object obj) {
        return !(obj instanceof jjd);
    }

    public static Object h(ymd ymdVar) {
        Object obj;
        Throwable d;
        if (ymdVar instanceof tod) {
            Object obj2 = ((tod) ymdVar).a;
            if (obj2 instanceof ijd) {
                ijd ijdVar = (ijd) obj2;
                if (ijdVar.a) {
                    RuntimeException runtimeException = ijdVar.b;
                    obj2 = runtimeException != null ? new ijd(false, runtimeException) : ijd.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((ymdVar instanceof akd) && (d = ((akd) ymdVar).d()) != null) {
            return new ljd(d);
        }
        boolean isCancelled = ymdVar.isCancelled();
        boolean z = true;
        if ((!akd.f) && isCancelled) {
            ijd ijdVar2 = ijd.d;
            Objects.requireNonNull(ijdVar2);
            return ijdVar2;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = ymdVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error e) {
                e = e;
                return new ljd(e);
            } catch (CancellationException e2) {
                return !isCancelled ? new ljd(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(ymdVar)), e2)) : new ijd(false, e2);
            } catch (ExecutionException e3) {
                return isCancelled ? new ijd(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(ymdVar)), e3)) : new ljd(e3.getCause());
            } catch (Exception e4) {
                e = e4;
                return new ljd(e);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return isCancelled ? new ijd(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(ymdVar)))) : obj == null ? akd.d : obj;
    }

    public static void j(tod todVar) {
        mjd mjdVar;
        mjd mjdVar2 = null;
        while (true) {
            todVar.getClass();
            for (ujd b = akd.h.b(todVar); b != null; b = b.b) {
                Thread thread = b.a;
                if (thread != null) {
                    b.a = null;
                    LockSupport.unpark(thread);
                }
            }
            ymd ymdVar = todVar.n;
            if ((ymdVar != null) & (todVar.a instanceof ijd)) {
                Object obj = todVar.a;
                ymdVar.cancel((obj instanceof ijd) && ((ijd) obj).a);
            }
            ScheduledFuture scheduledFuture = todVar.r;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            todVar.n = null;
            todVar.r = null;
            mjd mjdVar3 = mjdVar2;
            mjd a = akd.h.a(todVar);
            mjd mjdVar4 = mjdVar3;
            while (a != null) {
                mjd mjdVar5 = a.c;
                a.c = mjdVar4;
                mjdVar4 = a;
                a = mjdVar5;
            }
            while (mjdVar4 != null) {
                Runnable runnable = mjdVar4.a;
                mjdVar = mjdVar4.c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof jjd) {
                    jjd jjdVar = (jjd) runnable;
                    todVar = jjdVar.a;
                    if (todVar.a == jjdVar) {
                        if (akd.h.f(todVar, jjdVar, h(jjdVar.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = mjdVar4.b;
                    Objects.requireNonNull(executor);
                    k(runnable, executor);
                }
                mjdVar4 = mjdVar;
            }
            return;
            mjdVar2 = mjdVar;
        }
    }

    public static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            akd.e.c().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", tb4.q("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // ymd
    public final void c(Runnable runnable, Executor executor) {
        mjd mjdVar;
        mjd mjdVar2 = mjd.d;
        if (executor == null) {
            fvc.f("Executor was null.");
            return;
        }
        if (!isDone() && (mjdVar = this.b) != mjdVar2) {
            mjd mjdVar3 = new mjd(runnable, executor);
            do {
                mjdVar3.c = mjdVar;
                if (akd.h.e(this, mjdVar, mjdVar3)) {
                    return;
                } else {
                    mjdVar = this.b;
                }
            } while (mjdVar != mjdVar2);
        }
        k(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ijd ijdVar;
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof jjd)) {
            return false;
        }
        if (akd.f) {
            ijdVar = new ijd(z, new CancellationException("Future.cancel() was called."));
        } else {
            ijdVar = z ? ijd.c : ijd.d;
            Objects.requireNonNull(ijdVar);
        }
        boolean z2 = false;
        while (true) {
            if (akd.h.f(this, obj, ijdVar)) {
                j(this);
                if (!(obj instanceof jjd)) {
                    break;
                }
                ymd ymdVar = ((jjd) obj).b;
                if (!(ymdVar instanceof tod)) {
                    ymdVar.cancel(z);
                    break;
                }
                this = (tod) ymdVar;
                obj = this.a;
                if (!(obj == null) && !(obj instanceof jjd)) {
                    break;
                }
                z2 = true;
            } else {
                obj = this.a;
                if (g(obj)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // akd
    public final Throwable d() {
        if (!(this instanceof tod)) {
            return null;
        }
        Object obj = this.a;
        if (obj instanceof ljd) {
            return ((ljd) obj).a;
        }
        return null;
    }

    public final String f() {
        ymd ymdVar = this.n;
        ScheduledFuture scheduledFuture = this.r;
        if (ymdVar == null) {
            return null;
        }
        String y = tb4.y("inputFuture=[", ymdVar.toString(), "]");
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return y + ", remaining delay=[" + delay + " ms]";
            }
        }
        return y;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00bd -> B:33:0x0080). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(long j, TimeUnit timeUnit) {
        long j2;
        long nanoTime;
        ujd ujdVar = ujd.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if ((obj != null) && g(obj)) {
            return e(obj);
        }
        long j3 = 0;
        long nanoTime2 = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            ujd ujdVar2 = this.c;
            if (ujdVar2 != ujdVar) {
                ujd ujdVar3 = new ujd();
                while (true) {
                    v0f v0fVar = akd.h;
                    v0fVar.c(ujdVar3, ujdVar2);
                    j2 = j3;
                    if (!v0fVar.g(this, ujdVar2, ujdVar3)) {
                        ujdVar2 = this.c;
                        if (ujdVar2 == ujdVar) {
                            break;
                        }
                        j3 = j2;
                    } else {
                        while (true) {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                a(ujdVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && g(obj2)) {
                                return e(obj2);
                            }
                            nanoTime = nanoTime2 - System.nanoTime();
                            if (nanoTime < 1000) {
                                a(ujdVar3);
                                break;
                            }
                            nanos = nanoTime;
                        }
                    }
                }
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return e(obj3);
        }
        j2 = 0;
        if (nanos <= j2) {
            String todVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < j2) {
                String concat = str.concat(" (plus ");
                long j4 = -nanos;
                long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit.toNanos(convert);
                boolean z = convert == j2 || nanos2 > 1000;
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
            throw new TimeoutException(tb4.y(str, " for ", todVar));
        }
        Object obj5 = this.a;
        if ((obj5 != null) && g(obj5)) {
            return e(obj5);
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        nanoTime = nanoTime2 - System.nanoTime();
        nanos = nanoTime;
        if (nanos <= j2) {
        }
    }

    public final void i(StringBuilder sb) {
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
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof ijd;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.a;
        return (obj != null) & g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a6, code lost:
    
        if (r3.isEmpty() != false) goto L32;
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
        if (this.a instanceof ijd) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            i(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.a;
            if (obj instanceof jjd) {
                sb.append(", setFuture=[");
                ymd ymdVar = ((jjd) obj).b;
                try {
                    if (ymdVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(ymdVar);
                    }
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    concat = f();
                    if (concat != null) {
                    }
                    concat = null;
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (concat != null) {
                    ug8.z(", info=[", concat, "]", sb);
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                i(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        ujd ujdVar = ujd.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & g(obj2)) {
                return e(obj2);
            }
            ujd ujdVar2 = this.c;
            if (ujdVar2 != ujdVar) {
                ujd ujdVar3 = new ujd();
                do {
                    v0f v0fVar = akd.h;
                    v0fVar.c(ujdVar3, ujdVar2);
                    if (v0fVar.g(this, ujdVar2, ujdVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                a(ujdVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & g(obj)));
                        return e(obj);
                    }
                    ujdVar2 = this.c;
                } while (ujdVar2 != ujdVar);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return e(obj3);
        }
        throw new InterruptedException();
    }
}
