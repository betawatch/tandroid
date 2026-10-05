package w7;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.jb0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class g6 {
    public static boolean a(jb0 jb0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(jb0Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && jb0Var == jb0.h);
    }

    public static void b(jb0 jb0Var) {
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        jb0[] values = jb0.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            jb0 jb0Var2 = values[i10];
            packageManager.setComponentEnabledSetting(jb0Var2.a(context), jb0Var2 == jb0Var ? 1 : 2, 1);
        }
    }
}
