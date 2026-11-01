package v7;

import java.lang.ref.Reference;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class b9 {
    public static t7.r a;

    public static void a(ArrayList arrayList, Object obj) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj2 = ((Reference) arrayList.get(size)).get();
            if (obj2 == null || obj2 == obj) {
                arrayList.remove(size);
                return;
            }
        }
    }

    public static synchronized x8 b(u8 u8Var) {
        x8 x8Var;
        synchronized (b9.class) {
            try {
                if (a == null) {
                    a = new t7.r(1);
                }
                x8Var = (x8) a.R0(u8Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return x8Var;
    }
}
