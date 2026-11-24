// default package

import j$.util.DesugarCollections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class tmd {
    public static final vnd a = new vnd();
    public static final wnd b = new wnd();

    public void a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) uzd.l(obj, j);
        if (list instanceof omd) {
            unmodifiableList = ((omd) list).g();
        } else if (vnd.c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        uzd.d(obj, j, unmodifiableList);
    }

    public abstract void b(vid vidVar, vid vidVar2, long j);
}
