package w7;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class ja {
    public static sa j;
    public static final xa k;
    public final String a;
    public final String b;
    public final ia c;
    public final jb.k d;
    public final Task e;
    public final Task f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        k = new xa(objArr);
    }

    public ja(Context context, jb.k kVar, ia iaVar) {
        new HashMap();
        this.a = context.getPackageName();
        this.b = jb.c.a(context);
        this.d = kVar;
        this.c = iaVar;
        na.b();
        this.g = "vision-common";
        jb.f a2 = jb.f.a();
        c5.t tVar = new c5.t(this, 6);
        a2.getClass();
        this.e = jb.f.b(tVar);
        jb.f a10 = jb.f.a();
        kVar.getClass();
        t7.p pVar = new t7.p(kVar, 2);
        a10.getClass();
        this.f = jb.f.b(pVar);
        xa xaVar = k;
        this.h = xaVar.containsKey("vision-common") ? y6.e.d(context, (String) xaVar.get("vision-common"), false) : -1;
    }
}
