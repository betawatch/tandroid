package pb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class c {
    public static final f5.a a = new f5.a("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e10) {
            String concat = "Exception thrown when trying to get app version ".concat(e10.toString());
            f5.a aVar = a;
            if (!Log.isLoggable(aVar.a, 6)) {
                return "";
            }
            String str = aVar.b;
            if (str != null) {
                concat = str.concat(concat);
            }
            Log.e("CommonUtils", concat);
            return "";
        }
    }
}
