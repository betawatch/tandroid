package p4;

import android.net.Uri;
import h3.t0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class m extends n {
    public static final m n;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final t0 j;
    public final List k;
    public final Map l;
    public final List m;

    static {
        List list = Collections.EMPTY_LIST;
        n = new m("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public m(String str, List list, List list2, List list3, List list4, List list5, List list6, t0 t0Var, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list2.size(); i9++) {
            Uri uri = ((l) list2.get(i9)).a;
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
        this.j = t0Var;
        this.k = list7 != null ? DesugarCollections.unmodifiableList(list7) : null;
        this.l = DesugarCollections.unmodifiableMap(map);
        this.m = DesugarCollections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            Uri uri = ((k) list.get(i9)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(int i9, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < list2.size()) {
                    i4.b bVar = (i4.b) list2.get(i11);
                    if (bVar.b == i9 && bVar.c == i10) {
                        arrayList.add(obj);
                        break;
                    }
                    i11++;
                }
            }
        }
        return arrayList;
    }

    @Override // i4.a
    public final Object a(List list) {
        ArrayList c10 = c(0, this.e, list);
        List list2 = Collections.EMPTY_LIST;
        return new m(this.a, this.b, c10, list2, c(1, this.g, list), c(2, this.h, list), list2, this.j, this.k, this.c, this.l, this.m);
    }
}
