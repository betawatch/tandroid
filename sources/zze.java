// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
