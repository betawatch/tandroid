package y9;

import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class i {
    public static final da.a d = new da.a(3);
    public static final y2.p e = new y2.p(1);
    public final da.c a;
    public String b = null;
    public String c = null;

    public i(da.c cVar) {
        this.a = cVar;
    }

    public static void a(da.c cVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            cVar.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e10);
        }
    }
}
