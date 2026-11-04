package p6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w extends q6.a {
    public static final Parcelable.Creator<w> CREATOR = new n8.g(20);
    public final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public w(int i3, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.a = i3;
        this.b = account;
        this.c = i10;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        j8.a.l(parcel, 2, this.b, i3);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.c);
        j8.a.l(parcel, 4, this.d, i3);
        j8.a.t(parcel, s6);
    }
}
