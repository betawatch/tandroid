package s9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import b5.g;
import c5.x;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.s;
import com.google.firebase.messaging.u;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.p3;
import w9.m;
import w9.o;
import w9.r;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        u uVar = new u(mVar, currentTimeMillis, th2, currentThread);
        sVar.getClass();
        sVar.h(new x(uVar, 7));
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
        } catch (IllegalArgumentException e7) {
            Context context = mVar.a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e7;
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
                ((s) p3Var.b).h(new g(p3Var, 1));
            } finally {
            }
        }
    }
}
