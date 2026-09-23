package v7;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public abstract class q {
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
