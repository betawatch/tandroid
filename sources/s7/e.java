package s7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import q4.x;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
            if (q6.m.l(this.b, eVar.b) && q6.m.l(Boolean.valueOf(this.c), Boolean.valueOf(eVar.c)) && q6.m.l(this.d, eVar.d) && Arrays.equals(this.a, eVar.a)) {
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
        int r10 = bc.r(parcel, 20293);
        bc.o(parcel, 1, this.a, i7);
        bc.l(parcel, 2, this.b);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        bc.k(parcel, 4, this.d, i7);
        bc.s(parcel, r10);
    }
}
