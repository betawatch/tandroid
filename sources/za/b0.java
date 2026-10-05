package za;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class b0 {
    public static final b0 a = new b0();
    public static final k2.e b;

    static {
        ka.d dVar = new ka.d();
        dVar.a(a0.class, g.a);
        dVar.a(j0.class, h.a);
        dVar.a(j.class, e.a);
        dVar.a(b.class, d.a);
        dVar.a(a.class, c.a);
        dVar.a(p.class, f.a);
        dVar.d = true;
        b = new k2.e(dVar, 1);
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
