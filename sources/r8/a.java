package r8;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.q3;
import q6.m;
import q6.w;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class a extends q6.h implements com.google.android.gms.common.api.c {
    public final boolean F;
    public final q3 G;
    public final Bundle H;
    public final Integer I;

    public a(Context context, Looper looper, q3 q3Var, Bundle bundle, k kVar, l lVar) {
        super(context, looper, 44, q3Var, kVar, lVar, 0);
        this.F = true;
        this.G = q3Var;
        this.H = bundle;
        this.I = (Integer) q3Var.g;
    }

    public final void B(c cVar) {
        try {
            this.G.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount b10 = "<<default account>>".equals(account.name) ? d6.b.a(this.h).b() : null;
            Integer num = this.I;
            m.g(num);
            w wVar = new w(2, account, num.intValue(), b10);
            e eVar = (e) n();
            g gVar = new g(1, wVar);
            Parcel J0 = eVar.J0();
            n7.a.b(J0, gVar);
            n7.a.c(J0, cVar);
            eVar.K0(J0, 12);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                cVar.A0(new h(1, new n6.a(8, null, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // q6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 12451000;
    }

    @Override // q6.d, com.google.android.gms.common.api.c
    public final boolean f() {
        return this.F;
    }

    @Override // q6.d
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof e ? (e) queryLocalInterface : new e(iBinder, "com.google.android.gms.signin.internal.ISignInService", 8);
    }

    @Override // q6.d
    public final Bundle m() {
        q3 q3Var = this.G;
        boolean equals = this.h.getPackageName().equals((String) q3Var.d);
        Bundle bundle = this.H;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) q3Var.d);
        }
        return bundle;
    }

    @Override // q6.d
    public final String o() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // q6.d
    public final String p() {
        return "com.google.android.gms.signin.service.START";
    }
}
