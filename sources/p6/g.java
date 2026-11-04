package p6;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g extends q6.a {
    public static final Parcelable.Creator<g> CREATOR = new n8.g(26);
    public static final Scope[] F = new Scope[0];
    public static final m6.c[] G = new m6.c[0];
    public final String E;
    public final int a;
    public final int b;
    public final int c;
    public String d;
    public IBinder e;
    public Scope[] f;
    public Bundle h;
    public Account n;
    public m6.c[] r;
    public m6.c[] s;
    public final boolean w;
    public final int x;
    public boolean y;

    public g(int i3, int i10, int i11, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, m6.c[] cVarArr, m6.c[] cVarArr2, boolean z10, int i12, boolean z11, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? F : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        m6.c[] cVarArr3 = G;
        m6.c[] cVarArr4 = cVarArr == null ? cVarArr3 : cVarArr;
        cVarArr3 = cVarArr2 != null ? cVarArr2 : cVarArr3;
        this.a = i3;
        this.b = i10;
        this.c = i11;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i3 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i13 = a.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                i m0Var = queryLocalInterface instanceof i ? (i) queryLocalInterface : new m0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 8);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        m0 m0Var2 = (m0) m0Var;
                        Parcel N0 = m0Var2.N0(m0Var2.P0(), 2);
                        Account account3 = (Account) o7.g.a(N0, Account.CREATOR);
                        N0.recycle();
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                } catch (Throwable th2) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th2;
                }
            }
            this.n = account2;
        } else {
            this.e = iBinder;
            this.n = account;
        }
        this.f = scopeArr2;
        this.h = bundle2;
        this.r = cVarArr4;
        this.s = cVarArr3;
        this.w = z10;
        this.x = i12;
        this.y = z11;
        this.E = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        n8.g.a(this, parcel, i3);
    }
}
