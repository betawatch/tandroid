// default package

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class sk6 {
    public static Object a(Map map, Object obj) {
        map.getClass();
        if (map instanceof kk6) {
            return ((kk6) map).a();
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

    public static Map c(lw7... lw7VarArr) {
        if (lw7VarArr.length <= 0) {
            return o34.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b(lw7VarArr.length));
        d(linkedHashMap, lw7VarArr);
        return linkedHashMap;
    }

    public static final void d(LinkedHashMap linkedHashMap, lw7[] lw7VarArr) {
        for (lw7 lw7Var : lw7VarArr) {
            linkedHashMap.put(lw7Var.a, lw7Var.b);
        }
    }

    public static Map e(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return o34.a;
        }
        int i = 0;
        if (size == 1) {
            lw7 lw7Var = (lw7) arrayList.get(0);
            lw7Var.getClass();
            Map singletonMap = Collections.singletonMap(lw7Var.a, lw7Var.b);
            singletonMap.getClass();
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            lw7 lw7Var2 = (lw7) obj;
            linkedHashMap.put(lw7Var2.a, lw7Var2.b);
        }
        return linkedHashMap;
    }
}
