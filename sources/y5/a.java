package y5;

import android.util.SparseArray;
import i5.c;
import java.util.HashMap;
import l5.d;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class a {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(d.a, 0);
        hashMap.put(d.b, 1);
        hashMap.put(d.c, 2);
        for (d dVar : hashMap.keySet()) {
            a.append(((Integer) b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i7) {
        d dVar = (d) a.get(i7);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(c.i(i7, "Unknown Priority for value "));
    }
}
