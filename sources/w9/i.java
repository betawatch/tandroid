package w9;

import android.util.Log;
import java.io.IOException;
import org.telegram.ui.db1;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class i {
    public static final ba.a d = new ba.a(2);
    public static final db1 e = new db1(8);
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
