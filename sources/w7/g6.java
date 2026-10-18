package w7;

import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.qa0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public abstract class g6 {
    public static boolean a(qa0 qa0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(qa0Var.a(context));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && qa0Var == qa0.h);
    }

    public static void b(qa0 qa0Var) {
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        qa0[] values = qa0.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            qa0 qa0Var2 = values[i10];
            packageManager.setComponentEnabledSetting(qa0Var2.a(context), qa0Var2 == qa0Var ? 1 : 2, 1);
        }
    }
}
