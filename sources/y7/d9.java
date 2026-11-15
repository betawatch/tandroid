package y7;

import a8.pa;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class d9 {
    public static m9 j;
    public static final d k;
    public final String a;
    public final String b;
    public final b9 c;
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

    public d9(Context context, pb.k kVar, b9 b9Var, String str) {
        new HashMap();
        this.a = context.getPackageName();
        this.b = pb.c.a(context);
        this.d = kVar;
        this.c = b9Var;
        g9.b();
        this.g = str;
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 8);
        a10.getClass();
        this.e = pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        kVar.getClass();
        pa paVar = new pa(kVar, 3);
        a11.getClass();
        this.f = pb.f.b(paVar);
        d dVar = k;
        this.h = dVar.containsKey(str) ? b7.f.d(context, (String) dVar.get(str), false) : -1;
    }
}
