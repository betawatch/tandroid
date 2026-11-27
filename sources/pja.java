// default package

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class pja extends yfb implements ks4 {
    public /* synthetic */ sja a;
    public /* synthetic */ sj7 b;

    @Override // ks4
    public final Object a(Object obj, Object obj2, Object obj3) {
        pja pjaVar = new pja(3, (zw2) obj3);
        pjaVar.a = (sja) obj;
        pjaVar.b = (sj7) obj2;
        return pjaVar.invokeSuspend(g9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        ixe.b(obj);
        sja sjaVar = this.a;
        sj7 sj7Var = this.b;
        Set keySet = sj7Var.a().keySet();
        ArrayList arrayList = new ArrayList(ul2.c(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((zj8) it.next()).a);
        }
        Map<String, ?> all = sjaVar.a.getAll();
        all.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            LinkedHashSet linkedHashSet = sjaVar.b;
            if (linkedHashSet != null ? linkedHashSet.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(uk6.b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = sl2.m((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        sj7 sj7Var2 = new sj7(new LinkedHashMap(sj7Var.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                str.getClass();
                sj7Var2.d(new zj8(str), value2);
            } else if (value2 instanceof Float) {
                str.getClass();
                sj7Var2.d(new zj8(str), value2);
            } else if (value2 instanceof Integer) {
                str.getClass();
                sj7Var2.d(new zj8(str), value2);
            } else if (value2 instanceof Long) {
                str.getClass();
                sj7Var2.d(new zj8(str), value2);
            } else if (value2 instanceof String) {
                str.getClass();
                sj7Var2.d(new zj8(str), value2);
            } else if (value2 instanceof Set) {
                str.getClass();
                sj7Var2.d(new zj8(str), (Set) value2);
            }
        }
        return new sj7(new LinkedHashMap(sj7Var2.a()), true);
    }
}
