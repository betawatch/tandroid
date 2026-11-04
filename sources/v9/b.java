package v9;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.TaskCompletionSource;
import z9.o;
import z9.p;
import z9.s;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b {
    public final p a;

    public b(p pVar) {
        this.a = pVar;
    }

    public final void a() {
        p pVar = this.a;
        Boolean bool = Boolean.TRUE;
        s sVar = pVar.b;
        synchronized (sVar) {
            sVar.f = false;
            sVar.g = bool;
            SharedPreferences.Editor edit = sVar.a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (sVar.c) {
                try {
                    if (sVar.a()) {
                        if (!sVar.e) {
                            sVar.d.trySetResult(null);
                            sVar.e = true;
                        }
                    } else if (sVar.e) {
                        sVar.d = new TaskCompletionSource();
                        sVar.e = false;
                    }
                } finally {
                }
            }
        }
    }

    public final void b(String str, String str2) {
        p pVar = this.a;
        pVar.n.a.a(new o(pVar, str, str2, 0));
    }
}
