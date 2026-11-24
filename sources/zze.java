// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zze extends xx4 {
    @Override // gg0
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        iBinder.getClass();
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        return queryLocalInterface instanceof pyd ? (pyd) queryLocalInterface : new pyd(iBinder);
    }

    @Override // gg0
    public final f84[] f() {
        return ped.c;
    }

    @Override // gg0
    public final int i() {
        return 17895000;
    }

    @Override // gg0
    public final String l() {
        return "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService";
    }

    @Override // gg0
    public final String n() {
        return "com.google.android.gms.recaptchabase.service.START";
    }

    @Override // gg0
    public final boolean p() {
        return true;
    }

    @Override // gg0
    public final boolean x() {
        return false;
    }
}
