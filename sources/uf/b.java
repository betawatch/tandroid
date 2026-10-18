package uf;

import android.content.Context;
import android.os.Build;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class b {
    public static final int[] a = new int[2];

    public static int a(Context context) {
        if (AndroidUtilities.checkInlinePermissions(context)) {
            return 2;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return AndroidUtilities.checkPipPermissions(context) ? 1 : -2;
        }
        return -1;
    }

    public static WindowManager.LayoutParams b(Context context, boolean z10) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        layoutParams.type = (z10 || !AndroidUtilities.checkInlinePermissions(context)) ? 2 : Build.VERSION.SDK_INT >= 26 ? 2038 : 2003;
        layoutParams.flags = 520;
        return layoutParams;
    }
}
