// default package

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class r9f extends zz4 {
    @Override // hh0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return queryLocalInterface instanceof ref ? (ref) queryLocalInterface : new ref(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override // hh0
    public final o94[] f() {
        return new o94[]{cgd.b, cgd.a};
    }

    @Override // hh0
    public final Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override // hh0
    public final int i() {
        return 13000000;
    }

    @Override // hh0
    public final String l() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // hh0
    public final String n() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // hh0
    public final boolean x() {
        return true;
    }
}
