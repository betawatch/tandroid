// default package

import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class sj {
    public final /* synthetic */ tj a;

    public final void a(uy2 uy2Var) {
        tj tjVar = this.a;
        synchronized (tjVar) {
            ((ArrayList) tjVar.b).add(uy2Var);
            Object obj = tjVar.c;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
