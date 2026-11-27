// default package

import android.util.SparseArray;
import java.util.HashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class qm8 {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(pm8.a, 0);
        hashMap.put(pm8.b, 1);
        hashMap.put(pm8.c, 2);
        for (pm8 pm8Var : hashMap.keySet()) {
            a.append(((Integer) b.get(pm8Var)).intValue(), pm8Var);
        }
    }

    public static int a(pm8 pm8Var) {
        Integer num = (Integer) b.get(pm8Var);
        if (num != null) {
            return num.intValue();
        }
        xi4.k(pm8Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static pm8 b(int i) {
        pm8 pm8Var = (pm8) a.get(i);
        if (pm8Var != null) {
            return pm8Var;
        }
        lq5.j(uh9.k(i, "Unknown Priority for value "));
        return null;
    }
}
