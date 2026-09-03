package qd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k7.n7;
import k7.p7;
import ld.a0;
import ld.b0;
import ld.b2;
import ld.c2;
import ld.e0;
import ld.f1;
import ld.g2;
import ld.w0;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class a {
    public static final o3.c a;
    public static final o3.c b;
    public static final o3.c c;
    public static final o3.c d;
    public static final o3.c e;
    public static final o3.c f;

    static {
        int i10 = 14;
        a = new o3.c("NO_DECISION", i10);
        b = new o3.c("CLOSED", i10);
        c = new o3.c("UNDEFINED", i10);
        d = new o3.c("REUSABLE_CLAIMED", i10);
        e = new o3.c("CONDITION_FALSE", i10);
        f = new o3.c("NO_THREAD_ELEMENTS", i10);
    }

    public static final Object a(t tVar, long j10, dd.p pVar) {
        while (true) {
            if (tVar.c >= j10 && !tVar.d()) {
                return tVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.a;
            Object obj = atomicReferenceFieldUpdater.get(tVar);
            o3.c cVar = b;
            if (obj == cVar) {
                return cVar;
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

    public static final void c(Throwable th2, uc.h hVar) {
        Throwable runtimeException;
        Iterator it = f.a.iterator();
        while (it.hasNext()) {
            try {
                ((md.b) it.next()).c(th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    n7.a(runtimeException, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            n7.a(th2, new g(hVar));
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

    public static final void f(uc.h hVar, Object obj) {
        if (obj == f) {
            return;
        }
        if (!(obj instanceof y)) {
            Object fold = hVar.fold(null, w.d);
            kotlin.jvm.internal.j.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            android.support.v4.media.a.v(fold);
            throw null;
        }
        y yVar = (y) obj;
        b2[] b2VarArr = yVar.b;
        int length = b2VarArr.length - 1;
        if (length < 0) {
            return;
        }
        b2 b2Var = b2VarArr[length];
        kotlin.jvm.internal.j.b(null);
        Object obj2 = yVar.a[length];
        throw null;
    }

    public static final void g(Object obj, uc.c cVar) {
        if (!(cVar instanceof h)) {
            cVar.resumeWith(obj);
            return;
        }
        h hVar = (h) cVar;
        a0 a0Var = hVar.d;
        wc.c cVar2 = hVar.e;
        Throwable a2 = sc.f.a(obj);
        Object vVar = a2 == null ? obj : new ld.v(a2, false);
        cVar2.getContext();
        if (a0Var.e()) {
            hVar.f = vVar;
            hVar.c = 1;
            a0Var.c(cVar2.getContext(), hVar);
            return;
        }
        w0 a10 = c2.a();
        if (a10.c >= 4294967296L) {
            hVar.f = vVar;
            hVar.c = 1;
            tc.e eVar = a10.e;
            if (eVar == null) {
                eVar = new tc.e();
                a10.e = eVar;
            }
            eVar.addLast(hVar);
            return;
        }
        a10.h(true);
        try {
            f1 f1Var = (f1) cVar2.getContext().get(b0.b);
            if (f1Var == null || f1Var.isActive()) {
                Object obj2 = hVar.h;
                uc.h context = cVar2.getContext();
                Object k10 = k(context, obj2);
                g2 v = k10 != f ? e0.v(cVar2, context, k10) : null;
                try {
                    cVar2.resumeWith(obj);
                } finally {
                    if (v == null || v.M()) {
                        f(context, k10);
                    }
                }
            } else {
                CancellationException cancellationException = f1Var.getCancellationException();
                hVar.c(vVar, cancellationException);
                hVar.resumeWith(p7.a(cancellationException));
            }
            while (a10.j()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long i(String str, long j10, long j11, long j12) {
        String str2;
        Long l10;
        boolean z4;
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
                z4 = true;
                if (length != 1) {
                    if (charAt == '+') {
                        i13 = 1;
                    } else if (charAt == '-') {
                        j13 = Long.MIN_VALUE;
                        i13 = 1;
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
                        l10 = !z4 ? Long.valueOf(j14) : Long.valueOf(-j14);
                        if (l10 == null) {
                            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
                        }
                        long longValue = l10.longValue();
                        if (j11 <= longValue && longValue <= j12) {
                            return longValue;
                        }
                        throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + longValue + '\'').toString());
                    }
                }
            }
            z4 = false;
            long j142 = 0;
            long j152 = -256204778801521550L;
            while (i13 < length) {
            }
            if (!z4) {
            }
            if (l10 == null) {
            }
        }
        l10 = null;
        if (l10 == null) {
        }
    }

    public static int j(int i10, int i11, String str) {
        return (int) i(str, i10, 1, (i11 & 8) != 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2097150);
    }

    public static final Object k(uc.h hVar, Object obj) {
        if (obj == null) {
            obj = hVar.fold(0, w.c);
            kotlin.jvm.internal.j.b(obj);
        }
        if (obj == 0) {
            return f;
        }
        if (obj instanceof Integer) {
            return hVar.fold(new y(((Number) obj).intValue(), hVar), w.e);
        }
        android.support.v4.media.a.v(obj);
        throw null;
    }
}
