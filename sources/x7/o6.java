package x7;

import b8.ib;
import b8.jc;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class o6 {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(yd.p pVar, androidx.lifecycle.k0 k0Var, hd.c cVar) {
        yd.n nVar;
        int i3;
        try {
            if (cVar instanceof yd.n) {
                nVar = (yd.n) cVar;
                int i10 = nVar.c;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    nVar.c = i10 - TLObject.FLAG_31;
                    Object obj = nVar.b;
                    gd.a aVar = gd.a.a;
                    i3 = nVar.c;
                    if (i3 != 0) {
                        ib.b(obj);
                        if (nVar.getContext().get(wd.y.b) != pVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        nVar.a = k0Var;
                        nVar.c = 1;
                        wd.m mVar = new wd.m(1, jc.b(nVar));
                        mVar.s();
                        ((yd.o) pVar).T(new v0.g(mVar, 1));
                        if (mVar.r() == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        k0Var = nVar.a;
                        ib.b(obj);
                    }
                    k0Var.invoke();
                    return dd.k.a;
                }
            }
            if (i3 != 0) {
            }
            k0Var.invoke();
            return dd.k.a;
        } catch (Throwable th2) {
            k0Var.invoke();
            throw th2;
        }
        nVar = new yd.n(cVar);
        Object obj2 = nVar.b;
        gd.a aVar2 = gd.a.a;
        i3 = nVar.c;
    }
}
