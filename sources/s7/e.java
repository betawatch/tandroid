package s7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
import q4.x;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new x(16);
    public final g[] a;
    public final String b;
    public final boolean c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.a = gVarArr;
        this.b = str;
        this.c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (q6.m.k(this.b, eVar.b) && q6.m.k(Boolean.valueOf(this.c), Boolean.valueOf(eVar.c)) && q6.m.k(this.d, eVar.d) && Arrays.equals(this.a, eVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Boolean.valueOf(this.c), this.d, Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.o(parcel, 1, this.a, i7);
        yb.l(parcel, 2, this.b);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        yb.k(parcel, 4, this.d, i7);
        yb.s(parcel, r10);
    }
}
