package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j0 extends o6.a {
    public static final Parcelable.Creator<j0> CREATOR = new c(29);
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public j0(int i10, String str, String str2, boolean z10) {
        this.a = str;
        this.b = str2;
        this.c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j0) {
            return ((j0) obj).a.equals(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder v = a1.g.v("Node{", this.b, ", id=", this.a, ", hops=");
        v.append(this.c);
        v.append(", isNearby=");
        v.append(this.d);
        v.append("}");
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.l(parcel, 2, this.a);
        w7.h0.l(parcel, 3, this.b);
        w7.h0.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        w7.h0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.h0.r(parcel, q6);
    }
}
