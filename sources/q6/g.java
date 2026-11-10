package q6;

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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new q4.x(11);
    public static final Scope[] E = new Scope[0];
    public static final n6.c[] F = new n6.c[0];
    public final String D;
    public final int a;
    public final int b;
    public final int c;
    public String d;
    public IBinder e;
    public Scope[] f;
    public Bundle h;
    public Account n;
    public n6.c[] r;
    public n6.c[] s;
    public final boolean w;
    public final int x;
    public boolean y;

    public g(int i7, int i10, int i11, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, n6.c[] cVarArr, n6.c[] cVarArr2, boolean z9, int i12, boolean z10, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? E : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        n6.c[] cVarArr3 = F;
        n6.c[] cVarArr4 = cVarArr == null ? cVarArr3 : cVarArr;
        cVarArr3 = cVarArr2 != null ? cVarArr2 : cVarArr3;
        this.a = i7;
        this.b = i10;
        this.c = i11;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i7 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i13 = a.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                i m0Var = queryLocalInterface instanceof i ? (i) queryLocalInterface : new m0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 9);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        m0 m0Var2 = (m0) m0Var;
                        Parcel n1 = m0Var2.n1(m0Var2.p1(), 2);
                        Account account3 = (Account) p7.g.a(n1, Account.CREATOR);
                        n1.recycle();
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
        this.w = z9;
        this.x = i12;
        this.y = z10;
        this.D = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        q4.x.a(this, parcel, i7);
    }
}
