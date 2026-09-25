package qb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public abstract class c {
    public static final lf.g a = new lf.g("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String concat = "Exception thrown when trying to get app version ".concat(e.toString());
            lf.g gVar = a;
            if (!Log.isLoggable(gVar.b, 6)) {
                return "";
            }
            String str = gVar.c;
            if (str != null) {
                concat = str.concat(concat);
            }
            Log.e("CommonUtils", concat);
            return "";
        }
    }
}
