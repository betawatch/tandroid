package q7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class l1 extends q6.h {
    @Override // q6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 13000000;
    }

    @Override // q6.d
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return queryLocalInterface instanceof m1 ? (m1) queryLocalInterface : new m1(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override // q6.d
    public final n6.c[] k() {
        return new n6.c[]{c7.a.b, c7.a.a};
    }

    @Override // q6.d
    public final Bundle m() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override // q6.d
    public final String o() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // q6.d
    public final String p() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // q6.d
    public final boolean x() {
        return true;
    }
}
