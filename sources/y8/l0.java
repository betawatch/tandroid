package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.l(parcel, 2, this.a);
        w7.g0.l(parcel, 3, this.b);
        w7.g0.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        w7.g0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.g0.r(parcel, q6);
    }
}
