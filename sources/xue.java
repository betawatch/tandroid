// default package

import android.os.Build;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class xue {
    public static Boolean a;
    public static int b;

    public static boolean a() {
        Boolean bool;
        int intValue;
        Boolean bool2 = a;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        try {
            Field declaredField = Build.VERSION.class.getDeclaredField("SEM_PLATFORM_INT");
            declaredField.setAccessible(true);
            intValue = ((Integer) declaredField.get(null)).intValue();
        } catch (Exception unused) {
            bool = Boolean.FALSE;
            a = bool;
        }
        if (intValue < 100000) {
            return false;
        }
        b = intValue - 90000;
        bool = Boolean.TRUE;
        a = bool;
        return bool.booleanValue();
    }
}
