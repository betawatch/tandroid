// default package

import android.app.AppOpsManager;
import android.os.Process;
import android.text.TextUtils;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class p0f {
    public static boolean a() {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a.b.getSystemService("appops");
            Class cls = Integer.TYPE;
            return ((Integer) AppOpsManager.class.getMethod("checkOpNoThrow", cls, cls, String.class).invoke(appOpsManager, 10020, Integer.valueOf(Process.myUid()), a.b.getPackageName())).intValue() == 0;
        } catch (Exception e) {
            fc4.g(e, true);
            return true;
        }
    }

    public static boolean b() {
        return !TextUtils.isEmpty(gm.j1("ro.miui.ui.version.name"));
    }
}
