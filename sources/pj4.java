// default package

import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pj4 {
    public static final pj4 a = new pj4();
    public static final Map b = DesugarCollections.synchronizedMap(new LinkedHashMap());

    public static nj4 a(s8a s8aVar) {
        Map map = b;
        map.getClass();
        Object obj = map.get(s8aVar);
        if (obj != null) {
            return (nj4) obj;
        }
        zo4.i(s8aVar, ". Dependencies should be added at class load time.", "Cannot get dependency ");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0092 -> B:10:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(px2 px2Var) {
        oj4 oj4Var;
        int i;
        Iterator it;
        LinkedHashMap linkedHashMap;
        if (px2Var instanceof oj4) {
            oj4Var = (oj4) px2Var;
            int i2 = oj4Var.n;
            if ((i2 & TLObject.FLAG_31) != 0) {
                oj4Var.n = i2 - TLObject.FLAG_31;
                Object obj = oj4Var.f;
                i = oj4Var.n;
                px2 px2Var2 = null;
                byte b2 = 1;
                if (i != 0) {
                    tue.b(obj);
                    Map map = b;
                    map.getClass();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(sk6.b(map.size()));
                    it = map.entrySet().iterator();
                    linkedHashMap = linkedHashMap2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object key = oj4Var.e;
                    linkedHashMap = oj4Var.d;
                    s8a s8aVar = oj4Var.c;
                    it = oj4Var.b;
                    LinkedHashMap linkedHashMap3 = oj4Var.a;
                    tue.b(obj);
                    s8aVar.getClass();
                    jz2 jz2Var = a(s8aVar).b;
                    if (jz2Var == null) {
                        linkedHashMap.put(key, jz2Var);
                        linkedHashMap = linkedHashMap3;
                        if (it.hasNext()) {
                            return linkedHashMap;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        key = entry.getKey();
                        s8aVar = (s8a) entry.getKey();
                        yq2 yq2Var = new yq2((nj4) entry.getValue(), (byte) 1);
                        oj4Var.a = linkedHashMap;
                        oj4Var.b = it;
                        oj4Var.c = s8aVar;
                        oj4Var.d = linkedHashMap;
                        oj4Var.e = key;
                        oj4Var.n = 1;
                        Object c = srd.c(k34.a, new p83(yq2Var, px2Var2, b2), oj4Var);
                        ly2 ly2Var = ly2.a;
                        if (c == ly2Var) {
                            return ly2Var;
                        }
                        linkedHashMap3 = linkedHashMap;
                        s8aVar.getClass();
                        jz2 jz2Var2 = a(s8aVar).b;
                        if (jz2Var2 == null) {
                            zo4.i(s8aVar, " has not been registered.", "Subscriber ");
                            return null;
                        }
                    }
                }
            }
        }
        oj4Var = new oj4(this, px2Var);
        Object obj2 = oj4Var.f;
        i = oj4Var.n;
        px2 px2Var22 = null;
        byte b22 = 1;
        if (i != 0) {
        }
    }
}
