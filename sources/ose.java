// default package

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
