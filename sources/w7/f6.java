package w7;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.mb0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public abstract class f6 {
    public static boolean a(mb0 mb0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(mb0Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && mb0Var == mb0.h);
    }

    public static void b(mb0 mb0Var) {
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        mb0[] values = mb0.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            mb0 mb0Var2 = values[i10];
            packageManager.setComponentEnabledSetting(mb0Var2.a(context), mb0Var2 == mb0Var ? 1 : 2, 1);
        }
    }
}
