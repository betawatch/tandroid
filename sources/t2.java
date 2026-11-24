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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class t2 implements t56 {
    public static final boolean d;
    public static final f06 e;
    public static final qkd f;
    public static final Object h;
    public volatile Object a;
    public volatile k2 b;
    public volatile s2 c;

    static {
        boolean z;
        Throwable th;
        qkd n2Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = new f06(t2.class, (byte) 0);
        Throwable th2 = null;
        try {
            n2Var = new r2();
            th = null;
        } catch (Error | Exception e2) {
            th = e2;
            try {
                n2Var = new l2(AtomicReferenceFieldUpdater.newUpdater(s2.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(s2.class, s2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(t2.class, s2.class, "c"), AtomicReferenceFieldUpdater.newUpdater(t2.class, k2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(t2.class, Object.class, "a"));
            } catch (Error | Exception e3) {
                th2 = e3;
                n2Var = new n2();
            }
        }
        f = n2Var;
        if (th2 != null) {
            f06 f06Var = e;
            Logger a = f06Var.a();
            Level level = Level.SEVERE;
            a.log(level, "UnsafeAtomicHelper is broken!", th);
            f06Var.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        h = new Object();
    }

    public static void f(t2 t2Var, boolean z) {
        k2 k2Var = null;
        while (true) {
            for (s2 e2 = f.e(t2Var); e2 != null; e2 = e2.b) {
                Thread thread = e2.a;
                if (thread != null) {
                    e2.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                z = false;
            }
            t2Var.d();
            k2 k2Var2 = k2Var;
            k2 d2 = f.d(t2Var);
            k2 k2Var3 = k2Var2;
            while (d2 != null) {
                k2 k2Var4 = d2.c;
                d2.c = k2Var3;
                k2Var3 = d2;
                d2 = k2Var4;
            }
            while (k2Var3 != null) {
                k2Var = k2Var3.c;
                Runnable runnable = k2Var3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof m2) {
                    m2 m2Var = (m2) runnable;
                    t2Var = m2Var.a;
                    if (t2Var.a == m2Var) {
                        if (f.b(t2Var, m2Var, i(m2Var.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = k2Var3.b;
                    Objects.requireNonNull(executor);
                    g(runnable, executor);
                }
                k2Var3 = k2Var;
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
        if (obj instanceof h2) {
            RuntimeException runtimeException = ((h2) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof j2) {
            throw new ExecutionException(((j2) obj).a);
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
    public static Object i(t56 t56Var) {
        Object obj;
        Throwable th;
        if (t56Var instanceof o2) {
            Object obj2 = ((t2) t56Var).a;
            if (obj2 instanceof h2) {
                h2 h2Var = (h2) obj2;
                if (h2Var.a) {
                    obj2 = h2Var.b != null ? new h2(false, h2Var.b) : h2.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if (t56Var instanceof t2) {
            t2 t2Var = (t2) t56Var;
            if (t2Var instanceof o2) {
                Object obj3 = t2Var.a;
                if (obj3 instanceof j2) {
                    th = ((j2) obj3).a;
                    if (th != null) {
                        return new j2(th);
                    }
                }
            }
            th = null;
            if (th != null) {
            }
        }
        boolean isCancelled = t56Var.isCancelled();
        boolean z = true;
        if ((!d) && isCancelled) {
            h2 h2Var2 = h2.d;
            Objects.requireNonNull(h2Var2);
            return h2Var2;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = t56Var.get();
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
                return new j2(e);
            } catch (CancellationException e3) {
                if (isCancelled) {
                    return new h2(false, e3);
                }
                return new j2(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + t56Var, e3));
            } catch (ExecutionException e4) {
                if (!isCancelled) {
                    return new j2(e4.getCause());
                }
                return new h2(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + t56Var, e4));
            } catch (Exception e5) {
                e = e5;
                return new j2(e);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!isCancelled) {
            return obj == null ? h : obj;
        }
        return new h2(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + t56Var));
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

    @Override // t56
    public final void b(Runnable runnable, Executor executor) {
        k2 k2Var;
        k2 k2Var2 = k2.d;
        if (!isDone() && (k2Var = this.b) != k2Var2) {
            k2 k2Var3 = new k2(runnable, executor);
            do {
                k2Var3.c = k2Var;
                if (f.a(this, k2Var, k2Var3)) {
                    return;
                } else {
                    k2Var = this.b;
                }
            } while (k2Var != k2Var2);
        }
        g(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        h2 h2Var;
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof m2)) {
            return false;
        }
        if (d) {
            h2Var = new h2(z, new CancellationException("Future.cancel() was called."));
        } else {
            h2Var = z ? h2.c : h2.d;
            Objects.requireNonNull(h2Var);
        }
        boolean z2 = false;
        while (true) {
            if (f.b(this, obj, h2Var)) {
                f(this, z);
                if (!(obj instanceof m2)) {
                    break;
                }
                t56 t56Var = ((m2) obj).b;
                if (!(t56Var instanceof o2)) {
                    t56Var.cancel(z);
                    break;
                }
                this = (t2) t56Var;
                obj = this.a;
                if (!(obj == null) && !(obj instanceof m2)) {
                    break;
                }
                z2 = true;
            } else {
                obj = this.a;
                if (!(obj instanceof m2)) {
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
        s2 s2Var = s2.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if ((obj != null) && (!(obj instanceof m2))) {
            return h(obj);
        }
        long j3 = 0;
        long nanoTime2 = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            s2 s2Var2 = this.c;
            if (s2Var2 != s2Var) {
                s2 s2Var3 = new s2();
                z = true;
                while (true) {
                    qkd qkdVar = f;
                    qkdVar.f(s2Var3, s2Var2);
                    j2 = j3;
                    if (!qkdVar.c(this, s2Var2, s2Var3)) {
                        s2Var2 = this.c;
                        if (s2Var2 == s2Var) {
                            break;
                        }
                        j3 = j2;
                    } else {
                        while (true) {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                k(s2Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && (!(obj2 instanceof m2))) {
                                return h(obj2);
                            }
                            nanoTime = nanoTime2 - System.nanoTime();
                            if (nanoTime < 1000) {
                                k(s2Var3);
                                break;
                            }
                            nanos = nanoTime;
                        }
                    }
                }
                nanos = nanoTime;
                if (nanos <= j2) {
                    String t2Var = toString();
                    String obj3 = timeUnit.toString();
                    Locale locale = Locale.ROOT;
                    String lowerCase = obj3.toLowerCase(locale);
                    StringBuilder o = ug8.o(j, "Waited ", " ");
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
                            concat = ug8.n(nanos2, concat, " nanoseconds ");
                        }
                        sb = concat.concat("delay)");
                    }
                    if (isDone()) {
                        throw new TimeoutException(sb.concat(" but future completed as timeout expired"));
                    }
                    throw new TimeoutException(tb4.y(sb, " for ", t2Var));
                }
                Object obj4 = this.a;
                if ((obj4 != null ? z : false) && (!(obj4 instanceof m2))) {
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
        return this.a instanceof h2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.a != null) & (!(r2 instanceof m2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void k(s2 s2Var) {
        s2Var.a = null;
        while (true) {
            s2 s2Var2 = this.c;
            if (s2Var2 != s2.c) {
                s2 s2Var3 = null;
                while (s2Var2 != null) {
                    s2 s2Var4 = s2Var2.b;
                    if (s2Var2.a != null) {
                        s2Var3 = s2Var2;
                    } else if (s2Var3 != null) {
                        s2Var3.b = s2Var4;
                        if (s2Var3.a == null) {
                            break;
                        }
                    } else if (f.c(this, s2Var2, s2Var4)) {
                    }
                    s2Var2 = s2Var4;
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
        if (!f.b(this, null, new j2(th))) {
            return false;
        }
        f(this, false);
        return true;
    }

    public final boolean n(t56 t56Var) {
        j2 j2Var;
        t56Var.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (t56Var.isDone()) {
                if (f.b(this, null, i(t56Var))) {
                    f(this, false);
                    return true;
                }
                return false;
            }
            m2 m2Var = new m2(this, t56Var);
            if (f.b(this, null, m2Var)) {
                try {
                    t56Var.b(m2Var, vn3.a);
                    return true;
                } catch (Throwable th) {
                    try {
                        j2Var = new j2(th);
                    } catch (Error | Exception unused) {
                        j2Var = j2.b;
                    }
                    f.b(this, m2Var, j2Var);
                    return true;
                }
            }
            obj = this.a;
        }
        if (obj instanceof h2) {
            t56Var.cancel(((h2) obj).a);
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
            if (obj instanceof m2) {
                sb.append(", setFuture=[");
                t56 t56Var = ((m2) obj).b;
                try {
                    if (t56Var == this) {
                        sb.append("this future");
                    } else {
                        sb.append(t56Var);
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
                    ug8.z(", info=[", str, "]", sb);
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
        s2 s2Var = s2.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof m2))) {
                return h(obj2);
            }
            s2 s2Var2 = this.c;
            if (s2Var2 != s2Var) {
                s2 s2Var3 = new s2();
                do {
                    qkd qkdVar = f;
                    qkdVar.f(s2Var3, s2Var2);
                    if (qkdVar.c(this, s2Var2, s2Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                k(s2Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof m2))));
                        return h(obj);
                    }
                    s2Var2 = this.c;
                } while (s2Var2 != s2Var);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return h(obj3);
        }
        throw new InterruptedException();
    }
}
