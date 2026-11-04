package v7;

import android.content.Context;
import b8.dg;
import b8.eg;
import j$.util.Objects;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p {
    public static final l b = l.c(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String a;

    public p(Context context, mb.k kVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        mb.c.a(context);
        synchronized (s.class) {
            if (s.b == null) {
                s.b = new s(0);
            }
        }
        this.a = "common";
        mb.f a10 = mb.f.a();
        dg dgVar = new dg(this, 3);
        a10.getClass();
        mb.f.b(dgVar);
        mb.f a11 = mb.f.a();
        Objects.requireNonNull(kVar);
        eg egVar = new eg(kVar, 1);
        a11.getClass();
        mb.f.b(egVar);
        l lVar = b;
        if (lVar.containsKey("common")) {
            a7.f.d(context, (String) lVar.get("common"), false);
        }
    }
}
