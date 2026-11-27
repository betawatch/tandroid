// default package

import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zw6 {
    public static final Object c = new Object();
    public static final HashMap d = new HashMap();
    public final yx6 a;
    public vw6 b;

    public zw6(Context context, String str, dg8 dg8Var, j99 j99Var, j99 j99Var2, j99 j99Var3, sjf sjfVar, Bundle bundle, Bundle bundle2, xj0 xj0Var) {
        synchronized (c) {
            HashMap hashMap = d;
            if (hashMap.containsKey(str)) {
                throw new IllegalStateException("Session ID must be unique. ID=".concat(str));
            }
            hashMap.put(str, this);
        }
        this.a = new yx6(this, context, str, dg8Var, j99Var, j99Var2, j99Var3, sjfVar, bundle, bundle2, xj0Var);
    }
}
