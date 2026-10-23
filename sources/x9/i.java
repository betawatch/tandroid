package x9;

import android.util.Log;
import java.io.IOException;
import org.telegram.ui.jg0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class i {
    public static final ca.a d = new ca.a(2);
    public static final jg0 e = new jg0(25);
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
