// default package

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class qye {
    public static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static dba b(Set set, pj8 pj8Var) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof dba)) {
                return new eba(set2, pj8Var);
            }
            dba dbaVar = (dba) set2;
            pj8 pj8Var2 = dbaVar.b;
            pj8Var2.getClass();
            return new eba((SortedSet) dbaVar.a, new qj8(Arrays.asList(pj8Var2, pj8Var)));
        }
        if (!(set instanceof dba)) {
            set.getClass();
            return new dba(set, pj8Var);
        }
        dba dbaVar2 = (dba) set;
        pj8 pj8Var3 = dbaVar2.b;
        pj8Var3.getClass();
        return new dba(dbaVar2.a, new qj8(Arrays.asList(pj8Var3, pj8Var)));
    }

    public static int c(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static cba d(bp5 bp5Var, bp5 bp5Var2) {
        yve.l(bp5Var, "set1");
        yve.l(bp5Var2, "set2");
        return new cba(bp5Var, bp5Var2);
    }
}
