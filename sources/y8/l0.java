package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class l0 extends o6.a implements x8.h {
    public static final Parcelable.Creator<l0> CREATOR = new c(29);
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public l0(int i10, String str, String str2, boolean z10) {
        this.a = str;
        this.b = str2;
        this.c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l0) {
            return ((l0) obj).a.equals(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder w9 = a1.g.w("Node{", this.b, ", id=", this.a, ", hops=");
        w9.append(this.c);
        w9.append(", isNearby=");
        w9.append(this.d);
        w9.append("}");
        return w9.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.a);
        w7.f0.l(parcel, 3, this.b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        w7.f0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.f0.r(parcel, q6);
    }
}
