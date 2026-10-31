package yd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.telegram.tgnet.ConnectionsManager;
import td.a0;
import td.b0;
import td.c2;
import td.d2;
import td.e0;
import td.f1;
import td.h2;
import td.w0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class a {
    public static final ea.a a = new ea.a("NO_DECISION");
    public static final ea.a b = new ea.a("CLOSED");
    public static final ea.a c = new ea.a("UNDEFINED");
    public static final ea.a d = new ea.a("REUSABLE_CLAIMED");
    public static final ea.a e = new ea.a("CONDITION_FALSE");
    public static final ea.a f = new ea.a("NO_THREAD_ELEMENTS");

    public static final Object a(t tVar, long j10, ld.p pVar) {
        while (true) {
            if (tVar.c >= j10 && !tVar.d()) {
                return tVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.a;
            Object obj = atomicReferenceFieldUpdater.get(tVar);
            ea.a aVar = b;
            if (obj == aVar) {
                return aVar;
            }
            t tVar2 = (t) ((d) obj);
            if (tVar2 == null) {
                tVar2 = (t) pVar.invoke(Long.valueOf(tVar.c + 1), tVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(tVar, null, tVar2)) {
                    if (atomicReferenceFieldUpdater.get(tVar) != null) {
                        break;
                    }
                }
                if (tVar.d()) {
                    tVar.e();
                }
            }
            tVar = tVar2;
        }
    }

    public static final t b(Object obj) {
        if (obj != b) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void c(cd.h hVar, Throwable th2) {
        Throwable runtimeException;
        Iterator it = f.a.iterator();
        while (it.hasNext()) {
            try {
                ((ud.b) it.next()).c(th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    i8.d.a(runtimeException, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            i8.d.a(th2, new g(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }

    public static final boolean d(Object obj) {
        return obj == b;
    }

    public static final Object e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void f(cd.h hVar, Object obj) {
        if (obj == f) {
            return;
        }
        if (!(obj instanceof y)) {
            Object fold = hVar.fold(null, w.d);
            kotlin.jvm.internal.i.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            a1.g.y(fold);
            throw null;
        }
        y yVar = (y) obj;
        c2[] c2VarArr = yVar.b;
        int length = c2VarArr.length - 1;
        if (length < 0) {
            return;
        }
        c2 c2Var = c2VarArr[length];
        kotlin.jvm.internal.i.b(null);
        Object obj2 = yVar.a[length];
        throw null;
    }

    public static final void g(Object obj, cd.c cVar) {
        if (!(cVar instanceof h)) {
            cVar.resumeWith(obj);
            return;
        }
        h hVar = (h) cVar;
        a0 a0Var = hVar.d;
        ed.c cVar2 = hVar.e;
        Throwable a2 = ad.g.a(obj);
        Object vVar = a2 == null ? obj : new td.v(a2, false);
        cVar2.getContext();
        if (a0Var.d()) {
            hVar.f = vVar;
            hVar.c = 1;
            a0Var.c(cVar2.getContext(), hVar);
            return;
        }
        w0 a10 = d2.a();
        if (a10.c >= 4294967296L) {
            hVar.f = vVar;
            hVar.c = 1;
            bd.g gVar = a10.e;
            if (gVar == null) {
                gVar = new bd.g();
                a10.e = gVar;
            }
            gVar.addLast(hVar);
            return;
        }
        a10.h(true);
        try {
            f1 f1Var = (f1) cVar2.getContext().get(b0.b);
            if (f1Var == null || f1Var.isActive()) {
                Object obj2 = hVar.h;
                cd.h context = cVar2.getContext();
                Object k10 = k(context, obj2);
                h2 v = k10 != f ? e0.v(cVar2, context, k10) : null;
                try {
                    cVar2.resumeWith(obj);
                } finally {
                    if (v == null || v.M()) {
                        f(context, k10);
                    }
                }
            } else {
                CancellationException cancellationException = f1Var.getCancellationException();
                hVar.b(vVar, cancellationException);
                hVar.resumeWith(l9.b.a(cancellationException));
            }
            while (a10.j()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long i(String str, long j10, long j11, long j12) {
        String str2;
        Long l4;
        boolean z10;
        int i10;
        int i11;
        int i12 = v.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j10;
        }
        int length = str2.length();
        if (length != 0) {
            int i13 = 0;
            char charAt = str2.charAt(0);
            long j13 = -9223372036854775807L;
            if (charAt < '0') {
                z10 = true;
                if (length != 1) {
                    if (charAt == '+') {
                        z10 = false;
                        i13 = 1;
                    } else if (charAt == '-') {
                        j13 = Long.MIN_VALUE;
                        i13 = 1;
                    }
                }
            } else {
                z10 = false;
            }
            long j14 = 0;
            long j15 = -256204778801521550L;
            while (i13 < length) {
                int digit = Character.digit((int) str2.charAt(i13), 10);
                if (digit >= 0) {
                    if (j14 >= j15) {
                        i10 = length;
                        i11 = i13;
                    } else if (j15 == -256204778801521550L) {
                        i10 = length;
                        i11 = i13;
                        j15 = j13 / 10;
                        if (j14 < j15) {
                        }
                    }
                    long j16 = j14 * 10;
                    long j17 = digit;
                    if (j16 >= j13 + j17) {
                        j14 = j16 - j17;
                        i13 = i11 + 1;
                        length = i10;
                    }
                }
            }
            l4 = z10 ? Long.valueOf(j14) : Long.valueOf(-j14);
            if (l4 != null) {
                throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
            }
            long longValue = l4.longValue();
            if (j11 <= longValue && longValue <= j12) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + longValue + '\'').toString());
        }
        l4 = null;
        if (l4 != null) {
        }
    }

    public static int j(int i10, int i11, String str) {
        return (int) i(str, i10, 1, (i11 & 8) != 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2097150);
    }

    public static final Object k(cd.h hVar, Object obj) {
        if (obj == null) {
            obj = hVar.fold(0, w.c);
            kotlin.jvm.internal.i.b(obj);
        }
        if (obj == 0) {
            return f;
        }
        if (obj instanceof Integer) {
            return hVar.fold(new y(((Number) obj).intValue(), hVar), w.e);
        }
        a1.g.y(obj);
        throw null;
    }
}
