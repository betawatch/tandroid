// default package

import android.content.Context;
import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
        ri6.G(new ug7(this, (byte) 8));
        ri6.v();
        Objects.requireNonNull(ljaVar);
        ri6.G(new z1f(ljaVar, (byte) 3));
        odd oddVar = b;
        if (oddVar.containsKey("common")) {
            vs3.d(context, (String) oddVar.get("common"), false);
        }
    }
}
