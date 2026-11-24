// default package

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class zqe {
    public static final jre a = new jre();
    public static final xre b = new xre();

    public abstract void a(nne nneVar, nne nneVar2, long j);

    public void b(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) i0f.l(obj, j);
        if (list instanceof ere) {
            unmodifiableList = ((ere) list).zze();
        } else {
            if (jre.c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof yve) && (list instanceof kpe)) {
                kpe kpeVar = (kpe) list;
                if (kpeVar.zza()) {
                    kpeVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        i0f.d(obj, j, unmodifiableList);
    }
}
