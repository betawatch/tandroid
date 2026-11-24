// default package

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
