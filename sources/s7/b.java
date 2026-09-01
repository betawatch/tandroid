package s7;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import j8.p;
import m.r3;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class b extends b6.g {
    public final Context R;
    public final int S;
    public final String T;
    public final int U;
    public final boolean V;

    public b(Context context, Looper looper, r3 r3Var, k kVar, l lVar, int i10) {
        super(context, looper, 4, r3Var, kVar, lVar, 0);
        this.R = context;
        this.S = i10;
        this.T = null;
        this.U = 1;
        this.V = true;
    }

    @Override // b6.g
    public final boolean C() {
        return true;
    }

    public final Bundle G() {
        String packageName = this.R.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.S);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.V);
        bundle.putString("androidPackageName", packageName);
        String str = this.T;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.U);
        return bundle;
    }

    @Override // b6.g, com.google.android.gms.common.api.c
    public final int k() {
        return 12600000;
    }

    @Override // b6.g
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder);
    }

    @Override // b6.g
    public final y5.c[] r() {
        return p.c;
    }

    @Override // b6.g
    public final String v() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // b6.g
    public final String w() {
        return "com.google.android.gms.wallet.service.BIND";
    }
}
