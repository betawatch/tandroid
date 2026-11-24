// default package

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vhf extends zhf {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zhf
    public final void b(Object obj, long j, Object obj2) {
        ArrayList arrayList;
        List list = (List) hjf.g(obj2, j);
        int size = list.size();
        List list2 = (List) hjf.g(obj, j);
        if (list2.isEmpty()) {
            list2 = list2 instanceof thf ? new rhf(size) : ((list2 instanceof qif) && (list2 instanceof ehf)) ? ((ehf) list2).zzg(size) : new ArrayList(size);
            hjf.i(obj, j, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList2 = new ArrayList(list2.size() + size);
                arrayList2.addAll(list2);
                hjf.i(obj, j, arrayList2);
                arrayList = arrayList2;
            } else if (list2 instanceof fjf) {
                fjf fjfVar = (fjf) list2;
                rhf rhfVar = new rhf(fjfVar.size() + size);
                rhfVar.addAll(rhfVar.b.size(), fjfVar);
                hjf.i(obj, j, rhfVar);
                arrayList = rhfVar;
            } else if ((list2 instanceof qif) && (list2 instanceof ehf)) {
                ehf ehfVar = (ehf) list2;
                if (!((mff) ehfVar).a) {
                    list2 = ehfVar.zzg(list2.size() + size);
                    hjf.i(obj, j, list2);
                }
            }
            list2 = arrayList;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        hjf.i(obj, j, list);
    }
}
