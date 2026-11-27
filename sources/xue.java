// default package

import android.os.Build;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
