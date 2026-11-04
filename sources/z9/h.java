package z9;

import android.util.Log;
import java.io.IOException;
import vg.i1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h {
    public static final fa.a d = new fa.a(2);
    public static final i1 e = new i1(10);
    public final fa.f a;
    public String b = null;
    public String c = null;

    public h(fa.f fVar) {
        this.a = fVar;
    }

    public static void a(fa.f fVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            fVar.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e10);
        }
    }
}
