package s9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import b5.g;
import c5.x;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.s;
import com.google.firebase.messaging.v;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.r3;
import w9.m;
import w9.o;
import w9.r;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class c {
    public final o a;

    public c(o oVar) {
        this.a = oVar;
    }

    public final void a(Throwable th2) {
        if (th2 == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        m mVar = this.a.f;
        Thread currentThread = Thread.currentThread();
        mVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        s sVar = mVar.e;
        v vVar = new v(mVar, currentTimeMillis, th2, currentThread);
        sVar.getClass();
        sVar.o(new x(vVar, 7));
    }

    public final void b() {
        o oVar = this.a;
        Boolean bool = Boolean.TRUE;
        r rVar = oVar.b;
        synchronized (rVar) {
            rVar.f = false;
            rVar.g = bool;
            SharedPreferences.Editor edit = rVar.a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (rVar.c) {
                try {
                    if (rVar.a()) {
                        if (!rVar.e) {
                            rVar.d.trySetResult(null);
                            rVar.e = true;
                        }
                    } else if (rVar.e) {
                        rVar.d = new TaskCompletionSource();
                        rVar.e = false;
                    }
                } finally {
                }
            }
        }
    }

    public final void c(String str, String str2) {
        m mVar = this.a.f;
        mVar.getClass();
        try {
            ((com.google.firebase.messaging.m) mVar.d.d).u(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = mVar.a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void d(String str) {
        r3 r3Var = this.a.f.d;
        r3Var.getClass();
        String b10 = x9.d.b(1024, str);
        synchronized (((AtomicMarkableReference) r3Var.h)) {
            try {
                String str2 = (String) ((AtomicMarkableReference) r3Var.h).getReference();
                if (b10 == null ? str2 == null : b10.equals(str2)) {
                    return;
                }
                ((AtomicMarkableReference) r3Var.h).set(b10, true);
                ((s) r3Var.b).o(new g(r3Var, 1));
            } finally {
            }
        }
    }
}
