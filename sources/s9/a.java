package s9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import t7.u;
import u2.o1;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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

    public void a(o1 o1Var) {
        f fVar = this.a;
        synchronized (fVar) {
            ((ArrayList) fVar.b).add(o1Var);
            ((ob.a) fVar.c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
