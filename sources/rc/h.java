package rc;

import i7.m7;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class h extends m7 {
    public static int b(List list) {
        kotlin.jvm.internal.j.e(list, "<this>");
        return list.size() - 1;
    }

    public static List c(Object... objArr) {
        if (objArr.length <= 0) {
            return o.a;
        }
        List asList = Arrays.asList(objArr);
        kotlin.jvm.internal.j.d(asList, "asList(...)");
        return asList;
    }
}
