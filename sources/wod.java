// default package

import j$.util.DesugarCollections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class wod {
    public static final ypd a = new ypd();
    public static final zpd b = new zpd();

    public void a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) x1e.l(obj, j);
        if (list instanceof rod) {
            unmodifiableList = ((rod) list).g();
        } else if (ypd.c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        x1e.d(obj, j, unmodifiableList);
    }

    public abstract void b(xkd xkdVar, xkd xkdVar2, long j);
}
