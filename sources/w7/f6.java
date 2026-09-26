package w7;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.fb0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
