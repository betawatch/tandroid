// default package

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class vnd extends tmd {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tmd
    public final void b(vid vidVar, vid vidVar2, long j) {
        ArrayList arrayList;
        List list = (List) uzd.l(vidVar2, j);
        int size = list.size();
        List list2 = (List) uzd.l(vidVar, j);
        if (list2.isEmpty()) {
            list2 = list2 instanceof omd ? new cmd(size) : new ArrayList(size);
            uzd.d(vidVar, j, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList2 = new ArrayList(list2.size() + size);
                arrayList2.addAll(list2);
                arrayList = arrayList2;
            } else if (list2 instanceof ezd) {
                ezd ezdVar = (ezd) list2;
                cmd cmdVar = new cmd(ezdVar.a.size() + size);
                cmdVar.addAll(ezdVar);
                arrayList = cmdVar;
            }
            uzd.d(vidVar, j, arrayList);
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
        uzd.d(vidVar, j, list);
    }
}
