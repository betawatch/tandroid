package w7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        c5.x xVar = new c5.x(this, 6);
        a2.getClass();
        this.e = rb.f.b(xVar);
        rb.f a10 = rb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 2);
        a10.getClass();
        this.f = rb.f.b(pVar);
        za zaVar = k;
        this.h = zaVar.containsKey("vision-common") ? y6.e.d(context, (String) zaVar.get("vision-common"), false) : -1;
    }
}
