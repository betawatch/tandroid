package za;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class n {
    public final k9.h a;
    public final bb.h b;

    public n(k9.h hVar, bb.h hVar2, id.h hVar3) {
        this.a = hVar;
        this.b = hVar2;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        hVar.a();
        Context applicationContext = hVar.a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(q0.a);
            zd.e0.q(zd.e0.b(hVar3), new bb.i(this, hVar3, null, 4));
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
