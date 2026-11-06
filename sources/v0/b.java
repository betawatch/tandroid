package v0;

import android.os.Bundle;
import m4.d0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class b {
    public final Bundle a;
    public final Bundle b;
    public final d0 c;

    public b(Bundle bundle, Bundle bundle2, d0 d0Var) {
        this.a = bundle;
        this.b = bundle2;
        this.c = d0Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
