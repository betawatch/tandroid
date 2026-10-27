package u9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements w9.a {
    public final /* synthetic */ f a;

    public /* synthetic */ a(f fVar) {
        this.a = fVar;
    }

    public void a(vg.d dVar) {
        f fVar = this.a;
        synchronized (fVar) {
            ((ArrayList) fVar.b).add(dVar);
            ((tb.a) fVar.c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }

    @Override // w9.a
    public void b(Bundle bundle) {
        ((pa.d) this.a.a).b(bundle);
    }
}
