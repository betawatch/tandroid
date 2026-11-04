package y7;

import android.content.Context;
import b8.dg;
import b8.eg;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ma {
    public static va j;
    public static final ab k;
    public final String a;
    public final String b;
    public final la c;
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
        k = new ab(objArr);
    }

    public ma(Context context, mb.k kVar, la laVar) {
        new HashMap();
        this.a = context.getPackageName();
        this.b = mb.c.a(context);
        this.d = kVar;
        this.c = laVar;
        qa.b();
        this.g = "vision-common";
        mb.f a10 = mb.f.a();
        dg dgVar = new dg(this, 7);
        a10.getClass();
        this.e = mb.f.b(dgVar);
        mb.f a11 = mb.f.a();
        kVar.getClass();
        eg egVar = new eg(kVar, 3);
        a11.getClass();
        this.f = mb.f.b(egVar);
        ab abVar = k;
        this.h = abVar.containsKey("vision-common") ? a7.f.d(context, (String) abVar.get("vision-common"), false) : -1;
    }
}
