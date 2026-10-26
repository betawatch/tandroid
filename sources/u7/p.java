package u7;

import a8.gg;
import a8.hg;
import android.content.Context;
import j$.util.Objects;
import java.util.HashMap;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class p {
    public static final l b = l.b(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String a;

    public p(Context context, sb.k kVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        sb.c.a(context);
        synchronized (s.class) {
            if (s.b == null) {
                s.b = new s(0);
            }
        }
        this.a = "common";
        sb.f a2 = sb.f.a();
        gg ggVar = new gg(this, 5);
        a2.getClass();
        sb.f.b(ggVar);
        sb.f a10 = sb.f.a();
        Objects.requireNonNull(kVar);
        hg hgVar = new hg(kVar, 1);
        a10.getClass();
        sb.f.b(hgVar);
        l lVar = b;
        if (lVar.containsKey("common")) {
            z6.e.d(context, (String) lVar.get("common"), false);
        }
    }
}
