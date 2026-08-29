package q8;

import i7.o6;
import i7.p7;
import j7.l1;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class l {
    public static void a(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static Object b(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            return i10 <= 256 ? new byte[i10] : i10 <= 65536 ? new short[i10] : new int[i10];
        }
        StringBuilder sb2 = new StringBuilder(52);
        sb2.append("must be power of 2 between 2^1 and 2^30: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static boolean c(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean d(Set set, Object obj) {
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

    public static u0 e(Set set, p8.f fVar) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof u0)) {
                return new v0(set2, fVar);
            }
            u0 u0Var = (u0) set2;
            p8.f fVar2 = u0Var.b;
            fVar2.getClass();
            return new v0((SortedSet) u0Var.a, new p8.g(Arrays.asList(fVar2, fVar)));
        }
        if (!(set instanceof u0)) {
            set.getClass();
            return new u0(set, fVar);
        }
        u0 u0Var2 = (u0) set;
        p8.f fVar3 = u0Var2.b;
        fVar3.getClass();
        return new u0(u0Var2.a, new p8.g(Arrays.asList(fVar3, fVar)));
    }

    public static Object f(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object g(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return l1.j(1, list);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int h(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static t0 i(Set set, c0 c0Var) {
        if (set == null) {
            throw new NullPointerException("set1");
        }
        if (c0Var != null) {
            return new t0(set, c0Var);
        }
        throw new NullPointerException("set2");
    }

    public static int j(int i10, int i11, int i12) {
        return (i10 & (~i12)) | (i11 & i12);
    }

    public static ArrayList k(Object... objArr) {
        int length = objArr.length;
        a(length, "arraySize");
        ArrayList arrayList = new ArrayList(p7.d(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static HashSet l(int i10) {
        int i11;
        if (i10 < 3) {
            a(i10, "expectedSize");
            i11 = i10 + 1;
        } else {
            i11 = i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        return new HashSet(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r5 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        r(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r13[r5] = j(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int p10 = p(obj);
        int i11 = p10 & i10;
        int q6 = q(i11, obj3);
        if (q6 != 0) {
            int i12 = ~i10;
            int i13 = p10 & i12;
            int i14 = -1;
            while (true) {
                int i15 = q6 - 1;
                int i16 = iArr[i15];
                if ((i16 & i12) != i13 || !o6.a(obj, objArr[i15]) || (objArr2 != null && !o6.a(obj2, objArr2[i15]))) {
                    int i17 = i16 & i10;
                    if (i17 == 0) {
                        break;
                    }
                    i14 = i15;
                    q6 = i17;
                }
            }
        }
        return -1;
    }

    public static void n(List list, p8.f fVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (fVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    public static int o(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    public static int p(Object obj) {
        return o(obj == null ? 0 : obj.hashCode());
    }

    public static int q(int i10, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i10] & 255 : obj instanceof short[] ? ((short[]) obj)[i10] & 65535 : ((int[]) obj)[i10];
    }

    public static void r(int i10, int i11, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }
}
