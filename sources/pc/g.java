package pc;

import f7.m7;
import g7.o6;
import j3.r0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

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

    public static final void g(Iterable iterable, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, zc.l lVar) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        sb2.append(charSequence2);
        int i9 = 0;
        for (Object obj : iterable) {
            i9++;
            if (i9 > 1) {
                sb2.append(charSequence);
            }
            m7.a(sb2, obj, lVar);
        }
        sb2.append(charSequence3);
    }

    public static String h(Iterable iterable, String str, String str2, String str3, zc.l lVar, int i9) {
        if ((i9 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i9 & 2) != 0 ? "" : str2;
        String str6 = (i9 & 4) != 0 ? "" : str3;
        if ((i9 & 32) != 0) {
            lVar = null;
        }
        kotlin.jvm.internal.i.e(iterable, "<this>");
        StringBuilder sb2 = new StringBuilder();
        g(iterable, sb2, str4, str5, str6, "...", lVar);
        return sb2.toString();
    }

    public static List i(Iterable iterable, int i9) {
        Object next;
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if (i9 < 0) {
            throw new IllegalArgumentException(r0.m(i9, "Requested element count ", " is less than zero.").toString());
        }
        o oVar = o.a;
        if (i9 == 0) {
            return oVar;
        }
        if (iterable instanceof Collection) {
            if (i9 >= ((Collection) iterable).size()) {
                return m(iterable);
            }
            if (i9 == 1) {
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
                return o6.a(next);
            }
        }
        ArrayList arrayList = new ArrayList(i9);
        Iterator it2 = iterable.iterator();
        int i10 = 0;
        while (it2.hasNext()) {
            arrayList.add(it2.next());
            i10++;
            if (i10 == i9) {
                break;
            }
        }
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : o6.a(arrayList.get(0)) : oVar;
    }

    public static byte[] j(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            bArr[i9] = ((Number) obj).byteValue();
            i9++;
        }
        return bArr;
    }

    public static final void k(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] l(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            iArr[i9] = ((Number) obj).intValue();
            i9++;
        }
        return iArr;
    }

    public static List m(Iterable iterable) {
        ArrayList arrayList;
        kotlin.jvm.internal.i.e(iterable, "<this>");
        boolean z10 = iterable instanceof Collection;
        o oVar = o.a;
        if (z10) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return oVar;
            }
            if (size != 1) {
                return o(collection);
            }
            return o6.a(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        if (z10) {
            arrayList = o((Collection) iterable);
        } else {
            ArrayList arrayList2 = new ArrayList();
            k(iterable, arrayList2);
            arrayList = arrayList2;
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : o6.a(arrayList.get(0)) : oVar;
    }

    public static long[] n(Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            jArr[i9] = ((Number) it.next()).longValue();
            i9++;
        }
        return jArr;
    }

    public static ArrayList o(Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set p(Iterable iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
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
                kotlin.jvm.internal.i.d(singleton, "singleton(...)");
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
                kotlin.jvm.internal.i.d(singleton2, "singleton(...)");
                return singleton2;
            }
        }
        return q.a;
    }
}
