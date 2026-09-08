package w7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class i {
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0084 -> B:13:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0087 -> B:13:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(List list, k1.t tVar, kd.c cVar) {
        k1.c cVar2;
        int i10;
        List list2;
        kotlin.jvm.internal.p pVar;
        Iterator it;
        Throwable th2;
        if (cVar instanceof k1.c) {
            cVar2 = (k1.c) cVar;
            int i11 = cVar2.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                cVar2.d = i11 - TLObject.FLAG_31;
                Object obj = cVar2.c;
                Object obj2 = jd.a.a;
                i10 = cVar2.d;
                if (i10 != 0) {
                    v7.t7.b(obj);
                    ArrayList arrayList = new ArrayList();
                    k1.e eVar = new k1.e(list, arrayList, null);
                    cVar2.a = arrayList;
                    cVar2.d = 1;
                    if (tVar.a(eVar, cVar2) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = cVar2.b;
                        pVar = (kotlin.jvm.internal.p) cVar2.a;
                        try {
                            v7.t7.b(obj);
                        } catch (Throwable th3) {
                            Object obj3 = pVar.a;
                            if (obj3 == null) {
                                pVar.a = th3;
                            } else {
                                v7.r7.a((Throwable) obj3, th3);
                            }
                        }
                        while (it.hasNext()) {
                            rd.l lVar = (rd.l) it.next();
                            cVar2.a = pVar;
                            cVar2.b = it;
                            cVar2.d = 2;
                            if (lVar.invoke(cVar2) == obj2) {
                                return obj2;
                            }
                        }
                        th2 = (Throwable) pVar.a;
                        if (th2 == null) {
                            return gd.i.a;
                        }
                        throw th2;
                    }
                    list2 = (List) cVar2.a;
                    v7.t7.b(obj);
                }
                pVar = new kotlin.jvm.internal.p();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th2 = (Throwable) pVar.a;
                if (th2 == null) {
                }
            }
        }
        cVar2 = new k1.c(cVar);
        Object obj4 = cVar2.c;
        Object obj22 = jd.a.a;
        i10 = cVar2.d;
        if (i10 != 0) {
        }
        pVar = new kotlin.jvm.internal.p();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th2 = (Throwable) pVar.a;
        if (th2 == null) {
        }
    }
}
