package w7;

import android.util.Log;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public abstract class m6 {
    public static void a(Exception exc, String str, Object... objArr) {
        if (Log.isLoggable("Vision", 6)) {
            if (Log.isLoggable("Vision", 3)) {
                Log.e("Vision", String.format(str, objArr), exc);
                return;
            }
            String format = String.format(str, objArr);
            String valueOf = String.valueOf(exc);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + format.length() + 2);
            sb2.append(format);
            sb2.append(": ");
            sb2.append(valueOf);
            Log.e("Vision", sb2.toString());
        }
    }
}
