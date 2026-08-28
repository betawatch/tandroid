package t6;

import android.os.IBinder;
import android.os.IInterface;
import x5.g;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends g {
    @Override // x5.g
    public final boolean C() {
        return true;
    }

    @Override // x5.g, com.google.android.gms.common.api.c
    public final int l() {
        return 12451000;
    }

    @Override // x5.g
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new d(iBinder);
    }

    @Override // x5.g
    public final u5.c[] r() {
        return b.b;
    }

    @Override // x5.g
    public final String v() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // x5.g
    public final String w() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }
}
