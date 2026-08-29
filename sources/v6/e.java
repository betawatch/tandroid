package v6;

import android.os.IBinder;
import android.os.IInterface;
import z5.g;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e extends g {
    @Override // z5.g
    public final boolean C() {
        return true;
    }

    @Override // z5.g, com.google.android.gms.common.api.c
    public final int k() {
        return 12451000;
    }

    @Override // z5.g
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new d(iBinder);
    }

    @Override // z5.g
    public final w5.c[] r() {
        return b.b;
    }

    @Override // z5.g
    public final String v() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // z5.g
    public final String w() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }
}
