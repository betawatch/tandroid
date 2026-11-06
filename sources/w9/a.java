package w9;

import a3.l;
import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements y9.a {
    public final /* synthetic */ f a;

    public /* synthetic */ a(f fVar) {
        this.a = fVar;
    }

    public void a(l lVar) {
        f fVar = this.a;
        synchronized (fVar) {
            ((ArrayList) fVar.b).add(lVar);
            ((qb.a) fVar.c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }

    @Override // y9.a
    public void a2(Bundle bundle) {
        ((qb.a) this.a.a).a2(bundle);
    }
}
