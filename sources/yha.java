// default package

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class yha extends eeb implements hs4 {
    public /* synthetic */ bia a;
    public /* synthetic */ lj7 b;

    @Override // hs4
    public final Object a(Object obj, Object obj2, Object obj3) {
        yha yhaVar = new yha(3, (px2) obj3);
        yhaVar.a = (bia) obj;
        yhaVar.b = (lj7) obj2;
        return yhaVar.invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        tue.b(obj);
        bia biaVar = this.a;
        lj7 lj7Var = this.b;
        Set keySet = lj7Var.a().keySet();
        ArrayList arrayList = new ArrayList(mm2.c(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((ni8) it.next()).a);
        }
        Map<String, ?> all = biaVar.a.getAll();
        all.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            LinkedHashSet linkedHashSet = biaVar.b;
            if (linkedHashSet != null ? linkedHashSet.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(sk6.b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = km2.m((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        lj7 lj7Var2 = new lj7(new LinkedHashMap(lj7Var.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                str.getClass();
                lj7Var2.d(new ni8(str), value2);
            } else if (value2 instanceof Float) {
                str.getClass();
                lj7Var2.d(new ni8(str), value2);
            } else if (value2 instanceof Integer) {
                str.getClass();
                lj7Var2.d(new ni8(str), value2);
            } else if (value2 instanceof Long) {
                str.getClass();
                lj7Var2.d(new ni8(str), value2);
            } else if (value2 instanceof String) {
                str.getClass();
                lj7Var2.d(new ni8(str), value2);
            } else if (value2 instanceof Set) {
                str.getClass();
                lj7Var2.d(new ni8(str), (Set) value2);
            }
        }
        return new lj7(new LinkedHashMap(lj7Var2.a()), true);
    }
}
