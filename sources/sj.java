// default package

import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
