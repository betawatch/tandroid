package w7;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.lb0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class h6 {
    public static boolean a(lb0 lb0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(lb0Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && lb0Var == lb0.h);
    }

    public static void b(lb0 lb0Var) {
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        lb0[] values = lb0.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            lb0 lb0Var2 = values[i10];
            packageManager.setComponentEnabledSetting(lb0Var2.a(context), lb0Var2 == lb0Var ? 1 : 2, 1);
        }
    }
}
