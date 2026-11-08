package w9;

import aa.s;
import aa.u;
import aa.x;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class b {
    public final u a;

    public b(u uVar) {
        this.a = uVar;
    }

    public final void a() {
        u uVar = this.a;
        Boolean bool = Boolean.TRUE;
        x xVar = uVar.b;
        synchronized (xVar) {
            xVar.f = false;
            xVar.g = bool;
            SharedPreferences.Editor edit = xVar.a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (xVar.c) {
                try {
                    if (xVar.a()) {
                        if (!xVar.e) {
                            xVar.d.trySetResult(null);
                            xVar.e = true;
                        }
                    } else if (xVar.e) {
                        xVar.d = new TaskCompletionSource();
                        xVar.e = false;
                    }
                } finally {
                }
            }
        }
    }

    public final void b(String str, String str2) {
        u uVar = this.a;
        uVar.n.a.a(new s((Object) uVar, (Object) str, (Object) str2, 0));
    }
}
