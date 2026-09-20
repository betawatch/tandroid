package w7;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.nb0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public abstract class g6 {
    public static boolean a(nb0 nb0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(nb0Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && nb0Var == nb0.h);
    }

    public static void b(nb0 nb0Var) {
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        nb0[] values = nb0.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            nb0 nb0Var2 = values[i10];
            packageManager.setComponentEnabledSetting(nb0Var2.a(context), nb0Var2 == nb0Var ? 1 : 2, 1);
        }
    }
}
