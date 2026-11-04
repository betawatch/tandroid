package zd;

import b8.gb;
import b8.ib;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import org.telegram.tgnet.TLObject;
import wd.a1;
import wd.y;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class v {
    public static final be.t a = new be.t("NONE", 0);
    public static final be.t b = new be.t("PENDING", 0);

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(x xVar, l1.n nVar, Throwable th2, hd.c cVar) {
        e eVar;
        int i3;
        try {
            if (cVar instanceof e) {
                eVar = (e) cVar;
                int i10 = eVar.c;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    eVar.c = i10 - TLObject.FLAG_31;
                    Object obj = eVar.b;
                    Object obj2 = gd.a.a;
                    i3 = eVar.c;
                    if (i3 != 0) {
                        ib.b(obj);
                        eVar.a = th2;
                        eVar.c = 1;
                        if (nVar.a(xVar, th2, eVar) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th2 = eVar.a;
                        ib.b(obj);
                    }
                    return dd.k.a;
                }
            }
            if (i3 != 0) {
            }
            return dd.k.a;
        } catch (Throwable th3) {
            if (th2 != null && th2 != th3) {
                gb.a(th3, th2);
            }
            throw th3;
        }
        eVar = new e(cVar);
        Object obj3 = eVar.b;
        Object obj22 = gd.a.a;
        i3 = eVar.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable b(b bVar, c cVar, hd.c cVar2) {
        j jVar;
        int i3;
        kotlin.jvm.internal.r rVar;
        Throwable th2;
        a1 a1Var;
        CancellationException cancellationException;
        if (cVar2 instanceof j) {
            jVar = (j) cVar2;
            int i10 = jVar.c;
            if ((i10 & TLObject.FLAG_31) != 0) {
                jVar.c = i10 - TLObject.FLAG_31;
                Object obj = jVar.b;
                gd.a aVar = gd.a.a;
                i3 = jVar.c;
                if (i3 != 0) {
                    ib.b(obj);
                    kotlin.jvm.internal.r rVar2 = new kotlin.jvm.internal.r();
                    try {
                        c lVar = new l(cVar, rVar2);
                        jVar.a = rVar2;
                        jVar.c = 1;
                        if (bVar.U(lVar, jVar) == aVar) {
                            return aVar;
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        rVar = rVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = jVar.a;
                    try {
                        ib.b(obj);
                        return null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                th2 = (Throwable) rVar.a;
                if ((th2 == null && th2.equals(th)) || ((a1Var = (a1) jVar.getContext().get(y.b)) != null && a1Var.isCancelled() && (cancellationException = a1Var.getCancellationException()) != null && cancellationException.equals(th))) {
                    throw th;
                }
                if (th2 != null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    gb.a(th2, th);
                    throw th2;
                }
                gb.a(th, th2);
                throw th;
            }
        }
        jVar = new j(cVar2);
        Object obj2 = jVar.b;
        gd.a aVar2 = gd.a.a;
        i3 = jVar.c;
        if (i3 != 0) {
        }
        th2 = (Throwable) rVar.a;
        if (th2 == null) {
        }
        if (th2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (r2.b(r11, r0) == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x005e, B:20:0x0072, B:22:0x007a, B:24:0x0080, B:26:0x0086, B:28:0x0097, B:29:0x009f, B:30:0x00a0, B:31:0x00a7, B:39:0x0049, B:42:0x0054), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v4, types: [yd.q] */
    /* JADX WARN: Type inference failed for: r9v6, types: [yd.q] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0094 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(c cVar, yd.o oVar, boolean z10, hd.c cVar2) {
        d dVar;
        int i3;
        yd.b bVar;
        yd.o oVar2;
        yd.b bVar2;
        c cVar3;
        yd.o oVar3;
        try {
            if (cVar2 instanceof d) {
                dVar = (d) cVar2;
                int i10 = dVar.f;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    dVar.f = i10 - TLObject.FLAG_31;
                    Object obj = dVar.e;
                    gd.a aVar = gd.a.a;
                    i3 = dVar.f;
                    if (i3 != 0) {
                        ib.b(obj);
                        if (cVar instanceof x) {
                            throw ((x) cVar).a;
                        }
                        yd.c cVar4 = oVar.d;
                        cVar4.getClass();
                        bVar = new yd.b(cVar4);
                        oVar3 = oVar;
                        dVar.a = cVar;
                        dVar.b = oVar3;
                        dVar.c = bVar;
                        dVar.d = z10;
                        dVar.f = 1;
                        obj = bVar.b(dVar);
                        if (obj != aVar) {
                        }
                    } else if (i3 == 1) {
                        z10 = dVar.d;
                        bVar2 = dVar.c;
                        ?? r9 = dVar.b;
                        cVar3 = dVar.a;
                        ib.b(obj);
                        oVar2 = r9;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z10 = dVar.d;
                        bVar2 = dVar.c;
                        ?? r92 = dVar.b;
                        cVar3 = dVar.a;
                        ib.b(obj);
                        yd.o oVar4 = r92;
                        c cVar5 = cVar3;
                        bVar = bVar2;
                        cVar = cVar5;
                        oVar3 = oVar4;
                        dVar.a = cVar;
                        dVar.b = oVar3;
                        dVar.c = bVar;
                        dVar.d = z10;
                        dVar.f = 1;
                        obj = bVar.b(dVar);
                        if (obj != aVar) {
                            return aVar;
                        }
                        yd.b bVar3 = bVar;
                        cVar3 = cVar;
                        bVar2 = bVar3;
                        oVar2 = oVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z10) {
                                oVar2.cancel(null);
                            }
                            return dd.k.a;
                        }
                        Object obj2 = bVar2.a;
                        be.t tVar = yd.e.p;
                        if (obj2 == tVar) {
                            throw new IllegalStateException("`hasNext()` has not been invoked");
                        }
                        bVar2.a = tVar;
                        if (obj2 == yd.e.l) {
                            Throwable n4 = bVar2.c.n();
                            int i11 = be.s.a;
                            throw n4;
                        }
                        dVar.a = cVar3;
                        dVar.b = oVar2;
                        dVar.c = bVar2;
                        dVar.d = z10;
                        dVar.f = 2;
                        oVar4 = oVar2;
                    }
                }
            }
            if (i3 != 0) {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                if (z10) {
                    CancellationException cancellationException = th2 instanceof CancellationException ? th2 : null;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th2);
                    }
                    oVar.cancel(cancellationException);
                }
                throw th3;
            }
        }
        dVar = new d(cVar2);
        Object obj3 = dVar.e;
        gd.a aVar2 = gd.a.a;
        i3 = dVar.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(b bVar, hd.c cVar) {
        q qVar;
        int i3;
        be.t tVar;
        kotlin.jvm.internal.r rVar;
        ae.a e10;
        p pVar;
        Object obj;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i10 = qVar.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                qVar.d = i10 - TLObject.FLAG_31;
                Object obj2 = qVar.c;
                Object obj3 = gd.a.a;
                i3 = qVar.d;
                tVar = ae.i.a;
                if (i3 != 0) {
                    ib.b(obj2);
                    kotlin.jvm.internal.r rVar2 = new kotlin.jvm.internal.r();
                    rVar2.a = tVar;
                    p pVar2 = new p(rVar2, 0);
                    try {
                        qVar.a = rVar2;
                        qVar.b = pVar2;
                        qVar.d = 1;
                        if (bVar.U(pVar2, qVar) == obj3) {
                            return obj3;
                        }
                        rVar = rVar2;
                    } catch (ae.a e11) {
                        rVar = rVar2;
                        e10 = e11;
                        pVar = pVar2;
                        if (e10.a != pVar) {
                            throw e10;
                        }
                        obj = rVar.a;
                        if (obj == tVar) {
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = qVar.b;
                    rVar = qVar.a;
                    try {
                        ib.b(obj2);
                    } catch (ae.a e12) {
                        e10 = e12;
                        if (e10.a != pVar) {
                        }
                        obj = rVar.a;
                        if (obj == tVar) {
                        }
                    }
                }
                obj = rVar.a;
                if (obj == tVar) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        qVar = new q(cVar);
        Object obj22 = qVar.c;
        Object obj32 = gd.a.a;
        i3 = qVar.d;
        tVar = ae.i.a;
        if (i3 != 0) {
        }
        obj = rVar.a;
        if (obj == tVar) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(b bVar, hd.c cVar) {
        r rVar;
        int i3;
        kotlin.jvm.internal.r rVar2;
        ae.a e10;
        p pVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i10 = rVar.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                rVar.d = i10 - TLObject.FLAG_31;
                Object obj = rVar.c;
                Object obj2 = gd.a.a;
                i3 = rVar.d;
                if (i3 != 0) {
                    ib.b(obj);
                    kotlin.jvm.internal.r rVar3 = new kotlin.jvm.internal.r();
                    p pVar2 = new p(rVar3, 1);
                    try {
                        rVar.a = rVar3;
                        rVar.b = pVar2;
                        rVar.d = 1;
                        if (bVar.U(pVar2, rVar) == obj2) {
                            return obj2;
                        }
                        rVar2 = rVar3;
                    } catch (ae.a e11) {
                        rVar2 = rVar3;
                        e10 = e11;
                        pVar = pVar2;
                        if (e10.a != pVar) {
                        }
                        return rVar2.a;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = rVar.b;
                    rVar2 = rVar.a;
                    try {
                        ib.b(obj);
                    } catch (ae.a e12) {
                        e10 = e12;
                        if (e10.a != pVar) {
                            throw e10;
                        }
                        return rVar2.a;
                    }
                }
                return rVar2.a;
            }
        }
        rVar = new r(cVar);
        Object obj3 = rVar.c;
        Object obj22 = gd.a.a;
        i3 = rVar.d;
        if (i3 != 0) {
        }
        return rVar2.a;
    }
}
