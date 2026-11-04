package z7;

import android.content.Context;
import b8.dg;
import b8.eg;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class da {
    public static r k;
    public static final w l;
    public final String a;
    public final String b;
    public final ba c;
    public final mb.k d;
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
        l = new w(objArr);
    }

    public da(Context context, mb.k kVar, ba baVar) {
        this.a = context.getPackageName();
        this.b = mb.c.a(context);
        this.d = kVar;
        this.c = baVar;
        ga.b();
        this.g = "play-services-mlkit-image-labeling";
        mb.f a10 = mb.f.a();
        dg dgVar = new dg(this, 9);
        a10.getClass();
        this.e = mb.f.b(dgVar);
        mb.f a11 = mb.f.a();
        kVar.getClass();
        eg egVar = new eg(kVar, 4);
        a11.getClass();
        this.f = mb.f.b(egVar);
        w wVar = l;
        this.h = wVar.containsKey("play-services-mlkit-image-labeling") ? a7.f.d(context, (String) wVar.get("play-services-mlkit-image-labeling"), false) : -1;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final String b() {
        Task task = this.e;
        return task.isSuccessful() ? (String) task.getResult() : p6.j.c.a(this.g);
    }

    public final boolean c(n7 n7Var, long j10) {
        HashMap hashMap = this.i;
        return hashMap.get(n7Var) == null || j10 - ((Long) hashMap.get(n7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}
