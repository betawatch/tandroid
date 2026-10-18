package t7;

import android.content.Context;
import c5.x;
import j$.util.Objects;
import java.util.HashMap;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class q {
    public static final l b = l.b(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String a;

    public q(Context context, rb.k kVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        rb.c.a(context);
        synchronized (u.class) {
            if (u.b == null) {
                u.b = new u(0);
            }
        }
        this.a = "common";
        rb.f a2 = rb.f.a();
        x xVar = new x(this, 2);
        a2.getClass();
        rb.f.b(xVar);
        rb.f a10 = rb.f.a();
        Objects.requireNonNull(kVar);
        p pVar = new p(kVar, 0);
        a10.getClass();
        rb.f.b(pVar);
        l lVar = b;
        if (lVar.containsKey("common")) {
            y6.e.d(context, (String) lVar.get("common"), false);
        }
    }
}
