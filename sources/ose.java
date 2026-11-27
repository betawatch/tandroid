// default package

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
