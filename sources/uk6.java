// default package

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class uk6 {
    public static Object a(Map map, Object obj) {
        map.getClass();
        if (map instanceof mk6) {
            return ((mk6) map).a();
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

    public static Map c(rx7... rx7VarArr) {
        if (rx7VarArr.length <= 0) {
            return y24.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b(rx7VarArr.length));
        d(linkedHashMap, rx7VarArr);
        return linkedHashMap;
    }

    public static final void d(LinkedHashMap linkedHashMap, rx7[] rx7VarArr) {
        for (rx7 rx7Var : rx7VarArr) {
            linkedHashMap.put(rx7Var.a, rx7Var.b);
        }
    }

    public static Map e(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return y24.a;
        }
        int i = 0;
        if (size == 1) {
            rx7 rx7Var = (rx7) arrayList.get(0);
            rx7Var.getClass();
            Map singletonMap = Collections.singletonMap(rx7Var.a, rx7Var.b);
            singletonMap.getClass();
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            rx7 rx7Var2 = (rx7) obj;
            linkedHashMap.put(rx7Var2.a, rx7Var2.b);
        }
        return linkedHashMap;
    }
}
