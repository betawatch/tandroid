package x7;

import a8.gg;
import a8.hg;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class ma {
    public static va j;
    public static final ab k;
    public final String a;
    public final String b;
    public final la c;
    public final sb.k d;
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

    public ma(Context context, sb.k kVar, la laVar) {
        new HashMap();
        this.a = context.getPackageName();
        this.b = sb.c.a(context);
        this.d = kVar;
        this.c = laVar;
        qa.b();
        this.g = "vision-common";
        sb.f a2 = sb.f.a();
        gg ggVar = new gg(this, 8);
        a2.getClass();
        this.e = sb.f.b(ggVar);
        sb.f a10 = sb.f.a();
        kVar.getClass();
        hg hgVar = new hg(kVar, 3);
        a10.getClass();
        this.f = sb.f.b(hgVar);
        ab abVar = k;
        this.h = abVar.containsKey("vision-common") ? z6.e.d(context, (String) abVar.get("vision-common"), false) : -1;
    }
}
