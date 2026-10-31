package wd;

import bb.u;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.p;
import org.telegram.tgnet.TLObject;
import td.b0;
import td.f1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class n {
    public static final ea.a a = new ea.a("NONE");
    public static final ea.a b = new ea.a("PENDING");

    /* JADX WARN: Removed duplicated region for block: B:30:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(b bVar, c cVar, ed.c cVar2) {
        e eVar;
        int i10;
        p pVar;
        Throwable th2;
        f1 f1Var;
        CancellationException cancellationException;
        if (cVar2 instanceof e) {
            eVar = (e) cVar2;
            int i11 = eVar.c;
            if ((i11 & TLObject.FLAG_31) != 0) {
                eVar.c = i11 - TLObject.FLAG_31;
                Object obj = eVar.b;
                dd.a aVar = dd.a.a;
                i10 = eVar.c;
                if (i10 != 0) {
                    l9.b.b(obj);
                    p pVar2 = new p();
                    try {
                        c gVar = new g(cVar, pVar2);
                        eVar.a = pVar2;
                        eVar.c = 1;
                        if (bVar.p(gVar, eVar) == aVar) {
                            return aVar;
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        pVar = pVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = eVar.a;
                    try {
                        l9.b.b(obj);
                        return null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                th2 = (Throwable) pVar.a;
                if ((th2 == null && th2.equals(th)) || ((f1Var = (f1) eVar.getContext().get(b0.b)) != null && f1Var.isCancelled() && (cancellationException = f1Var.getCancellationException()) != null && cancellationException.equals(th))) {
                    throw th;
                }
                if (th2 != null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    i8.d.a(th2, th);
                    throw th2;
                }
                i8.d.a(th, th2);
                throw th;
            }
        }
        eVar = new e(cVar2);
        Object obj2 = eVar.b;
        dd.a aVar2 = dd.a.a;
        i10 = eVar.c;
        if (i10 != 0) {
        }
        th2 = (Throwable) pVar.a;
        if (th2 == null) {
        }
        if (th2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, ed.c cVar) {
        j jVar;
        int i10;
        ea.a aVar;
        p pVar;
        xd.a e;
        u uVar;
        Object obj;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i11 = jVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                jVar.d = i11 - TLObject.FLAG_31;
                Object obj2 = jVar.c;
                Object obj3 = dd.a.a;
                i10 = jVar.d;
                aVar = xd.e.a;
                if (i10 != 0) {
                    l9.b.b(obj2);
                    p pVar2 = new p();
                    pVar2.a = aVar;
                    u uVar2 = new u(pVar2, 1);
                    try {
                        jVar.a = pVar2;
                        jVar.b = uVar2;
                        jVar.d = 1;
                        if (bVar.p(uVar2, jVar) == obj3) {
                            return obj3;
                        }
                        pVar = pVar2;
                    } catch (xd.a e7) {
                        pVar = pVar2;
                        e = e7;
                        uVar = uVar2;
                        if (e.a != uVar) {
                            throw e;
                        }
                        obj = pVar.a;
                        if (obj == aVar) {
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uVar = jVar.b;
                    pVar = jVar.a;
                    try {
                        l9.b.b(obj2);
                    } catch (xd.a e10) {
                        e = e10;
                        if (e.a != uVar) {
                        }
                        obj = pVar.a;
                        if (obj == aVar) {
                        }
                    }
                }
                obj = pVar.a;
                if (obj == aVar) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        jVar = new j(cVar);
        Object obj22 = jVar.c;
        Object obj32 = dd.a.a;
        i10 = jVar.d;
        aVar = xd.e.a;
        if (i10 != 0) {
        }
        obj = pVar.a;
        if (obj == aVar) {
        }
    }
}
