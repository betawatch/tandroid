package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class t0 extends o6.a {
    public static final Parcelable.Creator<t0> CREATOR = new l0(8);
    public final byte a;
    public final byte b;
    public final String c;

    public t0(byte b10, byte b11, String str) {
        this.a = b10;
        this.b = b11;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t0.class != obj.getClass()) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.a == t0Var.a && this.b == t0Var.b && this.c.equals(t0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((this.a + 31) * 31) + this.b) * 31);
    }

    public final String toString() {
        return a1.g.r(i0.a.m("AmsEntityUpdateParcelable{, mEntityId=", this.a, ", mAttributeId=", this.b, ", mValue='"), this.c, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        w7.h0.l(parcel, 4, this.c);
        w7.h0.r(parcel, q6);
    }
}
