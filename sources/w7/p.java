package w7;

import a8.oa;
import android.content.Context;
import j$.util.Objects;
import java.util.HashMap;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class p {
    public static final l b = l.c(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String a;

    public p(Context context, pb.k kVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        pb.c.a(context);
        synchronized (s.class) {
            if (s.b == null) {
                s.b = new s(0, false);
            }
        }
        this.a = "common";
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 5);
        a10.getClass();
        pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        Objects.requireNonNull(kVar);
        oa oaVar = new oa(kVar, 2);
        a11.getClass();
        pb.f.b(oaVar);
        l lVar = b;
        if (lVar.containsKey("common")) {
            b7.f.d(context, (String) lVar.get("common"), false);
        }
    }
}
