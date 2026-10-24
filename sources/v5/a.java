package v5;

import android.util.SparseArray;
import i2.o1;
import i5.d;
import java.util.HashMap;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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

    public static d b(int i10) {
        d dVar = (d) a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(o1.k(i10, "Unknown Priority for value "));
    }
}
