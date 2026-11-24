// default package

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* loaded from: classes.dex */
public final class tj2 {
    public static final zo j = new zo("ClearcutLogger.API", new or5(10), new xo());
    public final Context a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final i9e f;
    public final ua4 g;
    public final f8e h;
    public final q9f i;

    public tj2(Context context) {
        ua4 ua4Var = new ua4(context, j, null, new fgf((byte) 13));
        f8e f8eVar = f8e.a;
        q9f q9fVar = new q9f(context);
        this.e = -1;
        i9e i9eVar = i9e.b;
        this.f = i9eVar;
        this.a = context;
        this.b = context.getPackageName();
        int i = 0;
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.", e);
        }
        this.c = i;
        this.e = -1;
        this.d = "VISION";
        this.g = ua4Var;
        this.h = f8eVar;
        this.f = i9eVar;
        this.i = q9fVar;
    }
}
