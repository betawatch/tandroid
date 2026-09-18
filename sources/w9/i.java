package w9;

import android.util.Log;
import java.io.IOException;
import org.telegram.ui.kb1;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class i {
    public static final ba.a d = new ba.a(2);
    public static final kb1 e = new kb1(8);
    public final ba.c a;
    public String b = null;
    public String c = null;

    public i(ba.c cVar) {
        this.a = cVar;
    }

    public static void a(ba.c cVar, String str, String str2) {
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
