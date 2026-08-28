package x5;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u extends y5.a {
    public static final Parcelable.Creator<u> CREATOR = new w7.i(5);
    public final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public u(int i9, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.a = i9;
        this.b = account;
        this.c = i10;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        p8.k(parcel, 2, this.b, i9);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        p8.k(parcel, 4, this.d, i9);
        p8.r(parcel, q10);
    }
}
