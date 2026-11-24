// default package

import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
