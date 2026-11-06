package q7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
