package v7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class x8 {
    public static i9 j;
    public static final d k;
    public final String a;
    public final String b;
    public final v8 c;
    public final jb.k d;
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

    public x8(Context context, jb.k kVar, v8 v8Var, String str) {
        new HashMap();
        this.a = context.getPackageName();
        this.b = jb.c.a(context);
        this.d = kVar;
        this.c = v8Var;
        c9.b();
        this.g = str;
        jb.f a2 = jb.f.a();
        c5.t tVar = new c5.t(this, 5);
        a2.getClass();
        this.e = jb.f.b(tVar);
        jb.f a10 = jb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 1);
        a10.getClass();
        this.f = jb.f.b(pVar);
        d dVar = k;
        this.h = dVar.containsKey(str) ? y6.e.d(context, (String) dVar.get(str), false) : -1;
    }
}
