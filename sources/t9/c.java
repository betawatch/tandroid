package t9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import b5.g;
import c5.y;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.r;
import com.google.firebase.messaging.u;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.s3;
import x9.m;
import x9.o;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        r rVar = mVar.e;
        u uVar = new u(mVar, currentTimeMillis, th2, currentThread);
        rVar.getClass();
        rVar.v(new y(uVar, 9));
    }

    public final void b() {
        o oVar = this.a;
        Boolean bool = Boolean.TRUE;
        x9.r rVar = oVar.b;
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
            ((c2.b) mVar.d.d).x(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = mVar.a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void d(String str) {
        s3 s3Var = this.a.f.d;
        s3Var.getClass();
        String b10 = y9.d.b(1024, str);
        synchronized (((AtomicMarkableReference) s3Var.h)) {
            try {
                String str2 = (String) ((AtomicMarkableReference) s3Var.h).getReference();
                if (b10 == null ? str2 == null : b10.equals(str2)) {
                    return;
                }
                ((AtomicMarkableReference) s3Var.h).set(b10, true);
                ((r) s3Var.b).v(new g(s3Var, 1));
            } finally {
            }
        }
    }
}
