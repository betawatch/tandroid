package w7;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.lb0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class e6 {
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
