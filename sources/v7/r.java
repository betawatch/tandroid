package v7;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class r {
    public static KeyguardManager a(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return androidx.biometric.g0.a(context);
        }
        Object systemService = context.getSystemService("keyguard");
        if (systemService instanceof KeyguardManager) {
            return (KeyguardManager) systemService;
        }
        return null;
    }

    public static boolean b(Context context) {
        KeyguardManager a2 = a(context);
        if (a2 == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 23 ? androidx.biometric.g0.b(a2) : androidx.biometric.f0.a(a2);
    }
}
