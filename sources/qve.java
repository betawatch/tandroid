// default package

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
