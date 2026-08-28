package z6;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends x5.g {
    @Override // x5.g
    public final boolean C() {
        return true;
    }

    @Override // x5.g, com.google.android.gms.common.api.c
    public final int l() {
        return 12600000;
    }

    @Override // x5.g
    public final /* bridge */ /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    @Override // x5.g
    public final String v() {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }

    @Override // x5.g
    public final String w() {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }
}
