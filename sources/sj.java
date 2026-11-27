// default package

import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
