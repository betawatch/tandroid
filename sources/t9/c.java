package t9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import b5.g;
import c5.y;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.s;
import com.google.firebase.messaging.u;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.t3;
import x9.n;
import x9.p;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class c {
    public final p a;

    public c(p pVar) {
        this.a = pVar;
    }

    public final void a(Throwable th2) {
        if (th2 == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        n nVar = this.a.f;
        Thread currentThread = Thread.currentThread();
        nVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        s sVar = nVar.e;
        u uVar = new u(nVar, currentTimeMillis, th2, currentThread);
        sVar.getClass();
        sVar.v(new y(uVar, 9));
    }

    public final void b() {
        p pVar = this.a;
        Boolean bool = Boolean.TRUE;
        x9.s sVar = pVar.b;
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

    public final void c(String str, String str2) {
        n nVar = this.a.f;
        nVar.getClass();
        try {
            ((c2.b) nVar.d.d).x(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = nVar.a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void d(String str) {
        t3 t3Var = this.a.f.d;
        t3Var.getClass();
        String b10 = y9.d.b(1024, str);
        synchronized (((AtomicMarkableReference) t3Var.h)) {
            try {
                String str2 = (String) ((AtomicMarkableReference) t3Var.h).getReference();
                if (b10 == null ? str2 == null : b10.equals(str2)) {
                    return;
                }
                ((AtomicMarkableReference) t3Var.h).set(b10, true);
                ((s) t3Var.b).v(new g(t3Var, 1));
            } finally {
            }
        }
    }
}
