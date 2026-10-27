package y7;

import a8.gg;
import a8.hg;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class ca {
    public static r k;
    public static final w l;
    public final String a;
    public final String b;
    public final aa c;
    public final sb.k d;
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

    public ca(Context context, sb.k kVar, aa aaVar) {
        this.a = context.getPackageName();
        this.b = sb.c.a(context);
        this.d = kVar;
        this.c = aaVar;
        fa.b();
        this.g = "play-services-mlkit-image-labeling";
        sb.f a2 = sb.f.a();
        gg ggVar = new gg(this, 9);
        a2.getClass();
        this.e = sb.f.b(ggVar);
        sb.f a10 = sb.f.a();
        kVar.getClass();
        hg hgVar = new hg(kVar, 4);
        a10.getClass();
        this.f = sb.f.b(hgVar);
        w wVar = l;
        this.h = wVar.containsKey("play-services-mlkit-image-labeling") ? z6.e.d(context, (String) wVar.get("play-services-mlkit-image-labeling"), false) : -1;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final String b() {
        Task task = this.e;
        return task.isSuccessful() ? (String) task.getResult() : o6.i.c.a(this.g);
    }

    public final boolean c(m7 m7Var, long j10) {
        HashMap hashMap = this.i;
        return hashMap.get(m7Var) == null || j10 - ((Long) hashMap.get(m7Var)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}
