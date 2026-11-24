// default package

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
