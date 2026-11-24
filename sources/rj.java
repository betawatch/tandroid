// default package

import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class rj {
    public final /* synthetic */ sj a;

    public /* synthetic */ rj(sj sjVar) {
        this.a = sjVar;
    }

    public final void a(k32 k32Var) {
        sj sjVar = this.a;
        synchronized (sjVar) {
            ((ArrayList) sjVar.b).add(k32Var);
            Object obj = sjVar.c;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
