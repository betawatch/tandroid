package za;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final class l {
    public final k9.h a;
    public final bb.i b;

    public l(k9.h hVar, bb.i iVar, id.h hVar2) {
        this.a = hVar;
        this.b = iVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        hVar.a();
        Context applicationContext = hVar.a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(o0.a);
            zd.e0.q(zd.e0.b(hVar2), new bb.j(this, hVar2, null, 4));
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
