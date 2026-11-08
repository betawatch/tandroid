package v0;

import android.os.Bundle;
import java.util.Set;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class h {
    public final String a;
    public final Bundle b;
    public final Bundle c;
    public final Set d;

    public h(String str, Bundle bundle, Bundle bundle2, boolean z9, Set set) {
        this.a = str;
        this.b = bundle;
        this.c = bundle2;
        this.d = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z9);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z9);
        bundle.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 100);
        bundle2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 100);
    }
}
