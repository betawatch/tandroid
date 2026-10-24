package w7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class z6 {
    public static void a(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            r9.a aVar = (r9.a) obj;
            r9.h hVar = new r9.h(aVar);
            for (r9.r rVar : aVar.b) {
                boolean z10 = aVar.e == 0;
                r9.i iVar = new r9.i(rVar, !z10);
                if (!hashMap.containsKey(iVar)) {
                    hashMap.put(iVar, new HashSet());
                }
                Set set = (Set) hashMap.get(iVar);
                if (!set.isEmpty() && z10) {
                    throw new IllegalArgumentException("Multiple components provide " + rVar + ".");
                }
                set.add(hVar);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (r9.h hVar2 : (Set) it.next()) {
                for (r9.j jVar : hVar2.a.c) {
                    if (jVar.c == 0) {
                        Set<r9.h> set2 = (Set) hashMap.get(new r9.i(jVar.a, jVar.b == 2));
                        if (set2 != null) {
                            for (r9.h hVar3 : set2) {
                                hVar2.b.add(hVar3);
                                hVar3.c.add(hVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            r9.h hVar4 = (r9.h) it3.next();
            if (hVar4.c.isEmpty()) {
                hashSet2.add(hVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            r9.h hVar5 = (r9.h) hashSet2.iterator().next();
            hashSet2.remove(hVar5);
            i10++;
            Iterator it4 = hVar5.b.iterator();
            while (it4.hasNext()) {
                r9.h hVar6 = (r9.h) it4.next();
                hVar6.c.remove(hVar5);
                if (hVar6.c.isEmpty()) {
                    hashSet2.add(hVar6);
                }
            }
        }
        if (i10 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            r9.h hVar7 = (r9.h) it5.next();
            if (!hVar7.c.isEmpty() && !hVar7.b.isEmpty()) {
                arrayList2.add(hVar7.a);
            }
        }
        throw new r9.k("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
