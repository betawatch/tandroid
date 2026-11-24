// default package

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class wfa extends ccb implements gq4 {
    public /* synthetic */ zfa a;
    public /* synthetic */ ih7 b;

    @Override // gq4
    public final Object a(Object obj, Object obj2, Object obj3) {
        wfa wfaVar = new wfa(3, (fw2) obj3);
        wfaVar.a = (zfa) obj;
        wfaVar.b = (ih7) obj2;
        return wfaVar.invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        qse.b(obj);
        zfa zfaVar = this.a;
        ih7 ih7Var = this.b;
        Set keySet = ih7Var.a().keySet();
        ArrayList arrayList = new ArrayList(al2.c(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((lg8) it.next()).a);
        }
        Map<String, ?> all = zfaVar.a.getAll();
        all.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            LinkedHashSet linkedHashSet = zfaVar.b;
            if (linkedHashSet != null ? linkedHashSet.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(qi6.b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = yk2.m((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        ih7 ih7Var2 = new ih7(new LinkedHashMap(ih7Var.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                str.getClass();
                ih7Var2.d(new lg8(str), value2);
            } else if (value2 instanceof Float) {
                str.getClass();
                ih7Var2.d(new lg8(str), value2);
            } else if (value2 instanceof Integer) {
                str.getClass();
                ih7Var2.d(new lg8(str), value2);
            } else if (value2 instanceof Long) {
                str.getClass();
                ih7Var2.d(new lg8(str), value2);
            } else if (value2 instanceof String) {
                str.getClass();
                ih7Var2.d(new lg8(str), value2);
            } else if (value2 instanceof Set) {
                str.getClass();
                ih7Var2.d(new lg8(str), (Set) value2);
            }
        }
        return new ih7(new LinkedHashMap(ih7Var2.a()), true);
    }
}
