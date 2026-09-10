package w9;

import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class i {
    public static final ba.a d = new ba.a(2);
    public static final sg.p e = new sg.p(1);
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
