package x9;

import android.util.Log;
import java.io.IOException;
import org.telegram.ui.ds0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class i {
    public static final ca.a d = new ca.a(2);
    public static final ds0 e = new ds0(22);
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
