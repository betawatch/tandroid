package s7;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
