package qb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import m2.u;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public abstract class c {
    public static final u a = new u("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e7) {
            String concat = "Exception thrown when trying to get app version ".concat(e7.toString());
            u uVar = a;
            if (!Log.isLoggable(uVar.b, 6)) {
                return "";
            }
            String str = uVar.c;
            if (str != null) {
                concat = str.concat(concat);
            }
            Log.e("CommonUtils", concat);
            return "";
        }
    }
}
