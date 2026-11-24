// default package

import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class p59 {
    public final /* synthetic */ q59 a;

    public p59(q59 q59Var) {
        this.a = q59Var;
    }

    public static void a(String str, Bundle bundle) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    public final void b(Bundle bundle) {
        String string = bundle.getString("groupableTitle");
        q59 q59Var = this.a;
        q59Var.g = string;
        q59Var.h = bundle.getString("transferableTitle");
    }
}
