// default package

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class xfe {
    public static void a(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            fq2 fq2Var = (fq2) obj;
            r53 r53Var = new r53(fq2Var);
            for (h09 h09Var : fq2Var.b) {
                boolean z = fq2Var.e;
                s53 s53Var = new s53(h09Var, z);
                if (!hashMap.containsKey(s53Var)) {
                    hashMap.put(s53Var, new HashSet());
                }
                Set set = (Set) hashMap.get(s53Var);
                if (!set.isEmpty() && !z) {
                    throw new IllegalArgumentException("Multiple components provide " + h09Var + ".");
                }
                set.add(r53Var);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (r53 r53Var2 : (Set) it.next()) {
                for (qe3 qe3Var : r53Var2.a.c) {
                    if (qe3Var.c == 0) {
                        Set<r53> set2 = (Set) hashMap.get(new s53(qe3Var.a, qe3Var.b == 2));
                        if (set2 != null) {
                            for (r53 r53Var3 : set2) {
                                r53Var2.b.add(r53Var3);
                                r53Var3.c.add(r53Var2);
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
            r53 r53Var4 = (r53) it3.next();
            if (r53Var4.c.isEmpty()) {
                hashSet2.add(r53Var4);
            }
        }
        while (!hashSet2.isEmpty()) {
            r53 r53Var5 = (r53) hashSet2.iterator().next();
            hashSet2.remove(r53Var5);
            i++;
            Iterator it4 = r53Var5.b.iterator();
            while (it4.hasNext()) {
                r53 r53Var6 = (r53) it4.next();
                r53Var6.c.remove(r53Var5);
                if (r53Var6.c.isEmpty()) {
                    hashSet2.add(r53Var6);
                }
            }
        }
        if (i == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            r53 r53Var7 = (r53) it5.next();
            if (!r53Var7.c.isEmpty() && !r53Var7.b.isEmpty()) {
                arrayList2.add(r53Var7.a);
            }
        }
        throw new re3("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
