package w7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class la {
    public static ua j;
    public static final za k;
    public final String a;
    public final String b;
    public final ka c;
    public final qb.k d;
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

    public la(Context context, qb.k kVar, ka kaVar) {
        new HashMap();
        this.a = context.getPackageName();
        this.b = qb.c.a(context);
        this.d = kVar;
        this.c = kaVar;
        pa.b();
        this.g = "vision-common";
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 6);
        a2.getClass();
        this.e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 2);
        a10.getClass();
        this.f = qb.f.b(pVar);
        za zaVar = k;
        this.h = zaVar.containsKey("vision-common") ? y6.e.d(context, (String) zaVar.get("vision-common"), false) : -1;
    }
}
