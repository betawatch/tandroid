// default package

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class wqe {
    public static ua8 a;

    public static boolean a(Context context) {
        return Build.VERSION.SDK_INT >= 26 && context.getPackageManager().hasSystemFeature("android.software.picture_in_picture") && ((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow("android:picture_in_picture", Process.myUid(), context.getPackageName()) == 0;
    }
}
