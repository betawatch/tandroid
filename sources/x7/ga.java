package x7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class ga {
    public static s k;
    public static final x l;
    public final String a;
    public final String b;
    public final da c;
    public final qb.k d;
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

    public ga(Context context, qb.k kVar, da daVar) {
        this.a = context.getPackageName();
        this.b = qb.c.a(context);
        this.d = kVar;
        this.c = daVar;
        ja.b();
        this.g = "play-services-mlkit-image-labeling";
        qb.f a2 = qb.f.a();
        c5.w wVar = new c5.w(this, 9);
        a2.getClass();
        this.e = qb.f.b(wVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 3);
        a10.getClass();
        this.f = qb.f.b(pVar);
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

    public final boolean c(p7 p7Var, long j3) {
        HashMap hashMap = this.i;
        return hashMap.get(p7Var) == null || j3 - ((Long) hashMap.get(p7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}
