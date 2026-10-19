package v7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class y8 {
    public static j9 j;
    public static final d k;
    public final String a;
    public final String b;
    public final w8 c;
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
        k = new d(objArr);
    }

    public y8(Context context, rb.k kVar, w8 w8Var, String str) {
        new HashMap();
        this.a = context.getPackageName();
        this.b = rb.c.a(context);
        this.d = kVar;
        this.c = w8Var;
        d9.b();
        this.g = str;
        rb.f a2 = rb.f.a();
        c5.y yVar = new c5.y(this, 5);
        a2.getClass();
        this.e = rb.f.b(yVar);
        rb.f a10 = rb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 1);
        a10.getClass();
        this.f = rb.f.b(pVar);
        d dVar = k;
        this.h = dVar.containsKey(str) ? y6.e.d(context, (String) dVar.get(str), false) : -1;
    }
}
