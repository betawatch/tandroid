package s7;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class b extends q6.h {
    @Override // q6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 12600000;
    }

    @Override // q6.d
    public final /* bridge */ /* synthetic */ IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    @Override // q6.d
    public final String o() {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }

    @Override // q6.d
    public final String p() {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }

    @Override // q6.d
    public final boolean x() {
        return true;
    }
}
