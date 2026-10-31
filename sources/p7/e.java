package p7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.i(23);
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
            if (n6.l.k(this.b, eVar.b) && n6.l.k(Boolean.valueOf(this.c), Boolean.valueOf(eVar.c)) && n6.l.k(this.d, eVar.d) && Arrays.equals(this.a, eVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Boolean.valueOf(this.c), this.d, Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.o(parcel, 1, this.a, i10);
        h0.l(parcel, 2, this.b);
        h0.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        h0.k(parcel, 4, this.d, i10);
        h0.r(parcel, q6);
    }
}
