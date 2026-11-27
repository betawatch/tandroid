// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class q4f extends d05 {
    @Override // hg0
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        iBinder.getClass();
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        return queryLocalInterface instanceof f3e ? (f3e) queryLocalInterface : new f3e(iBinder);
    }

    @Override // hg0
    public final a94[] f() {
        return gjd.c;
    }

    @Override // hg0
    public final int i() {
        return 17895000;
    }

    @Override // hg0
    public final String l() {
        return "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService";
    }

    @Override // hg0
    public final String n() {
        return "com.google.android.gms.recaptchabase.service.START";
    }

    @Override // hg0
    public final boolean p() {
        return true;
    }

    @Override // hg0
    public final boolean x() {
        return false;
    }
}
