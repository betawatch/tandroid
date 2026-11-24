// default package

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class wpe {
    public static ArrayList a(Object... objArr) {
        int length = objArr.length;
        ntd.b(length, "arraySize");
        ArrayList arrayList = new ArrayList(ine.d(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static AbstractList b(List list, bs4 bs4Var) {
        return list instanceof RandomAccess ? new c86(list, bs4Var) : new d86(list, bs4Var);
    }
}
