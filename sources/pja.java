// default package

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class pja extends yfb implements ks4 {
    public /* synthetic */ sja a;
    public /* synthetic */ rj7 b;

    @Override // ks4
    public final Object a(Object obj, Object obj2, Object obj3) {
        pja pjaVar = new pja(3, (zw2) obj3);
        pjaVar.a = (sja) obj;
        pjaVar.b = (rj7) obj2;
        return pjaVar.invokeSuspend(f9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        ixe.b(obj);
        sja sjaVar = this.a;
        rj7 rj7Var = this.b;
        Set keySet = rj7Var.a().keySet();
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
        rj7 rj7Var2 = new rj7(new LinkedHashMap(rj7Var.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                str.getClass();
                rj7Var2.d(new zj8(str), value2);
            } else if (value2 instanceof Float) {
                str.getClass();
                rj7Var2.d(new zj8(str), value2);
            } else if (value2 instanceof Integer) {
                str.getClass();
                rj7Var2.d(new zj8(str), value2);
            } else if (value2 instanceof Long) {
                str.getClass();
                rj7Var2.d(new zj8(str), value2);
            } else if (value2 instanceof String) {
                str.getClass();
                rj7Var2.d(new zj8(str), value2);
            } else if (value2 instanceof Set) {
                str.getClass();
                rj7Var2.d(new zj8(str), (Set) value2);
            }
        }
        return new rj7(new LinkedHashMap(rj7Var2.a()), true);
    }
}
