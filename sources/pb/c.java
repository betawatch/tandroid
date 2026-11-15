package pb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class c {
    public static final k8.a a = new k8.a("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e10) {
            String concat = "Exception thrown when trying to get app version ".concat(e10.toString());
            k8.a aVar = a;
            if (!Log.isLoggable((String) aVar.b, 6)) {
                return "";
            }
            String str = (String) aVar.c;
            if (str != null) {
                concat = str.concat(concat);
            }
            Log.e("CommonUtils", concat);
            return "";
        }
    }
}
