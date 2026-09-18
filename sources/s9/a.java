package s9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import t7.u;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements u9.a {
    public final /* synthetic */ f a;

    public /* synthetic */ a(f fVar) {
        this.a = fVar;
    }

    @Override // u9.a
    public void J(Bundle bundle) {
        ((u) this.a.a).J(bundle);
    }

    public void a(t0.a aVar) {
        f fVar = this.a;
        synchronized (fVar) {
            ((ArrayList) fVar.b).add(aVar);
            ((ob.a) fVar.c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
