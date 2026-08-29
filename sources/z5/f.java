package z5;

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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f extends a6.a {
    public final int a;
    public final int b;
    public final int c;
    public String d;
    public IBinder e;
    public Scope[] f;
    public Bundle h;
    public Account n;
    public w5.c[] r;
    public w5.c[] s;
    public final boolean v;
    public final int w;
    public boolean x;
    public final String y;
    public static final Parcelable.Creator<f> CREATOR = new w5.k(23);
    public static final Scope[] A = new Scope[0];
    public static final w5.c[] B = new w5.c[0];

    public f(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, w5.c[] cVarArr, w5.c[] cVarArr2, boolean z10, int i13, boolean z11, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? A : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        w5.c[] cVarArr3 = B;
        w5.c[] cVarArr4 = cVarArr == null ? cVarArr3 : cVarArr;
        cVarArr3 = cVarArr2 != null ? cVarArr2 : cVarArr3;
        this.a = i10;
        this.b = i11;
        this.c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i10 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i14 = a.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface l0Var = queryLocalInterface instanceof h ? (h) queryLocalInterface : new l0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 11);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        l0 l0Var2 = (l0) l0Var;
                        Parcel K0 = l0Var2.K0(l0Var2.M0(), 2);
                        Account account3 = (Account) y6.a.a(K0, Account.CREATOR);
                        K0.recycle();
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
        this.v = z10;
        this.w = i13;
        this.x = z11;
        this.y = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        w5.k.a(this, parcel, i10);
    }
}
