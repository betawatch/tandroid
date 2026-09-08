package x7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class fa {
    public static s k;
    public static final x l;
    public final String a;
    public final String b;
    public final ca c;
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

    public fa(Context context, qb.k kVar, ca caVar) {
        this.a = context.getPackageName();
        this.b = qb.c.a(context);
        this.d = kVar;
        this.c = caVar;
        ia.b();
        this.g = "play-services-mlkit-image-labeling";
        qb.f a2 = qb.f.a();
        c5.x xVar = new c5.x(this, 9);
        a2.getClass();
        this.e = qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 3);
        a10.getClass();
        this.f = qb.f.b(pVar);
        x xVar2 = l;
        this.h = xVar2.containsKey("play-services-mlkit-image-labeling") ? y6.e.d(context, (String) xVar2.get("play-services-mlkit-image-labeling"), false) : -1;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final String b() {
        Task task = this.e;
        return task.isSuccessful() ? (String) task.getResult() : n6.i.c.a(this.g);
    }

    public final boolean c(o7 o7Var, long j3) {
        HashMap hashMap = this.i;
        return hashMap.get(o7Var) == null || j3 - ((Long) hashMap.get(o7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}
