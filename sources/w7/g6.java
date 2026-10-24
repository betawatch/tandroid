package w7;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.ua0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class g6 {
    public static boolean a(ua0 ua0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(ua0Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && ua0Var == ua0.h);
    }

    public static void b(ua0 ua0Var) {
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        ua0[] values = ua0.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            ua0 ua0Var2 = values[i10];
            packageManager.setComponentEnabledSetting(ua0Var2.a(context), ua0Var2 == ua0Var ? 1 : 2, 1);
        }
    }
}
