package t7;

import android.content.Context;
import c5.w;
import j$.util.Objects;
import java.util.HashMap;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class q {
    public static final l b = l.b(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String a;

    public q(Context context, qb.k kVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        qb.c.a(context);
        synchronized (u.class) {
            if (u.a == null) {
                u.a = new u();
            }
        }
        this.a = "common";
        qb.f a2 = qb.f.a();
        w wVar = new w(this, 2);
        a2.getClass();
        qb.f.b(wVar);
        qb.f a10 = qb.f.a();
        Objects.requireNonNull(kVar);
        p pVar = new p(kVar, 0);
        a10.getClass();
        qb.f.b(pVar);
        l lVar = b;
        if (lVar.containsKey("common")) {
            y6.e.d(context, (String) lVar.get("common"), false);
        }
    }
}
