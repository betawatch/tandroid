package v7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class y8 {
    public static j9 j;
    public static final d k;
    public final String a;
    public final String b;
    public final w8 c;
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
        k = new d(objArr);
    }

    public y8(Context context, qb.k kVar, w8 w8Var, String str) {
        new HashMap();
        this.a = context.getPackageName();
        this.b = qb.c.a(context);
        this.d = kVar;
        this.c = w8Var;
        d9.b();
        this.g = str;
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 5);
        a2.getClass();
        this.e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 1);
        a10.getClass();
        this.f = qb.f.b(pVar);
        d dVar = k;
        this.h = dVar.containsKey(str) ? y6.e.d(context, (String) dVar.get(str), false) : -1;
    }
}
