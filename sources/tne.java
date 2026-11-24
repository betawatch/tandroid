// default package

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class tne {
    public static ArrayList a(Object... objArr) {
        int length = objArr.length;
        krd.b(length, "arraySize");
        ArrayList arrayList = new ArrayList(gle.d(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static AbstractList b(List list, aq4 aq4Var) {
        return list instanceof RandomAccess ? new c66(list, aq4Var) : new d66(list, aq4Var);
    }
}
