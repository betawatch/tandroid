package w9;

import aa.r;
import aa.t;
import aa.w;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class b {
    public final t a;

    public b(t tVar) {
        this.a = tVar;
    }

    public final void a() {
        t tVar = this.a;
        Boolean bool = Boolean.TRUE;
        w wVar = tVar.b;
        synchronized (wVar) {
            wVar.f = false;
            wVar.g = bool;
            SharedPreferences.Editor edit = wVar.a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (wVar.c) {
                try {
                    if (wVar.a()) {
                        if (!wVar.e) {
                            wVar.d.trySetResult(null);
                            wVar.e = true;
                        }
                    } else if (wVar.e) {
                        wVar.d = new TaskCompletionSource();
                        wVar.e = false;
                    }
                } finally {
                }
            }
        }
    }

    public final void b(String str, String str2) {
        t tVar = this.a;
        tVar.n.a.a(new r((Object) tVar, (Object) str, (Object) str2, 0));
    }
}
