package w7;

import android.util.Log;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class p6 {
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
