package t7;

import android.content.Context;
import j$.util.Objects;
import java.util.HashMap;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class q {
    public static final l b = l.b(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String a;

    public q(Context context, jb.k kVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        jb.c.a(context);
        synchronized (u.class) {
            if (u.b == null) {
                u.b = new u(0);
            }
        }
        this.a = "common";
        jb.f a2 = jb.f.a();
        c5.t tVar = new c5.t(this, 2);
        a2.getClass();
        jb.f.b(tVar);
        jb.f a10 = jb.f.a();
        Objects.requireNonNull(kVar);
        p pVar = new p(kVar, 0);
        a10.getClass();
        jb.f.b(pVar);
        l lVar = b;
        if (lVar.containsKey("common")) {
            y6.e.d(context, (String) lVar.get("common"), false);
        }
    }
}
