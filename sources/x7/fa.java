package x7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class fa {
    public static s k;
    public static final x l;
    public final String a;
    public final String b;
    public final ca c;
    public final rb.k d;
    public final Task e;
    public final Task f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();
    public final HashMap j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        l = new x(objArr);
    }

    public fa(Context context, rb.k kVar, ca caVar) {
        this.a = context.getPackageName();
        this.b = rb.c.a(context);
        this.d = kVar;
        this.c = caVar;
        ia.b();
        this.g = "play-services-mlkit-image-labeling";
        rb.f a2 = rb.f.a();
        c5.y yVar = new c5.y(this, 8);
        a2.getClass();
        this.e = rb.f.b(yVar);
        rb.f a10 = rb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 3);
        a10.getClass();
        this.f = rb.f.b(pVar);
        x xVar = l;
        this.h = xVar.containsKey("play-services-mlkit-image-labeling") ? y6.e.d(context, (String) xVar.get("play-services-mlkit-image-labeling"), false) : -1;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final String b() {
        Task task = this.e;
        return task.isSuccessful() ? (String) task.getResult() : n6.i.c.a(this.g);
    }

    public final boolean c(o7 o7Var, long j10) {
        HashMap hashMap = this.i;
        return hashMap.get(o7Var) == null || j10 - ((Long) hashMap.get(o7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}
