// default package

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class v9a {
    public static final v9a a = new v9a();
    public static final kj4 b;

    static {
        vw5 vw5Var = new vw5();
        vw5Var.a(u9a.class, u70.a);
        vw5Var.a(aaa.class, v70.a);
        vw5Var.a(t63.class, s70.a);
        vw5Var.a(tr.class, r70.a);
        vw5Var.a(yj.class, q70.a);
        vw5Var.a(mo8.class, t70.a);
        vw5Var.d = true;
        b = new kj4((Object) vw5Var, (byte) 10);
    }

    public static tr a(ji4 ji4Var) {
        ji4Var.a();
        Context context = ji4Var.a;
        context.getClass();
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String valueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        ji4Var.a();
        String str = ji4Var.c.b;
        str.getClass();
        Build.MODEL.getClass();
        Build.VERSION.RELEASE.getClass();
        packageName.getClass();
        String str2 = packageInfo.versionName;
        if (str2 == null) {
            str2 = valueOf;
        }
        Build.MANUFACTURER.getClass();
        ji4Var.a();
        mo8 f = t4.f(context);
        ji4Var.a();
        return new tr(str, new yj(packageName, str2, valueOf, f, t4.c(context)));
    }
}
