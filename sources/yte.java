// default package

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class yte {
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

    public static m7a b(Set set, bg8 bg8Var) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof m7a)) {
                return new n7a(set2, bg8Var);
            }
            m7a m7aVar = (m7a) set2;
            bg8 bg8Var2 = m7aVar.b;
            bg8Var2.getClass();
            return new n7a((SortedSet) m7aVar.a, new cg8(Arrays.asList(bg8Var2, bg8Var)));
        }
        if (!(set instanceof m7a)) {
            set.getClass();
            return new m7a(set, bg8Var);
        }
        m7a m7aVar2 = (m7a) set;
        bg8 bg8Var3 = m7aVar2.b;
        bg8Var3.getClass();
        return new m7a(m7aVar2.a, new cg8(Arrays.asList(bg8Var3, bg8Var)));
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

    public static l7a d(ym5 ym5Var, ym5 ym5Var2) {
        gre.l(ym5Var, "set1");
        gre.l(ym5Var2, "set2");
        return new l7a(ym5Var, ym5Var2);
    }
}
