// default package

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class qve {
    public static final awe a = new awe();
    public static final owe b = new owe();

    public abstract void a(ese eseVar, ese eseVar2, long j);

    public void b(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) a5f.l(obj, j);
        if (list instanceof vve) {
            unmodifiableList = ((vve) list).zze();
        } else {
            if (awe.c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof p0f) && (list instanceof bue)) {
                bue bueVar = (bue) list;
                if (bueVar.zza()) {
                    bueVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        a5f.d(j, obj, unmodifiableList);
    }
}
