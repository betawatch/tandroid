package w7;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.ua0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public abstract class g6 {
    public static boolean a(ua0 ua0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(ua0Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && ua0Var == ua0.h);
    }

    public static void b(ua0 ua0Var) {
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        ua0[] values = ua0.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            ua0 ua0Var2 = values[i10];
            packageManager.setComponentEnabledSetting(ua0Var2.a(context), ua0Var2 == ua0Var ? 1 : 2, 1);
        }
    }
}
