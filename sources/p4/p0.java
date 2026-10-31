package p4;

import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
