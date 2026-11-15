package q6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR = new q4.x(5);
    public final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public w(int i7, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.a = i7;
        this.b = account;
        this.c = i10;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        yb.k(parcel, 2, this.b, i7);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        yb.k(parcel, 4, this.d, i7);
        yb.s(parcel, r10);
    }
}
