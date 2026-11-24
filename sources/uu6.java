// default package

import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class uu6 {
    public static final Object c = new Object();
    public static final HashMap d = new HashMap();
    public final tv6 a;
    public qu6 b;

    public uu6(Context context, String str, oc8 oc8Var, w59 w59Var, w59 w59Var2, w59 w59Var3, cff cffVar, Bundle bundle, Bundle bundle2, wj0 wj0Var) {
        synchronized (c) {
            HashMap hashMap = d;
            if (hashMap.containsKey(str)) {
                throw new IllegalStateException("Session ID must be unique. ID=".concat(str));
            }
            hashMap.put(str, this);
        }
        this.a = new tv6(this, context, str, oc8Var, w59Var, w59Var2, w59Var3, cffVar, bundle, bundle2, wj0Var);
    }
}
