package p1;

import c8.qb;
import gd.k;
import hd.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import rd.q;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class i extends kd.j implements q {
    public /* synthetic */ o1.f a;
    public /* synthetic */ q1.b b;

    @Override // rd.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        i iVar = new i(3, (id.c) obj3);
        iVar.a = (o1.f) obj;
        iVar.b = (q1.b) obj2;
        return iVar.invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        af.b.c(obj);
        o1.f fVar = this.a;
        q1.b bVar = this.b;
        Set keySet = bVar.a().keySet();
        ArrayList arrayList = new ArrayList(hd.h.d(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((q1.e) it.next()).a);
        }
        Map<String, ?> all = fVar.a.getAll();
        kotlin.jvm.internal.j.d(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            Set set = fVar.b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(r.b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = hd.f.o((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        q1.b bVar2 = new q1.b(new LinkedHashMap(bVar.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String name = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                kotlin.jvm.internal.j.e(name, "name");
                bVar2.e(new q1.e(name), value2);
            } else if (value2 instanceof Float) {
                kotlin.jvm.internal.j.e(name, "name");
                bVar2.e(new q1.e(name), value2);
            } else if (value2 instanceof Integer) {
                kotlin.jvm.internal.j.e(name, "name");
                bVar2.e(new q1.e(name), value2);
            } else if (value2 instanceof Long) {
                kotlin.jvm.internal.j.e(name, "name");
                bVar2.e(new q1.e(name), value2);
            } else if (value2 instanceof String) {
                bVar2.e(qb.a(name), value2);
            } else if (value2 instanceof Set) {
                bVar2.e(qb.b(name), (Set) value2);
            }
        }
        return new q1.b(new LinkedHashMap(bVar2.a()), true);
    }
}
