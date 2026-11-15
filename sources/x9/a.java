package x9;

import android.util.Log;
import da.p1;
import di.h;
import java.util.concurrent.atomic.AtomicReference;
import tg.z1;
import u9.o;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class a {
    public static final b c = new b();
    public final o a;
    public final AtomicReference b = new AtomicReference(null);

    public a(o oVar) {
        this.a = oVar;
        oVar.a(new z1(this, 15));
    }

    public final b a(String str) {
        a aVar = (a) this.b.get();
        return aVar == null ? c : aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.b.get();
        return aVar != null && aVar.b();
    }

    public final boolean c(String str) {
        a aVar = (a) this.b.get();
        return aVar != null && aVar.c(str);
    }

    public final void d(String str, long j3, p1 p1Var) {
        String k10 = r.b.k("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", k10, null);
        }
        this.a.a(new h(str, j3, p1Var, 11));
    }
}
