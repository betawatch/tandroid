// default package

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class p7f extends xx4 {
    @Override // gg0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return queryLocalInterface instanceof qcf ? (qcf) queryLocalInterface : new qcf(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override // gg0
    public final f84[] f() {
        return new f84[]{bed.b, bed.a};
    }

    @Override // gg0
    public final Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override // gg0
    public final int i() {
        return 13000000;
    }

    @Override // gg0
    public final String l() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // gg0
    public final String n() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // gg0
    public final boolean x() {
        return true;
    }
}
