package x9;

import android.util.Log;
import java.io.IOException;
import org.telegram.ui.o70;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class i {
    public static final ca.a d = new ca.a(2);
    public static final o70 e = new o70(26);
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
