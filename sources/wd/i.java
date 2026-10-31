package wd;

import bb.b0;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i implements c {
    public final /* synthetic */ kotlin.jvm.internal.n a;
    public final /* synthetic */ c b;
    public final /* synthetic */ b0 c;

    public i(kotlin.jvm.internal.n nVar, c cVar, b0 b0Var) {
        this.a = nVar;
        this.b = cVar;
        this.c = b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // wd.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, ed.c cVar) {
        h hVar;
        Object obj2;
        int i10;
        i iVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i11 = hVar.e;
            if ((i11 & TLObject.FLAG_31) != 0) {
                hVar.e = i11 - TLObject.FLAG_31;
                obj2 = hVar.c;
                dd.a aVar = dd.a.a;
                i10 = hVar.e;
                ad.j jVar = ad.j.a;
                if (i10 != 0) {
                    l9.b.b(obj2);
                    if (this.a.a) {
                        hVar.e = 1;
                        if (this.b.b(obj, hVar) != aVar) {
                            return jVar;
                        }
                    } else {
                        hVar.a = this;
                        hVar.b = obj;
                        hVar.e = 2;
                        obj2 = this.c.invoke(obj, hVar);
                        if (obj2 != aVar) {
                            iVar = this;
                        }
                    }
                    return aVar;
                }
                if (i10 == 1) {
                    l9.b.b(obj2);
                    return jVar;
                }
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l9.b.b(obj2);
                    return jVar;
                }
                obj = hVar.b;
                iVar = hVar.a;
                l9.b.b(obj2);
                if (!((Boolean) obj2).booleanValue()) {
                    iVar.a.a = true;
                    c cVar2 = iVar.b;
                    hVar.a = null;
                    hVar.b = null;
                    hVar.e = 3;
                    if (cVar2.b(obj, hVar) == aVar) {
                        return aVar;
                    }
                }
                return jVar;
            }
        }
        hVar = new h(this, cVar);
        obj2 = hVar.c;
        dd.a aVar2 = dd.a.a;
        i10 = hVar.e;
        ad.j jVar2 = ad.j.a;
        if (i10 != 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
        return jVar2;
    }
}
