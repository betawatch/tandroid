// default package

import j$.util.Objects;
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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class u2 implements x76 {
    public static final boolean d;
    public static final j26 e;
    public static final hpd f;
    public static final Object h;
    public volatile Object a;
    public volatile l2 b;
    public volatile t2 c;

    static {
        boolean z;
        Throwable th;
        hpd o2Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = new j26(u2.class, (byte) 0);
        Throwable th2 = null;
        try {
            o2Var = new s2();
            th = null;
        } catch (Error | Exception e2) {
            th = e2;
            try {
                o2Var = new m2(AtomicReferenceFieldUpdater.newUpdater(t2.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(t2.class, t2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(u2.class, t2.class, "c"), AtomicReferenceFieldUpdater.newUpdater(u2.class, l2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(u2.class, Object.class, "a"));
            } catch (Error | Exception e3) {
                th2 = e3;
                o2Var = new o2();
            }
        }
        f = o2Var;
        if (th2 != null) {
            j26 j26Var = e;
            Logger a = j26Var.a();
            Level level = Level.SEVERE;
            a.log(level, "UnsafeAtomicHelper is broken!", th);
            j26Var.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        h = new Object();
    }

    public static void f(u2 u2Var, boolean z) {
        l2 l2Var = null;
        while (true) {
            for (t2 e2 = f.e(u2Var); e2 != null; e2 = e2.b) {
                Thread thread = e2.a;
                if (thread != null) {
                    e2.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                z = false;
            }
            u2Var.d();
            l2 l2Var2 = l2Var;
            l2 d2 = f.d(u2Var);
            l2 l2Var3 = l2Var2;
            while (d2 != null) {
                l2 l2Var4 = d2.c;
                d2.c = l2Var3;
                l2Var3 = d2;
                d2 = l2Var4;
            }
            while (l2Var3 != null) {
                l2Var = l2Var3.c;
                Runnable runnable = l2Var3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof n2) {
                    n2 n2Var = (n2) runnable;
                    u2Var = n2Var.a;
                    if (u2Var.a == n2Var) {
                        if (f.b(u2Var, n2Var, i(n2Var.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = l2Var3.b;
                    Objects.requireNonNull(executor);
                    g(runnable, executor);
                }
                l2Var3 = l2Var;
            }
            return;
        }
    }

    public static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object h(Object obj) {
        if (obj instanceof i2) {
            RuntimeException runtimeException = ((i2) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof k2) {
            throw new ExecutionException(((k2) obj).a);
        }
        if (obj == h) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object i(x76 x76Var) {
        Object obj;
        Throwable th;
        if (x76Var instanceof p2) {
            Object obj2 = ((u2) x76Var).a;
            if (obj2 instanceof i2) {
                i2 i2Var = (i2) obj2;
                if (i2Var.a) {
                    obj2 = i2Var.b != null ? new i2(false, i2Var.b) : i2.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if (x76Var instanceof u2) {
            u2 u2Var = (u2) x76Var;
            if (u2Var instanceof p2) {
                Object obj3 = u2Var.a;
                if (obj3 instanceof k2) {
                    th = ((k2) obj3).a;
                    if (th != null) {
                        return new k2(th);
                    }
                }
            }
            th = null;
            if (th != null) {
            }
        }
        boolean isCancelled = x76Var.isCancelled();
        boolean z = true;
        if ((!d) && isCancelled) {
            i2 i2Var2 = i2.d;
            Objects.requireNonNull(i2Var2);
            return i2Var2;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = x76Var.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th2) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error e2) {
                e = e2;
                return new k2(e);
            } catch (CancellationException e3) {
                if (isCancelled) {
                    return new i2(false, e3);
                }
                return new k2(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + x76Var, e3));
            } catch (ExecutionException e4) {
                if (!isCancelled) {
                    return new k2(e4.getCause());
                }
                return new i2(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + x76Var, e4));
            } catch (Exception e5) {
                e = e5;
                return new k2(e);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!isCancelled) {
            return obj == null ? h : obj;
        }
        return new i2(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + x76Var));
    }

    public final void a(StringBuilder sb) {
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
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            } catch (Exception e3) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e3.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        e(sb, obj);
        sb.append("]");
    }

    @Override // x76
    public final void b(Runnable runnable, Executor executor) {
        l2 l2Var;
        l2 l2Var2 = l2.d;
        if (!isDone() && (l2Var = this.b) != l2Var2) {
            l2 l2Var3 = new l2(runnable, executor);
            do {
                l2Var3.c = l2Var;
                if (f.a(this, l2Var, l2Var3)) {
                    return;
                } else {
                    l2Var = this.b;
                }
            } while (l2Var != l2Var2);
        }
        g(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        i2 i2Var;
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof n2)) {
            return false;
        }
        if (d) {
            i2Var = new i2(z, new CancellationException("Future.cancel() was called."));
        } else {
            i2Var = z ? i2.c : i2.d;
            Objects.requireNonNull(i2Var);
        }
        boolean z2 = false;
        while (true) {
            if (f.b(this, obj, i2Var)) {
                f(this, z);
                if (!(obj instanceof n2)) {
                    break;
                }
                x76 x76Var = ((n2) obj).b;
                if (!(x76Var instanceof p2)) {
                    x76Var.cancel(z);
                    break;
                }
                this = (u2) x76Var;
                obj = this.a;
                if (!(obj == null) && !(obj instanceof n2)) {
                    break;
                }
                z2 = true;
            } else {
                obj = this.a;
                if (!(obj instanceof n2)) {
                    return z2;
                }
            }
        }
        return true;
    }

    public final void e(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00c3 -> B:33:0x0083). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(long j, TimeUnit timeUnit) {
        boolean z;
        long j2;
        long nanoTime;
        t2 t2Var = t2.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if ((obj != null) && (!(obj instanceof n2))) {
            return h(obj);
        }
        long j3 = 0;
        long nanoTime2 = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            t2 t2Var2 = this.c;
            if (t2Var2 != t2Var) {
                t2 t2Var3 = new t2();
                z = true;
                while (true) {
                    hpd hpdVar = f;
                    hpdVar.f(t2Var3, t2Var2);
                    j2 = j3;
                    if (!hpdVar.c(this, t2Var2, t2Var3)) {
                        t2Var2 = this.c;
                        if (t2Var2 == t2Var) {
                            break;
                        }
                        j3 = j2;
                    } else {
                        while (true) {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                k(t2Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && (!(obj2 instanceof n2))) {
                                return h(obj2);
                            }
                            nanoTime = nanoTime2 - System.nanoTime();
                            if (nanoTime < 1000) {
                                k(t2Var3);
                                break;
                            }
                            nanos = nanoTime;
                        }
                    }
                }
                nanos = nanoTime;
                if (nanos <= j2) {
                    String u2Var = toString();
                    String obj3 = timeUnit.toString();
                    Locale locale = Locale.ROOT;
                    String lowerCase = obj3.toLowerCase(locale);
                    StringBuilder o = ik8.o(j, "Waited ", " ");
                    o.append(timeUnit.toString().toLowerCase(locale));
                    String sb = o.toString();
                    if (nanos + 1000 < j2) {
                        String concat = sb.concat(" (plus ");
                        long j4 = -nanos;
                        long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
                        long nanos2 = j4 - timeUnit.toNanos(convert);
                        boolean z2 = (convert == j2 || nanos2 > 1000) ? z : false;
                        if (convert > j2) {
                            String str = concat + convert + " " + lowerCase;
                            if (z2) {
                                str = str.concat(",");
                            }
                            concat = str.concat(" ");
                        }
                        if (z2) {
                            concat = ik8.n(nanos2, concat, " nanoseconds ");
                        }
                        sb = concat.concat("delay)");
                    }
                    if (isDone()) {
                        throw new TimeoutException(sb.concat(" but future completed as timeout expired"));
                    }
                    throw new TimeoutException(qd4.y(sb, " for ", u2Var));
                }
                Object obj4 = this.a;
                if ((obj4 != null ? z : false) && (!(obj4 instanceof n2))) {
                    return h(obj4);
                }
                if (Thread.interrupted()) {
                    throw new InterruptedException();
                }
                nanoTime = nanoTime2 - System.nanoTime();
                nanos = nanoTime;
                if (nanos <= j2) {
                }
            }
            Object obj5 = this.a;
            Objects.requireNonNull(obj5);
            return h(obj5);
        }
        z = true;
        j2 = 0;
        if (nanos <= j2) {
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.a instanceof i2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.a != null) & (!(r2 instanceof n2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void k(t2 t2Var) {
        t2Var.a = null;
        while (true) {
            t2 t2Var2 = this.c;
            if (t2Var2 != t2.c) {
                t2 t2Var3 = null;
                while (t2Var2 != null) {
                    t2 t2Var4 = t2Var2.b;
                    if (t2Var2.a != null) {
                        t2Var3 = t2Var2;
                    } else if (t2Var3 != null) {
                        t2Var3.b = t2Var4;
                        if (t2Var3.a == null) {
                            break;
                        }
                    } else if (f.c(this, t2Var2, t2Var4)) {
                    }
                    t2Var2 = t2Var4;
                }
                return;
            }
            return;
        }
    }

    public final boolean l(Object obj) {
        if (obj == null) {
            obj = h;
        }
        if (!f.b(this, null, obj)) {
            return false;
        }
        f(this, false);
        return true;
    }

    public final boolean m(Throwable th) {
        th.getClass();
        if (!f.b(this, null, new k2(th))) {
            return false;
        }
        f(this, false);
        return true;
    }

    public final boolean n(x76 x76Var) {
        k2 k2Var;
        x76Var.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (x76Var.isDone()) {
                if (f.b(this, null, i(x76Var))) {
                    f(this, false);
                    return true;
                }
                return false;
            }
            n2 n2Var = new n2(this, x76Var);
            if (f.b(this, null, n2Var)) {
                try {
                    x76Var.b(n2Var, mo3.a);
                    return true;
                } catch (Throwable th) {
                    try {
                        k2Var = new k2(th);
                    } catch (Error | Exception unused) {
                        k2Var = k2.b;
                    }
                    f.b(this, n2Var, k2Var);
                    return true;
                }
            }
            obj = this.a;
        }
        if (obj instanceof i2) {
            x76Var.cancel(((i2) obj).a);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        if (r3.isEmpty() != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.a;
            if (obj instanceof n2) {
                sb.append(", setFuture=[");
                x76 x76Var = ((n2) obj).b;
                try {
                    if (x76Var == this) {
                        sb.append("this future");
                    } else {
                        sb.append(x76Var);
                    }
                } catch (Exception | StackOverflowError e2) {
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e2.getClass());
                }
                sb.append("]");
            } else {
                try {
                    str = j();
                    if (str != null) {
                    }
                    str = null;
                } catch (Exception | StackOverflowError e3) {
                    str = "Exception thrown from implementation: " + e3.getClass();
                }
                if (str != null) {
                    ik8.z(", info=[", str, "]", sb);
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                a(sb);
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
        t2 t2Var = t2.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof n2))) {
                return h(obj2);
            }
            t2 t2Var2 = this.c;
            if (t2Var2 != t2Var) {
                t2 t2Var3 = new t2();
                do {
                    hpd hpdVar = f;
                    hpdVar.f(t2Var3, t2Var2);
                    if (hpdVar.c(this, t2Var2, t2Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                k(t2Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof n2))));
                        return h(obj);
                    }
                    t2Var2 = this.c;
                } while (t2Var2 != t2Var);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return h(obj3);
        }
        throw new InterruptedException();
    }
}
