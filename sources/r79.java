// default package

import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class r79 {
    public final /* synthetic */ s79 a;

    public r79(s79 s79Var) {
        this.a = s79Var;
    }

    public static void a(String str, Bundle bundle) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    public final void b(Bundle bundle) {
        String string = bundle.getString("groupableTitle");
        s79 s79Var = this.a;
        s79Var.g = string;
        s79Var.h = bundle.getString("transferableTitle");
    }
}
