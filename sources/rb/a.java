package rb;

import java.lang.ref.Reference;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class a {
    public static void a(ArrayList arrayList, Object obj) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj2 = ((Reference) arrayList.get(size)).get();
            if (obj2 == null || obj2 == obj) {
                arrayList.remove(size);
                return;
            }
        }
    }
}
