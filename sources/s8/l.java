package s8;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import k7.y7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class l {
    public static int a(int i10) {
        if (i10 >= 3) {
            return i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        c(i10, "expectedSize");
        return i10 + 1;
    }

    public static void b(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i11);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static void c(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i10);
        throw new IllegalArgumentException(sb.toString());
    }

    public static boolean d(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean e(Set set, Object obj) {
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

    public static r0 f(Set set, r8.f fVar) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof r0)) {
                return new s0(set2, fVar);
            }
            r0 r0Var = (r0) set2;
            r8.f fVar2 = r0Var.b;
            fVar2.getClass();
            return new s0((SortedSet) r0Var.a, new r8.g(Arrays.asList(fVar2, fVar)));
        }
        if (!(set instanceof r0)) {
            set.getClass();
            return new r0(set, fVar);
        }
        r0 r0Var2 = (r0) set;
        r8.f fVar3 = r0Var2.b;
        fVar3.getClass();
        return new r0(r0Var2.a, new r8.g(Arrays.asList(fVar3, fVar)));
    }

    public static Object g(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object h(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return ai.j(1, list);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int i(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static q0 j(Set set, z zVar) {
        if (set == null) {
            throw new NullPointerException("set1");
        }
        if (zVar != null) {
            return new q0(set, zVar);
        }
        throw new NullPointerException("set2");
    }

    public static ArrayList k(Object... objArr) {
        int length = objArr.length;
        c(length, "arraySize");
        ArrayList arrayList = new ArrayList(y7.c(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static void l(List list, r8.f fVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (fVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    public static int m(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }
}
