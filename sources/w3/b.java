package w3;

import android.util.Log;
import java.util.concurrent.TimeoutException;
import w9.w;
import za.a0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class b {
    public final Object a;

    public /* synthetic */ b(Object obj) {
        this.a = obj;
    }

    public void a(a0 a0Var) {
        ((l5.q) ((i5.f) ((pa.b) this.a).get())).a("FIREBASE_APPQUALITY_SESSION", new i5.c("json"), new r5.d(this, 28)).a(new i5.a(null, a0Var, i5.d.a, null), new j2.e(22));
    }

    public void b(da.b bVar, Thread thread, Throwable th2) {
        w9.m mVar = (w9.m) this.a;
        synchronized (mVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    w.a(mVar.e.l(new w9.k(mVar, System.currentTimeMillis(), th2, thread, bVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }
}
