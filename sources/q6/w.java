package q6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        wb.k(parcel, 2, this.b, i7);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        wb.k(parcel, 4, this.d, i7);
        wb.s(parcel, r10);
    }
}
