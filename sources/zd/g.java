package zd;

import b8.ib;
import gi.v5;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g implements b {
    public final /* synthetic */ v5 a;
    public final /* synthetic */ l1.n b;

    public g(v5 v5Var, l1.n nVar) {
        this.a = v5Var;
        this.b = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // zd.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object U(c cVar, hd.c cVar2) {
        f fVar;
        gd.a aVar;
        int i3;
        g gVar;
        x xVar;
        l1.n nVar;
        ae.k kVar;
        Throwable th2;
        ae.k kVar2;
        l1.n nVar2;
        try {
            if (cVar2 instanceof f) {
                fVar = (f) cVar2;
                int i10 = fVar.b;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    fVar.b = i10 - TLObject.FLAG_31;
                    Object obj = fVar.a;
                    aVar = gd.a.a;
                    i3 = fVar.b;
                    if (i3 != 0) {
                        ib.b(obj);
                        try {
                            v5 v5Var = this.a;
                            fVar.d = this;
                            fVar.e = cVar;
                            fVar.b = 1;
                            if (v5Var.U(cVar, fVar) != aVar) {
                                gVar = this;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            gVar = this;
                            xVar = new x(th);
                            nVar = gVar.b;
                            fVar.d = th;
                            fVar.e = null;
                            fVar.b = 2;
                            if (v.a(xVar, nVar, th, fVar) != aVar) {
                                return aVar;
                            }
                            throw th;
                        }
                        return aVar;
                    }
                    if (i3 != 1) {
                        if (i3 == 2) {
                            Throwable th4 = (Throwable) fVar.d;
                            ib.b(obj);
                            throw th4;
                        }
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kVar2 = (ae.k) fVar.d;
                        try {
                            ib.b(obj);
                            kVar2.releaseIntercepted();
                            return dd.k.a;
                        } catch (Throwable th5) {
                            th2 = th5;
                            kVar2.releaseIntercepted();
                            throw th2;
                        }
                    }
                    cVar = fVar.e;
                    gVar = (g) fVar.d;
                    try {
                        ib.b(obj);
                    } catch (Throwable th6) {
                        th = th6;
                        xVar = new x(th);
                        nVar = gVar.b;
                        fVar.d = th;
                        fVar.e = null;
                        fVar.b = 2;
                        if (v.a(xVar, nVar, th, fVar) != aVar) {
                        }
                    }
                    kVar = new ae.k(cVar, fVar.getContext());
                    nVar2 = gVar.b;
                    fVar.d = kVar;
                    fVar.e = null;
                    fVar.b = 3;
                    if (nVar2.a(kVar, null, fVar) != aVar) {
                        kVar2 = kVar;
                        kVar2.releaseIntercepted();
                        return dd.k.a;
                    }
                    return aVar;
                }
            }
            nVar2 = gVar.b;
            fVar.d = kVar;
            fVar.e = null;
            fVar.b = 3;
            if (nVar2.a(kVar, null, fVar) != aVar) {
            }
            return aVar;
        } catch (Throwable th7) {
            th2 = th7;
            kVar2 = kVar;
            kVar2.releaseIntercepted();
            throw th2;
        }
        fVar = new f(this, cVar2);
        Object obj2 = fVar.a;
        aVar = gd.a.a;
        i3 = fVar.b;
        if (i3 != 0) {
        }
        kVar = new ae.k(cVar, fVar.getContext());
    }
}
