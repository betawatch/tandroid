package w7;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.oa0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public abstract class g6 {
    public static boolean a(oa0 oa0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(oa0Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && oa0Var == oa0.h);
    }

    public static void b(oa0 oa0Var) {
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        oa0[] values = oa0.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            oa0 oa0Var2 = values[i10];
            packageManager.setComponentEnabledSetting(oa0Var2.a(context), oa0Var2 == oa0Var ? 1 : 2, 1);
        }
    }
}
