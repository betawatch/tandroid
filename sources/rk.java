// default package

import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class rk {
    public final /* synthetic */ sk a;

    public /* synthetic */ rk(sk skVar) {
        this.a = skVar;
    }

    public final void a(a32 a32Var) {
        sk skVar = this.a;
        synchronized (skVar) {
            ((ArrayList) skVar.b).add(a32Var);
            Object obj = skVar.c;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
