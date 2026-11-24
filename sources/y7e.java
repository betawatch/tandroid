// default package

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class y7e extends b4 {
    public static final Parcelable.Creator<y7e> CREATOR = new t0e(19);
    public final iue[] a;
    public final String b;
    public final boolean c;
    public final Account d;

    public y7e(iue[] iueVarArr, String str, boolean z, Account account) {
        this.a = iueVarArr;
        this.b = str;
        this.c = z;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y7e) {
            y7e y7eVar = (y7e) obj;
            if (fse.a(this.b, y7eVar.b) && fse.a(Boolean.valueOf(this.c), Boolean.valueOf(y7eVar.c)) && fse.a(this.d, y7eVar.d) && Arrays.equals(this.a, y7eVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Boolean.valueOf(this.c), this.d, Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.o(parcel, 1, this.a, i);
        mve.l(parcel, 2, this.b);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        mve.k(parcel, 4, this.d, i);
        mve.s(parcel, r);
    }
}
