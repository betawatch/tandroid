package za;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
