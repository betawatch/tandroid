package y7;

import a8.oa;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class e9 {
    public static n9 j;
    public static final d k;
    public final String a;
    public final String b;
    public final c9 c;
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
        k = new d(objArr);
    }

    public e9(Context context, pb.k kVar, c9 c9Var, String str) {
        new HashMap();
        this.a = context.getPackageName();
        this.b = pb.c.a(context);
        this.d = kVar;
        this.c = c9Var;
        h9.b();
        this.g = str;
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 8);
        a10.getClass();
        this.e = pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        kVar.getClass();
        oa oaVar = new oa(kVar, 3);
        a11.getClass();
        this.f = pb.f.b(oaVar);
        d dVar = k;
        this.h = dVar.containsKey(str) ? b7.f.d(context, (String) dVar.get(str), false) : -1;
    }
}
