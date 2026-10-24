package x9;

import android.util.Log;
import java.io.IOException;
import org.telegram.ui.o70;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
