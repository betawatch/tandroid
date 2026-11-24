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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wqd extends cmd implements bpd {
    public bpd n;
    public ScheduledFuture r;

    public static Object e(Object obj) {
        if (obj instanceof kld) {
            RuntimeException runtimeException = ((kld) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (!(obj instanceof nld)) {
            if (obj == cmd.d) {
                return null;
            }
            return obj;
        }
        Throwable th = ((nld) obj).a;
        if (th != null) {
            throw new ExecutionException(th);
        }
        cmd.e.c().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "getDoneValue", "Failure.exception is unexpectedly null.");
        throw new ExecutionException(nld.c.a);
    }

    public static boolean g(Object obj) {
        return !(obj instanceof lld);
    }

    public static Object h(bpd bpdVar) {
        Object obj;
        Throwable d;
        if (bpdVar instanceof wqd) {
            Object obj2 = ((wqd) bpdVar).a;
            if (obj2 instanceof kld) {
                kld kldVar = (kld) obj2;
                if (kldVar.a) {
                    RuntimeException runtimeException = kldVar.b;
                    obj2 = runtimeException != null ? new kld(false, runtimeException) : kld.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((bpdVar instanceof cmd) && (d = ((cmd) bpdVar).d()) != null) {
            return new nld(d);
        }
        boolean isCancelled = bpdVar.isCancelled();
        boolean z = true;
        if ((!cmd.f) && isCancelled) {
            kld kldVar2 = kld.d;
            Objects.requireNonNull(kldVar2);
            return kldVar2;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = bpdVar.get();
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
                return new nld(e);
            } catch (CancellationException e2) {
                return !isCancelled ? new nld(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(bpdVar)), e2)) : new kld(false, e2);
            } catch (ExecutionException e3) {
                return isCancelled ? new kld(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(bpdVar)), e3)) : new nld(e3.getCause());
            } catch (Exception e4) {
                e = e4;
                return new nld(e);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return isCancelled ? new kld(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(bpdVar)))) : obj == null ? cmd.d : obj;
    }

    public static void j(wqd wqdVar) {
        old oldVar;
        old oldVar2 = null;
        while (true) {
            wqdVar.getClass();
            for (wld b = cmd.h.b(wqdVar); b != null; b = b.b) {
                Thread thread = b.a;
                if (thread != null) {
                    b.a = null;
                    LockSupport.unpark(thread);
                }
            }
            bpd bpdVar = wqdVar.n;
            if ((bpdVar != null) & (wqdVar.a instanceof kld)) {
                Object obj = wqdVar.a;
                bpdVar.cancel((obj instanceof kld) && ((kld) obj).a);
            }
            ScheduledFuture scheduledFuture = wqdVar.r;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            wqdVar.n = null;
            wqdVar.r = null;
            old oldVar3 = oldVar2;
            old a = cmd.h.a(wqdVar);
            old oldVar4 = oldVar3;
            while (a != null) {
                old oldVar5 = a.c;
                a.c = oldVar4;
                oldVar4 = a;
                a = oldVar5;
            }
            while (oldVar4 != null) {
                Runnable runnable = oldVar4.a;
                oldVar = oldVar4.c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof lld) {
                    lld lldVar = (lld) runnable;
                    wqdVar = lldVar.a;
                    if (wqdVar.a == lldVar) {
                        if (cmd.h.f(wqdVar, lldVar, h(lldVar.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = oldVar4.b;
                    Objects.requireNonNull(executor);
                    k(runnable, executor);
                }
                oldVar4 = oldVar;
            }
            return;
            oldVar2 = oldVar;
        }
    }

    public static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            cmd.e.c().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", td4.r("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // bpd
    public final void c(Runnable runnable, Executor executor) {
        old oldVar;
        old oldVar2 = old.d;
        if (executor == null) {
            gxc.d("Executor was null.");
            return;
        }
        if (!isDone() && (oldVar = this.b) != oldVar2) {
            old oldVar3 = new old(runnable, executor);
            do {
                oldVar3.c = oldVar;
                if (cmd.h.e(this, oldVar, oldVar3)) {
                    return;
                } else {
                    oldVar = this.b;
                }
            } while (oldVar != oldVar2);
        }
        k(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        kld kldVar;
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof lld)) {
            return false;
        }
        if (cmd.f) {
            kldVar = new kld(z, new CancellationException("Future.cancel() was called."));
        } else {
            kldVar = z ? kld.c : kld.d;
            Objects.requireNonNull(kldVar);
        }
        boolean z2 = false;
        while (true) {
            if (cmd.h.f(this, obj, kldVar)) {
                j(this);
                if (!(obj instanceof lld)) {
                    break;
                }
                bpd bpdVar = ((lld) obj).b;
                if (!(bpdVar instanceof wqd)) {
                    bpdVar.cancel(z);
                    break;
                }
                this = (wqd) bpdVar;
                obj = this.a;
                if (!(obj == null) && !(obj instanceof lld)) {
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

    @Override // cmd
    public final Throwable d() {
        if (!(this instanceof wqd)) {
            return null;
        }
        Object obj = this.a;
        if (obj instanceof nld) {
            return ((nld) obj).a;
        }
        return null;
    }

    public final String f() {
        bpd bpdVar = this.n;
        ScheduledFuture scheduledFuture = this.r;
        if (bpdVar == null) {
            return null;
        }
        String o = kt6.o("inputFuture=[", bpdVar.toString(), "]");
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return o + ", remaining delay=[" + delay + " ms]";
            }
        }
        return o;
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
        wld wldVar = wld.c;
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
            wld wldVar2 = this.c;
            if (wldVar2 != wldVar) {
                wld wldVar3 = new wld();
                while (true) {
                    x2f x2fVar = cmd.h;
                    x2fVar.c(wldVar3, wldVar2);
                    j2 = j3;
                    if (!x2fVar.g(this, wldVar2, wldVar3)) {
                        wldVar2 = this.c;
                        if (wldVar2 == wldVar) {
                            break;
                        }
                        j3 = j2;
                    } else {
                        while (true) {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                a(wldVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && g(obj2)) {
                                return e(obj2);
                            }
                            nanoTime = nanoTime2 - System.nanoTime();
                            if (nanoTime < 1000) {
                                a(wldVar3);
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
            String wqdVar = toString();
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
                    concat = wi8.n(nanos2, concat, " nanoseconds ");
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(kt6.o(str, " for ", wqdVar));
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
        return this.a instanceof kld;
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
        if (this.a instanceof kld) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            i(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.a;
            if (obj instanceof lld) {
                sb.append(", setFuture=[");
                bpd bpdVar = ((lld) obj).b;
                try {
                    if (bpdVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(bpdVar);
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
                    wi8.z(", info=[", concat, "]", sb);
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
        wld wldVar = wld.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & g(obj2)) {
                return e(obj2);
            }
            wld wldVar2 = this.c;
            if (wldVar2 != wldVar) {
                wld wldVar3 = new wld();
                do {
                    x2f x2fVar = cmd.h;
                    x2fVar.c(wldVar3, wldVar2);
                    if (x2fVar.g(this, wldVar2, wldVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                a(wldVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & g(obj)));
                        return e(obj);
                    }
                    wldVar2 = this.c;
                } while (wldVar2 != wldVar);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return e(obj3);
        }
        throw new InterruptedException();
    }
}
