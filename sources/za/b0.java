package za;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import ji.u4;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class b0 {
    public static final b0 a = new b0();
    public static final u4 b;

    static {
        ka.d dVar = new ka.d();
        dVar.j(a0.class, g.a);
        dVar.j(j0.class, h.a);
        dVar.j(j.class, e.a);
        dVar.j(b.class, d.a);
        dVar.j(a.class, c.a);
        dVar.j(p.class, f.a);
        dVar.d = true;
        b = new u4(dVar, 2);
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
