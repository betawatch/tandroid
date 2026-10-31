package w7;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.ui.ba0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class j6 {
    public static boolean a(ba0 ba0Var) {
        Context context = org.telegram.messenger.w0.b;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(ba0Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && ba0Var == ba0.h);
    }

    public static void b(ba0 ba0Var) {
        Context context = org.telegram.messenger.w0.b;
        PackageManager packageManager = context.getPackageManager();
        ba0[] values = ba0.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            ba0 ba0Var2 = values[i10];
            packageManager.setComponentEnabledSetting(ba0Var2.a(context), ba0Var2 == ba0Var ? 1 : 2, 1);
        }
    }
}
