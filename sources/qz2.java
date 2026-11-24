// default package

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qz2 {
    public static final f8e c = new f8e();
    public final xs7 a;
    public final AtomicReference b = new AtomicReference(null);

    public qz2(xs7 xs7Var) {
        this.a = xs7Var;
        xs7Var.a(new wm2(this, (byte) 4));
    }

    public final f8e a() {
        qz2 qz2Var = (qz2) this.b.get();
        return qz2Var == null ? c : qz2Var.a();
    }

    public final boolean b() {
        qz2 qz2Var = (qz2) this.b.get();
        return qz2Var != null && qz2Var.b();
    }

    public final boolean c() {
        qz2 qz2Var = (qz2) this.b.get();
        return qz2Var != null && qz2Var.c();
    }

    public final void d(String str, long j, mb0 mb0Var) {
        String h = b10.h("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", h, null);
        }
        this.a.a(new pt0((Object) str, j, (Object) mb0Var, (byte) 1));
    }
}
