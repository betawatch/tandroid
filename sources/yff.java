// default package

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class yff {
    public static final uff a = new uff();
    public static final wff b = new wff();

    public void a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) ghf.g(obj, j);
        if (list instanceof sff) {
            unmodifiableList = ((sff) list).zzd();
        } else {
            if (uff.c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof pgf) && (list instanceof dff)) {
                ldf ldfVar = (ldf) ((dff) list);
                boolean z = ldfVar.a;
                if (z && z) {
                    ldfVar.a = false;
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        ghf.i(obj, j, unmodifiableList);
    }

    public abstract void b(Object obj, long j, Object obj2);
}
