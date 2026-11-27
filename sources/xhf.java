// default package

import android.content.Context;
import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
