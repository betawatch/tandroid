package w7;

import android.util.Log;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class r6 {
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
