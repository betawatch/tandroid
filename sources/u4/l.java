package u4;

import android.net.Uri;
import j$.util.DesugarCollections;
import j3.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class l extends m {
    public static final l n;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final n0 j;
    public final List k;
    public final Map l;
    public final List m;

    static {
        List list = Collections.EMPTY_LIST;
        n = new l("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public l(String str, List list, List list2, List list3, List list4, List list5, List list6, n0 n0Var, List list7, boolean z4, Map map, List list8) {
        super(str, list, z4);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Uri uri = ((k) list2.get(i10)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f = DesugarCollections.unmodifiableList(list3);
        this.g = DesugarCollections.unmodifiableList(list4);
        this.h = DesugarCollections.unmodifiableList(list5);
        this.i = DesugarCollections.unmodifiableList(list6);
        this.j = n0Var;
        this.k = list7 != null ? DesugarCollections.unmodifiableList(list7) : null;
        this.l = DesugarCollections.unmodifiableMap(map);
        this.m = DesugarCollections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((j) list.get(i10)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(int i10, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < list2.size()) {
                    n4.b bVar = (n4.b) list2.get(i12);
                    if (bVar.b == i10 && bVar.c == i11) {
                        arrayList.add(obj);
                        break;
                    }
                    i12++;
                }
            }
        }
        return arrayList;
    }

    @Override // n4.a
    public final Object a(List list) {
        ArrayList c3 = c(0, this.e, list);
        List list2 = Collections.EMPTY_LIST;
        return new l(this.a, this.b, c3, list2, c(1, this.g, list), c(2, this.h, list), list2, this.j, this.k, this.c, this.l, this.m);
    }
}
