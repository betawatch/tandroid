package t9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import th.m1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements v9.a {
    public final /* synthetic */ f a;

    public /* synthetic */ a(f fVar) {
        this.a = fVar;
    }

    @Override // v9.a
    public void I(Bundle bundle) {
        ((hb.a) this.a.a).I(bundle);
    }

    public void a(m1 m1Var) {
        f fVar = this.a;
        synchronized (fVar) {
            ((ArrayList) fVar.b).add(m1Var);
            ((kb.a) fVar.c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
