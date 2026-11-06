package w9;

import aa.s;
import aa.u;
import aa.x;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
