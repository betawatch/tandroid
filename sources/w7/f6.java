package w7;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.fb0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public abstract class f6 {
    public static boolean a(fb0 fb0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(fb0Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && fb0Var == fb0.h);
    }

    public static void b(fb0 fb0Var) {
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        fb0[] values = fb0.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            fb0 fb0Var2 = values[i10];
            packageManager.setComponentEnabledSetting(fb0Var2.a(context), fb0Var2 == fb0Var ? 1 : 2, 1);
        }
    }
}
