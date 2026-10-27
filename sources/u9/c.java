package u9;

import a8.gg;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import c5.g;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.q;
import com.google.firebase.messaging.s;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.r3;
import y9.n;
import y9.p;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        q qVar = nVar.e;
        s sVar = new s(nVar, currentTimeMillis, th2, currentThread);
        qVar.getClass();
        qVar.F(new gg(sVar, 10));
    }

    public final void b() {
        p pVar = this.a;
        Boolean bool = Boolean.TRUE;
        y9.s sVar = pVar.b;
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
        r3 r3Var = this.a.f.d;
        r3Var.getClass();
        String b10 = z9.d.b(1024, str);
        synchronized (((AtomicMarkableReference) r3Var.h)) {
            try {
                String str2 = (String) ((AtomicMarkableReference) r3Var.h).getReference();
                if (b10 == null ? str2 == null : b10.equals(str2)) {
                    return;
                }
                ((AtomicMarkableReference) r3Var.h).set(b10, true);
                ((q) r3Var.b).F(new g(r3Var, 1));
            } finally {
            }
        }
    }
}
