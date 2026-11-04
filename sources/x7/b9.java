package x7;

import android.content.Context;
import b8.dg;
import b8.eg;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b9 {
    public static k9 j;
    public static final d k;
    public final String a;
    public final String b;
    public final z8 c;
    public final mb.k d;
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

    public b9(Context context, mb.k kVar, z8 z8Var, String str) {
        new HashMap();
        this.a = context.getPackageName();
        this.b = mb.c.a(context);
        this.d = kVar;
        this.c = z8Var;
        e9.b();
        this.g = str;
        mb.f a10 = mb.f.a();
        dg dgVar = new dg(this, 6);
        a10.getClass();
        this.e = mb.f.b(dgVar);
        mb.f a11 = mb.f.a();
        kVar.getClass();
        eg egVar = new eg(kVar, 2);
        a11.getClass();
        this.f = mb.f.b(egVar);
        d dVar = k;
        this.h = dVar.containsKey(str) ? a7.f.d(context, (String) dVar.get(str), false) : -1;
    }
}
