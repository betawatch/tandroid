// default package

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class zk2 {
    public static List a(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static List b(Object... objArr) {
        if (objArr.length <= 0) {
            return c24.a;
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }
}
