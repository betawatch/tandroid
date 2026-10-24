package w7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class la {
    public static ua j;
    public static final za k;
    public final String a;
    public final String b;
    public final ka c;
    public final rb.k d;
    public final Task e;
    public final Task f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        k = new za(objArr);
    }

    public la(Context context, rb.k kVar, ka kaVar) {
        new HashMap();
        this.a = context.getPackageName();
        this.b = rb.c.a(context);
        this.d = kVar;
        this.c = kaVar;
        pa.b();
        this.g = "vision-common";
        rb.f a2 = rb.f.a();
        c5.y yVar = new c5.y(this, 6);
        a2.getClass();
        this.e = rb.f.b(yVar);
        rb.f a10 = rb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 2);
        a10.getClass();
        this.f = rb.f.b(pVar);
        za zaVar = k;
        this.h = zaVar.containsKey("vision-common") ? y6.e.d(context, (String) zaVar.get("vision-common"), false) : -1;
    }
}
