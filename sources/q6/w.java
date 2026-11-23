package q6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bc.k(parcel, 2, this.b, i7);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        bc.k(parcel, 4, this.d, i7);
        bc.s(parcel, r10);
    }
}
