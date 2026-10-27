package q7;

import a8.df;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n4.x;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class e extends p6.a {
    public static final Parcelable.Creator<e> CREATOR = new x(24);
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
            if (o6.l.l(this.b, eVar.b) && o6.l.l(Boolean.valueOf(this.c), Boolean.valueOf(eVar.c)) && o6.l.l(this.d, eVar.d) && Arrays.equals(this.a, eVar.a)) {
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
        int q5 = df.q(parcel, 20293);
        df.o(parcel, 1, this.a, i10);
        df.l(parcel, 2, this.b);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        df.k(parcel, 4, this.d, i10);
        df.r(parcel, q5);
    }
}
