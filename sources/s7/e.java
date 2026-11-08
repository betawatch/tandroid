package s7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import q4.x;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new x(16);
    public final g[] a;
    public final String b;
    public final boolean c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z9, Account account) {
        this.a = gVarArr;
        this.b = str;
        this.c = z9;
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
        int r10 = xb.r(parcel, 20293);
        xb.o(parcel, 1, this.a, i7);
        xb.l(parcel, 2, this.b);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        xb.k(parcel, 4, this.d, i7);
        xb.s(parcel, r10);
    }
}
