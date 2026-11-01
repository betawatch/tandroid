package w7;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.ui.aa0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class j6 {
    public static boolean a(aa0 aa0Var) {
        Context context = org.telegram.messenger.w0.b;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(aa0Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && aa0Var == aa0.h);
    }

    public static void b(aa0 aa0Var) {
        Context context = org.telegram.messenger.w0.b;
        PackageManager packageManager = context.getPackageManager();
        aa0[] values = aa0.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            aa0 aa0Var2 = values[i10];
            packageManager.setComponentEnabledSetting(aa0Var2.a(context), aa0Var2 == aa0Var ? 1 : 2, 1);
        }
    }
}
