package z7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class ma {
    public static va j;
    public static final ab k;
    public final String a;
    public final String b;
    public final la c;
    public final pb.k d;
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

    public ma(Context context, pb.k kVar, la laVar) {
        new HashMap();
        this.a = context.getPackageName();
        this.b = pb.c.a(context);
        this.d = kVar;
        this.c = laVar;
        qa.b();
        this.g = "vision-common";
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 9);
        a10.getClass();
        this.e = pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        kVar.getClass();
        a8.pa paVar = new a8.pa(kVar, 4);
        a11.getClass();
        this.f = pb.f.b(paVar);
        ab abVar = k;
        this.h = abVar.containsKey("vision-common") ? b7.f.d(context, (String) abVar.get("vision-common"), false) : -1;
    }
}
