package tc;

import j7.r8;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import k7.s7;
import kf.k0;

/* loaded from: classes.dex */
public abstract class g extends m {
    public static ArrayList f(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void g(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, dd.l lVar) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        sb.append(charSequence2);
        int i10 = 0;
        for (Object obj : iterable) {
            i10++;
            if (i10 > 1) {
                sb.append(charSequence);
            }
            r8.a(sb, obj, lVar);
        }
        sb.append(charSequence3);
    }

    public static String h(Iterable iterable, String str, String str2, String str3, dd.l lVar, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i10 & 2) != 0 ? "" : str2;
        String str6 = (i10 & 4) != 0 ? "" : str3;
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        kotlin.jvm.internal.j.e(iterable, "<this>");
        StringBuilder sb = new StringBuilder();
        g(iterable, sb, str4, str5, str6, "...", lVar);
        return sb.toString();
    }

    public static List i(Iterable iterable, int i10) {
        Object next;
        kotlin.jvm.internal.j.e(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(k0.k(i10, "Requested element count ", " is less than zero.").toString());
        }
        o oVar = o.a;
        if (i10 == 0) {
            return oVar;
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return m(iterable);
            }
            if (i10 == 1) {
                if (iterable instanceof List) {
                    List list = (List) iterable;
                    if (list.isEmpty()) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    next = list.get(0);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                    next = it.next();
                }
                return s7.a(next);
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator it2 = iterable.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            arrayList.add(it2.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : s7.a(arrayList.get(0)) : oVar;
    }

    public static byte[] j(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            bArr[i10] = ((Number) obj).byteValue();
            i10++;
        }
        return bArr;
    }

    public static final void k(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] l(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            iArr[i10] = ((Number) obj).intValue();
            i10++;
        }
        return iArr;
    }

    public static List m(Iterable iterable) {
        ArrayList arrayList;
        kotlin.jvm.internal.j.e(iterable, "<this>");
        boolean z4 = iterable instanceof Collection;
        o oVar = o.a;
        if (z4) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return oVar;
            }
            if (size != 1) {
                return o(collection);
            }
            return s7.a(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        if (z4) {
            arrayList = o((Collection) iterable);
        } else {
            ArrayList arrayList2 = new ArrayList();
            k(iterable, arrayList2);
            arrayList = arrayList2;
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : s7.a(arrayList.get(0)) : oVar;
    }

    public static long[] n(Collection collection) {
        kotlin.jvm.internal.j.e(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = ((Number) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public static ArrayList o(Collection collection) {
        kotlin.jvm.internal.j.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set p(Iterable iterable) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(r.a(collection.size()));
                    k(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set singleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                kotlin.jvm.internal.j.d(singleton, "singleton(...)");
                return singleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            k(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                kotlin.jvm.internal.j.d(singleton2, "singleton(...)");
                return singleton2;
            }
        }
        return q.a;
    }
}
