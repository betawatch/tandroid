package w7;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.ob0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class h6 {
    public static boolean a(ob0 ob0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(ob0Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && ob0Var == ob0.h);
    }

    public static void b(ob0 ob0Var) {
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        ob0[] values = ob0.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            ob0 ob0Var2 = values[i10];
            packageManager.setComponentEnabledSetting(ob0Var2.a(context), ob0Var2 == ob0Var ? 1 : 2, 1);
        }
    }
}
