package w9;

import android.util.Log;
import java.io.IOException;
import org.telegram.ui.db1;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
