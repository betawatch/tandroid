// default package

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
