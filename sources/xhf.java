// default package

import android.content.Context;
import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class xhf {
    public static final odd b = odd.c(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String a;

    public xhf(Context context, lja ljaVar) {
        context.getPackageName();
        in2.a(context);
        synchronized (uif.class) {
            byte b2 = 0;
            if (uif.b == null) {
                uif.b = new uif(b2);
            }
        }
        this.a = "common";
        ri6.v();
        ri6.G(new tg7(this, (byte) 8));
        ri6.v();
        Objects.requireNonNull(ljaVar);
        ri6.G(new z1f(ljaVar, (byte) 3));
        odd oddVar = b;
        if (oddVar.containsKey("common")) {
            vs3.d(context, (String) oddVar.get("common"), false);
        }
    }
}
