package v0;

import android.os.Bundle;
import n7.a1;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class b {
    public final Bundle a;
    public final Bundle b;
    public final a1 c;

    public b(Bundle bundle, Bundle bundle2, a1 a1Var) {
        this.a = bundle;
        this.b = bundle2;
        this.c = a1Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
