// default package

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class zhf {
    public static final vhf a = new vhf();
    public static final xhf b = new xhf();

    public void a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) hjf.g(obj, j);
        if (list instanceof thf) {
            unmodifiableList = ((thf) list).zzd();
        } else {
            if (vhf.c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof qif) && (list instanceof ehf)) {
                mff mffVar = (mff) ((ehf) list);
                boolean z = mffVar.a;
                if (z && z) {
                    mffVar.a = false;
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        hjf.i(obj, j, unmodifiableList);
    }

    public abstract void b(Object obj, long j, Object obj2);
}
