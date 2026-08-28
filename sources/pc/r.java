package pc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class r {
    public static int a(int i9) {
        return i9 < 0 ? i9 : i9 < 3 ? i9 + 1 : i9 < 1073741824 ? (int) ((i9 / 0.75f) + 1.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public static Map b(oc.d... dVarArr) {
        if (dVarArr.length <= 0) {
            return p.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a(dVarArr.length));
        c(linkedHashMap, dVarArr);
        return linkedHashMap;
    }

    public static final void c(LinkedHashMap linkedHashMap, oc.d[] dVarArr) {
        for (oc.d dVar : dVarArr) {
            linkedHashMap.put(dVar.a, dVar.b);
        }
    }

    public static Map d(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return p.a;
        }
        if (size == 1) {
            oc.d pair = (oc.d) arrayList.get(0);
            kotlin.jvm.internal.i.e(pair, "pair");
            Map singletonMap = Collections.singletonMap(pair.a, pair.b);
            kotlin.jvm.internal.i.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a(arrayList.size()));
        int size2 = arrayList.size();
        int i9 = 0;
        while (i9 < size2) {
            Object obj = arrayList.get(i9);
            i9++;
            oc.d dVar = (oc.d) obj;
            linkedHashMap.put(dVar.a, dVar.b);
        }
        return linkedHashMap;
    }
}
