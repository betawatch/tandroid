// default package

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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class xka extends d05 {
    public final boolean F;
    public final oxb G;
    public final Bundle H;
    public final Integer I;

    public xka(Context context, Looper looper, oxb oxbVar, Bundle bundle, k05 k05Var, l05 l05Var) {
        super(44, k05Var, l05Var, oxbVar, context, looper);
        this.F = true;
        this.G = oxbVar;
        this.H = bundle;
        this.I = (Integer) oxbVar.h;
    }

    public final void B(q5d q5dVar) {
        try {
            this.G.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount b = "<<default account>>".equals(account.name) ? a5b.a(this.h).b() : null;
            Integer num = this.I;
            xve.h(num);
            a8d a8dVar = new a8d(2, account, num.intValue(), b);
            i7d i7dVar = (i7d) k();
            n7d n7dVar = new n7d(1, a8dVar);
            Parcel c = i7dVar.c();
            v6d.b(c, n7dVar);
            v6d.c(c, q5dVar);
            i7dVar.d(c, 12);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                q5dVar.U(new t7d(1, new ws2(8, null, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // hg0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof i7d ? (i7d) queryLocalInterface : new i7d(iBinder, "com.google.android.gms.signin.internal.ISignInService", (byte) 1);
    }

    @Override // hg0
    public final Bundle h() {
        oxb oxbVar = this.G;
        boolean equals = this.h.getPackageName().equals((String) oxbVar.d);
        Bundle bundle = this.H;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) oxbVar.d);
        }
        return bundle;
    }

    @Override // hg0
    public final int i() {
        return 12451000;
    }

    @Override // hg0
    public final String l() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // hg0
    public final String n() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // hg0
    public final boolean w() {
        return this.F;
    }
}
