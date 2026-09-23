package w7;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.gb0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public abstract class e6 {
    public static boolean a(gb0 gb0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(gb0Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && gb0Var == gb0.h);
    }

    public static void b(gb0 gb0Var) {
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        gb0[] values = gb0.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            gb0 gb0Var2 = values[i10];
            packageManager.setComponentEnabledSetting(gb0Var2.a(context), gb0Var2 == gb0Var ? 1 : 2, 1);
        }
    }
}
