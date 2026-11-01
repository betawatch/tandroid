package p4;

import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class p0 {
    public final /* synthetic */ q0 a;

    public p0(q0 q0Var) {
        this.a = q0Var;
    }

    public static void a(String str, Bundle bundle) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    public final void b(Bundle bundle) {
        String string = bundle.getString("groupableTitle");
        q0 q0Var = this.a;
        q0Var.g = string;
        q0Var.h = bundle.getString("transferableTitle");
    }
}
