// default package

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class u5d extends xx4 {
    public final Context F;
    public final byte G;
    public final String H;
    public final boolean I;
    public final boolean J;

    /* JADX WARN: Multi-variable type inference failed */
    public u5d(int i, ey4 ey4Var, fy4 fy4Var, ntb ntbVar, Context context, Looper looper) {
        super(4, ey4Var, fy4Var, ntbVar, context, looper);
        this.F = context;
        this.G = i;
        this.H = null;
        this.I = true;
        this.J = true;
    }

    public final Bundle B() {
        String packageName = this.F.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.G);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.J);
        bundle.putString("androidPackageName", packageName);
        String str = this.H;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.I ? 1 : 0);
        return bundle;
    }

    @Override // gg0
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return queryLocalInterface instanceof wcf ? (wcf) queryLocalInterface : new wcf(iBinder);
    }

    @Override // gg0
    public final f84[] f() {
        return zjd.b;
    }

    @Override // gg0
    public final int i() {
        return 12600000;
    }

    @Override // gg0
    public final String l() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // gg0
    public final String n() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // gg0
    public final boolean x() {
        return true;
    }
}
