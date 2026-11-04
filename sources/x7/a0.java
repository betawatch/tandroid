package x7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class a0 {
    public static void a(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            t9.a aVar = (t9.a) obj;
            t9.h hVar = new t9.h(aVar);
            for (t9.r rVar : aVar.b) {
                boolean z10 = aVar.e == 0;
                t9.i iVar = new t9.i(rVar, !z10);
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
            for (t9.h hVar2 : (Set) it.next()) {
                for (t9.j jVar : hVar2.a.c) {
                    if (jVar.c == 0) {
                        Set<t9.h> set2 = (Set) hashMap.get(new t9.i(jVar.a, jVar.b == 2));
                        if (set2 != null) {
                            for (t9.h hVar3 : set2) {
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
            t9.h hVar4 = (t9.h) it3.next();
            if (hVar4.c.isEmpty()) {
                hashSet2.add(hVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            t9.h hVar5 = (t9.h) hashSet2.iterator().next();
            hashSet2.remove(hVar5);
            i3++;
            Iterator it4 = hVar5.b.iterator();
            while (it4.hasNext()) {
                t9.h hVar6 = (t9.h) it4.next();
                hVar6.c.remove(hVar5);
                if (hVar6.c.isEmpty()) {
                    hashSet2.add(hVar6);
                }
            }
        }
        if (i3 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            t9.h hVar7 = (t9.h) it5.next();
            if (!hVar7.c.isEmpty() && !hVar7.b.isEmpty()) {
                arrayList2.add(hVar7.a);
            }
        }
        throw new t9.k("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
