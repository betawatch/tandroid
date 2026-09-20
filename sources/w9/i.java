package w9;

import android.util.Log;
import java.io.IOException;
import org.telegram.ui.mb1;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class i {
    public static final ba.a d = new ba.a(2);
    public static final mb1 e = new mb1(8);
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
