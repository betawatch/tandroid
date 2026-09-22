package za;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class b0 {
    public static final b0 a = new b0();
    public static final ka.c b;

    static {
        ka.e eVar = new ka.e();
        eVar.m(a0.class, g.a);
        eVar.m(j0.class, h.a);
        eVar.m(j.class, e.a);
        eVar.m(b.class, d.a);
        eVar.m(a.class, c.a);
        eVar.m(p.class, f.a);
        eVar.d = true;
        b = new ka.c(eVar, 0);
    }

    public static b a(k9.h hVar) {
        hVar.a();
        Context context = hVar.a;
        kotlin.jvm.internal.i.d(context, "firebaseApp.applicationContext");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String valueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        hVar.a();
        String str = hVar.c.b;
        kotlin.jvm.internal.i.d(str, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.i.d(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.i.d(RELEASE, "RELEASE");
        kotlin.jvm.internal.i.d(packageName, "packageName");
        String str2 = packageInfo.versionName;
        String str3 = str2 == null ? valueOf : str2;
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.i.d(MANUFACTURER, "MANUFACTURER");
        hVar.a();
        p b10 = q.b(context);
        hVar.a();
        return new b(str, new a(packageName, str3, valueOf, b10, q.a(context)));
    }
}
