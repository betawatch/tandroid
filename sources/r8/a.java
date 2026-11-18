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
import m.o3;
import q6.m;
import q6.w;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class a extends q6.h implements com.google.android.gms.common.api.c {
    public final boolean F;
    public final o3 G;
    public final Bundle H;
    public final Integer I;

    public a(Context context, Looper looper, o3 o3Var, Bundle bundle, k kVar, l lVar) {
        super(context, looper, 44, o3Var, kVar, lVar, 0);
        this.F = true;
        this.G = o3Var;
        this.H = bundle;
        this.I = (Integer) o3Var.g;
    }

    public final void B(c cVar) {
        try {
            this.G.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount b10 = "<<default account>>".equals(account.name) ? d6.b.a(this.h).b() : null;
            Integer num = this.I;
            m.h(num);
            w wVar = new w(2, account, num.intValue(), b10);
            e eVar = (e) n();
            g gVar = new g(1, wVar);
            Parcel j12 = eVar.j1();
            n7.a.b(j12, gVar);
            n7.a.c(j12, cVar);
            eVar.k1(j12, 12);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                cVar.W0(new h(1, new n6.a(8, null, null), null));
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
        o3 o3Var = this.G;
        boolean equals = this.h.getPackageName().equals((String) o3Var.d);
        Bundle bundle = this.H;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) o3Var.d);
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
