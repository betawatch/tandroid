package y9;

import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
