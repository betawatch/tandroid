package xf;

import android.app.AppOpsManager;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.view.WindowManager;
import org.telegram.messenger.g0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class b {
    public static final int[] a = new int[2];

    public static int a(Context context) {
        Typeface typeface = g0.a;
        if (Settings.canDrawOverlays(context)) {
            return 2;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return (context.getPackageManager().hasSystemFeature("android.software.picture_in_picture") && ((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow("android:picture_in_picture", Process.myUid(), context.getPackageName()) == 0) ? 1 : -2;
        }
        return -1;
    }

    public static WindowManager.LayoutParams b(Context context, boolean z10) {
        int i3;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        if (!z10) {
            Typeface typeface = g0.a;
            if (Settings.canDrawOverlays(context)) {
                i3 = Build.VERSION.SDK_INT >= 26 ? 2038 : 2003;
                layoutParams.type = i3;
                layoutParams.flags = 520;
                return layoutParams;
            }
        }
        i3 = 2;
        layoutParams.type = i3;
        layoutParams.flags = 520;
        return layoutParams;
    }
}
