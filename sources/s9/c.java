package s9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import b5.g;
import c5.w;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.m;
import com.google.firebase.messaging.t;
import com.google.firebase.messaging.v;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.p3;
import w9.n;
import w9.p;
import w9.s;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        t tVar = nVar.e;
        v vVar = new v(nVar, currentTimeMillis, th2, currentThread);
        tVar.getClass();
        tVar.k(new w(vVar, 7));
    }

    public final void b() {
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

    public final void c(String str, String str2) {
        n nVar = this.a.f;
        nVar.getClass();
        try {
            ((m) nVar.d.d).u(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = nVar.a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void d(String str) {
        p3 p3Var = this.a.f.d;
        p3Var.getClass();
        String b10 = x9.d.b(1024, str);
        synchronized (((AtomicMarkableReference) p3Var.h)) {
            try {
                String str2 = (String) ((AtomicMarkableReference) p3Var.h).getReference();
                if (b10 == null ? str2 == null : b10.equals(str2)) {
                    return;
                }
                ((AtomicMarkableReference) p3Var.h).set(b10, true);
                ((t) p3Var.b).k(new g(p3Var, 1));
            } finally {
            }
        }
    }
}
