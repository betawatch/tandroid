package z7;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class yf {
    public static m k;
    public static final r l;
    public final String a;
    public final String b;
    public final wf c;
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
        l = new r(objArr);
    }

    public yf(Context context, rb.k kVar, wf wfVar) {
        this.a = context.getPackageName();
        this.b = rb.c.a(context);
        this.d = kVar;
        this.c = wfVar;
        bg.b();
        this.g = "subject-segmentation";
        rb.f a2 = rb.f.a();
        c5.x xVar = new c5.x(this, 10);
        a2.getClass();
        this.e = rb.f.b(xVar);
        rb.f a10 = rb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 4);
        a10.getClass();
        this.f = rb.f.b(pVar);
        r rVar = l;
        this.h = rVar.containsKey("subject-segmentation") ? y6.e.d(context, (String) rVar.get("subject-segmentation"), false) : -1;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(xf xfVar, jb jbVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (d(jbVar, elapsedRealtime)) {
            this.i.put(jbVar, Long.valueOf(elapsedRealtime));
            rb.m.a.execute(new com.google.android.gms.internal.cast.p(this, xfVar.zza(), jbVar, c(), 8));
        }
    }

    public final String c() {
        Task task = this.e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return n6.i.c.a(this.g);
    }

    public final boolean d(jb jbVar, long j10) {
        HashMap hashMap = this.i;
        return hashMap.get(jbVar) == null || j10 - ((Long) hashMap.get(jbVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}
