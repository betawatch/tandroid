// default package

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class qi6 {
    public static Object a(Map map, Object obj) {
        map.getClass();
        if (map instanceof ii6) {
            return ((ii6) map).a();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int b(int i) {
        return i < 0 ? i : i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public static Map c(ku7... ku7VarArr) {
        if (ku7VarArr.length <= 0) {
            return d24.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b(ku7VarArr.length));
        d(linkedHashMap, ku7VarArr);
        return linkedHashMap;
    }

    public static final void d(LinkedHashMap linkedHashMap, ku7[] ku7VarArr) {
        for (ku7 ku7Var : ku7VarArr) {
            linkedHashMap.put(ku7Var.a, ku7Var.b);
        }
    }

    public static Map e(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return d24.a;
        }
        int i = 0;
        if (size == 1) {
            ku7 ku7Var = (ku7) arrayList.get(0);
            ku7Var.getClass();
            Map singletonMap = Collections.singletonMap(ku7Var.a, ku7Var.b);
            singletonMap.getClass();
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            ku7 ku7Var2 = (ku7) obj;
            linkedHashMap.put(ku7Var2.a, ku7Var2.b);
        }
        return linkedHashMap;
    }
}
