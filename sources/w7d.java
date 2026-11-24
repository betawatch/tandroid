// default package

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class w7d extends zz4 {
    public final Context F;
    public final byte G;
    public final String H;
    public final boolean I;
    public final boolean J;

    /* JADX WARN: Multi-variable type inference failed */
    public w7d(int i, f05 f05Var, g05 g05Var, ovb ovbVar, Context context, Looper looper) {
        super(4, f05Var, g05Var, ovbVar, context, looper);
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

    @Override // hh0
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return queryLocalInterface instanceof xef ? (xef) queryLocalInterface : new xef(iBinder);
    }

    @Override // hh0
    public final o94[] f() {
        return bmd.b;
    }

    @Override // hh0
    public final int i() {
        return 12600000;
    }

    @Override // hh0
    public final String l() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // hh0
    public final String n() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // hh0
    public final boolean x() {
        return true;
    }
}
