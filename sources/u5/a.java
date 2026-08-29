package u5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.internal.clearcut.d2;
import com.google.android.gms.internal.clearcut.r1;
import com.google.android.gms.internal.clearcut.v0;

/* loaded from: classes.dex */
public final class a {
    public static final e j = new e("ClearcutLogger.API", new b6.b(14), new d());
    public final Context a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final r1 f;
    public final v0 g;
    public final g6.a h;
    public final d2 i;

    public a(Context context) {
        v0 v0Var = new v0(context, j, null, new com.google.android.gms.common.api.internal.a());
        d2 d2Var = new d2(context);
        this.e = -1;
        r1 r1Var = r1.b;
        this.f = r1Var;
        this.a = context;
        this.b = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.wtf("ClearcutLogger", "This can't happen.", e10);
        }
        this.c = i10;
        this.e = -1;
        this.d = "VISION";
        this.g = v0Var;
        this.h = g6.a.a;
        this.f = r1Var;
        this.i = d2Var;
    }
}
