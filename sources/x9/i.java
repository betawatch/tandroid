package x9;

import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class i {
    public static final ca.a d = new ca.a(2);
    public static final x2.e e = new x2.e(5);
    public final ca.c a;
    public String b = null;
    public String c = null;

    public i(ca.c cVar) {
        this.a = cVar;
    }

    public static void a(ca.c cVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            cVar.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e7);
        }
    }
}
