// default package

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class ose {
    public static ArrayList a(Object... objArr) {
        int length = objArr.length;
        awd.b(length, "arraySize");
        ArrayList arrayList = new ArrayList(ype.d(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static AbstractList b(List list, es4 es4Var) {
        return list instanceof RandomAccess ? new g86(list, es4Var) : new h86(list, es4Var);
    }
}
