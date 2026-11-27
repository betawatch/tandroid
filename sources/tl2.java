// default package

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class tl2 {
    public static List a(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static List b(Object... objArr) {
        if (objArr.length <= 0) {
            return x24.a;
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }
}
