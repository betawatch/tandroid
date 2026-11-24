// default package

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class uff extends yff {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yff
    public final void b(Object obj, long j, Object obj2) {
        ArrayList arrayList;
        List list = (List) ghf.g(obj2, j);
        int size = list.size();
        List list2 = (List) ghf.g(obj, j);
        if (list2.isEmpty()) {
            list2 = list2 instanceof sff ? new qff(size) : ((list2 instanceof pgf) && (list2 instanceof dff)) ? ((dff) list2).zzg(size) : new ArrayList(size);
            ghf.i(obj, j, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList2 = new ArrayList(list2.size() + size);
                arrayList2.addAll(list2);
                ghf.i(obj, j, arrayList2);
                arrayList = arrayList2;
            } else if (list2 instanceof ehf) {
                ehf ehfVar = (ehf) list2;
                qff qffVar = new qff(ehfVar.size() + size);
                qffVar.addAll(qffVar.b.size(), ehfVar);
                ghf.i(obj, j, qffVar);
                arrayList = qffVar;
            } else if ((list2 instanceof pgf) && (list2 instanceof dff)) {
                dff dffVar = (dff) list2;
                if (!((ldf) dffVar).a) {
                    list2 = dffVar.zzg(list2.size() + size);
                    ghf.i(obj, j, list2);
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
        ghf.i(obj, j, list);
    }
}
