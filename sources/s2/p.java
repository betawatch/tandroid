package s2;

import android.net.Uri;
import e2.f1;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class p extends q {
    public static final p n;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final e2.u j;
    public final List k;
    public final Map l;
    public final List m;

    static {
        List list = Collections.EMPTY_LIST;
        n = new p("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public p(String str, List list, List list2, List list3, List list4, List list5, List list6, e2.u uVar, List list7, boolean z9, Map map, List list8) {
        super(str, list, z9);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list2.size(); i7++) {
            Uri uri = ((o) list2.get(i7)).a;
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
        this.j = uVar;
        this.k = list7 != null ? DesugarCollections.unmodifiableList(list7) : null;
        this.l = DesugarCollections.unmodifiableMap(map);
        this.m = DesugarCollections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            Uri uri = ((n) list.get(i7)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(int i7, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < list2.size()) {
                    f1 f1Var = (f1) list2.get(i11);
                    if (f1Var.b == i7 && f1Var.c == i10) {
                        arrayList.add(obj);
                        break;
                    }
                    i11++;
                }
            }
        }
        return arrayList;
    }

    @Override // w2.a
    public final Object a(List list) {
        ArrayList c10 = c(0, this.e, list);
        List list2 = Collections.EMPTY_LIST;
        return new p(this.a, this.b, c10, list2, c(1, this.g, list), c(2, this.h, list), list2, this.j, this.k, this.c, this.l, this.m);
    }
}
